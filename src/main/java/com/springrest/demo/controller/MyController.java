package com.springrest.demo.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.demo.entities.Courses;
import com.springrest.demo.services.CorseServices;

@RestController
public class MyController {
	
	@Autowired
	private CorseServices service;
	
	
	@GetMapping("/")
	public String welcome() {
		return "welcome to course";
	}
	
	// get all courses
	@GetMapping("/courses")
	public List<Courses>getCourses(){
		return this.service.getCourses();
	}
	
	@GetMapping("/courses/{Cid}")
	public Courses getCourse(@PathVariable String Cid){
		return this.service.getCourse(Long.parseLong(Cid));
	}
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses c) {
		return this.service.addCourse(c);
	}
	
	@PutMapping("/courses")
	public Courses update(@RequestBody Courses c) {
		return this.service.update(c);
	}
	
	
	@DeleteMapping("/courses/{Cid}")
	public ResponseEntity<HttpStatus>deleteCo(@PathVariable String Cid){
		try {
			this.service.deleteCo(Long.parseLong(Cid));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}




























