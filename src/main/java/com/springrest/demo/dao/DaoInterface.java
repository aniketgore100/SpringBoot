package com.springrest.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.demo.entities.Courses;

public interface DaoInterface extends JpaRepository<Courses, Long>{
	
}
