package com.springrest.demo.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.demo.entities.Courses;

public interface CorseServices {
	public List<Courses> getCourses();
	public Courses getCourse(Long Cid);
	public Courses addCourse(Courses c);
	public Courses delete(long delId);
}
