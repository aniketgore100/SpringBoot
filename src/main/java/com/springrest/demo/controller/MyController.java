package com.springrest.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@DeleteMapping("/courses/{Cid}")
	public Courses delete(@PathVariable String Cid) {
		return this.service.delete(Long.parseLong(Cid));
	}
}
