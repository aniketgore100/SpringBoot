package com.springrest.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Courses {
    
    @jakarta.persistence.Id
    private long Id;
    private String Title;
    private String Description; // Renamed from Desc
    
    public Courses() {
        super();
    }

    public Courses(long id, String title, String description) {
        super();
        Id = id;
        Title = title;
        Description = description;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "Courses [Id=" + Id + ", Title=" + Title + ", Description=" + Description + "]";
    }
}
