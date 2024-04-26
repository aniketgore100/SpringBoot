package com.springrest.demo.entities;

public class Courses {
	private long Id;
	private String Title;
	private String Desc;
	
	
	
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Courses(long id, String title, String desc) {
		super();
		Id = id;
		Title = title;
		Desc = desc;
	}



	public long getId() {
		return Id;
	}



	public void setId(long id) {
		Id = id;
	}



	public String getTitle() {
		return Title;
	}


       
	
	
	 
	public void setTitle(String title) {
		Title = title;
	}



	public String getDesc() {
		return Desc;
	}



	public void setDesc(String desc) {
		Desc = desc;
	}



	@Override
	public String toString() {
		return "Courses [Id=" + Id + ", Title=" + Title + ", Desc=" + Desc + "]";
	}
	
	
	
}
