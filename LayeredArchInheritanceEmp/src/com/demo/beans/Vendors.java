 package com.demo.beans;

import java.util.Date;

public class Vendors extends Employee {

	private int noOfEmp;
	private double amount;
	
	
	
	public Vendors(int id, String name, String mobno, String emailId, String department, String designation,
			Date doj,int noOfEmp, double amount) {
		super(id,name,mobno,emailId,department,designation,doj);
		this.noOfEmp = noOfEmp;
		this.amount = amount;
	}
	public int getNoOfEmp() {
		return noOfEmp;
	}
	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return super.toString()+"Vendors [noOfEmp=" + noOfEmp + ", amount=" + amount + "]";
	}
	
	
	
}
