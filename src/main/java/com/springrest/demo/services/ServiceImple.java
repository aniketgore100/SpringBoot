package com.springrest.demo.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.demo.dao.DaoInterface;
import com.springrest.demo.entities.Courses;

@Service
public class ServiceImple implements CorseServices{


	@Autowired
	private DaoInterface d;
	
	public ServiceImple() {

	}
	
	@Override
	public List<Courses> getCourses() {
		return d.findAll();
	}

	@Override
	public Courses getCourse(Long Cid) {
		   Courses course = d.getReferenceById(Cid);
		    Hibernate.initialize(course); // Initialize the entity
		    return course;
	}

	@Override
	public Courses addCourse(Courses b) {
		return d.save(b);
	}
	
	public Courses update(Courses c) {
		d.save(c);
		return  c;
	}

	@Override
	public void deleteCo(long delId) {
		 Courses e = d.getReferenceById(delId);
		 d.delete(e);
}
}
