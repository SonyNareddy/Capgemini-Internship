package com.capg.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("${a.studentId}")
	private int id;
	
	@Value("${a.studentName}")
	private String name;
	
	@Value("${a.studentMarks}")
	private int marks;
	
	@Autowired
	@Qualifier("techCourse")
	private Courses courses;
	
	@Autowired
	private Address address;
	
	public Student() {
		super();
	}
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", courses=" + courses + ", address="
				+ address + "]";
	}
	
	public void doInit()
	{
		System.out.println(" inside doInit");
	}
	public void doEnd()
	{
		System.out.println("inside doEnd");
	}
}
