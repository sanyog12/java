package com.demo.beans;

import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private String mobno;
	private String emailId;
	private String department;
	private String designation;
	private Date doj;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String mobno, String emailId, String department, String designation,
			Date doj) {
		super();
		this.id = id;
		this.name = name;
		this.mobno = mobno;
		this.emailId = emailId;
		this.department = department;
		this.designation = designation;
		this.doj = doj;
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
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobno=" + mobno + ", emailId=" + emailId + ", department="
				+ department + ", designation=" + designation + ", doj=" + doj + "]";
	}
	
	

}
