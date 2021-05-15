package com.capg.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capg.beans.Student;


public class MainClass {
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-factory.xml");
		
		Student student = (Student)spring.getBean("student2");
		
		System.out.println(student);
		System.out.println(student.getMarks());
		System.out.println(student.getCourses().getCourseId());
		System.out.println(student.getCourses().getCourseName());
		 
	}
}
