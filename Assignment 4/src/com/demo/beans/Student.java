package com.demo.beans;

import java.util.Date;

public class Student {
// sid,name,bdate,degree, marks
	private int id;
	private String name;
	private Date bdate;
	private String degree;
	private int marks;
	
	
	public Student() {
		
	}
	
	public Student(int id, String name, Date bdate, String degree, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.bdate = bdate;
		this.degree = degree;
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
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", bdate=" + bdate + ", degree=" + degree + ", marks=" + marks
				+ "]";
	}
	
}
