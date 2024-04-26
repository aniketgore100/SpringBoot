package com.springrest.demo.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.demo.entities.Courses;

@Service
public class ServiceImple implements CorseServices{

	List<Courses> L;
	public ServiceImple() {
		L = new ArrayList<>();
		L.add(new Courses(1, "Java", "basic java "));
		L.add(new Courses(2, "CPP", "basic CPP "));
		L.add(new Courses(3, "JavaScript", "basic JavaScript "));
		L.add(new Courses(4, "ruby", "basic ruby "));
		L.add(new Courses(5, "c#", "basic ruby "));
		L.add(new Courses(6, "machine learning", "basic machine learning# "));
	}
	
	@Override
	public List<Courses> getCourses() {
        
		return L;
	}

	@Override
	public Courses getCourse(Long Cid) {
		Courses c = null;
		for(Courses i  : L) {
			if((i.getId() == Cid)) {
				c = i;
				break;
			}
		}
		  if (c == null) {
		        System.out.println("Data not found");
		    }
		    return c;
	}

	@Override
	public Courses addCourse(Courses b) {
	    L.add(b);
		return b;
	}

	@Override
	public Courses delete(long delId) {
		  Courses c = null;
		    Iterator<Courses> iterator = L.iterator();
		    while (iterator.hasNext()) {
		        Courses i = iterator.next();
		        if (i.getId() == delId) {
		            c = i;
		            iterator.remove(); // Remove the current element using iterator's remove method
		            break;
		        }
		    }
		    return c;
	

}
}
