package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course300")

public class Course {

	@Id
	int id;
	String courseName;
	int duration;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public Course(int id, String courseName, int duration) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.duration = duration;
	}
	
	
}
