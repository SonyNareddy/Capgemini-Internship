package com.capg.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NonTech extends Courses{
	
	@Value("BehaviouralScience")
	private String courseName;

	public NonTech() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NonTech(String courseName) {
		super();
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "NonTech [courseName=" + courseName + "]";
	}
	
}
