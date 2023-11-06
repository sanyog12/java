package com.demo.beans;

import java.util.Date;

public class ContractEmp extends Employee{
 private int noOfHrs;
 private int ratePerHr;
 
public ContractEmp() {
	super();
}

public ContractEmp(int id, String name, String mobno, String emailId, String department, String designation,
	Date doj,int noOfHrs, int ratePerHr) {
	super(id,name,mobno,emailId,department,designation,doj);
	this.noOfHrs = noOfHrs;
	this.ratePerHr = ratePerHr;
}

public int getNoOfHrs() {
	return noOfHrs;
}
public void setNoOfHrs(int noOfHrs) {
	this.noOfHrs = noOfHrs;
}
public int getRatePerHr() {
	return ratePerHr;
}
public void setRatePerHr(int ratePerHr) {
	this.ratePerHr = ratePerHr;
}
@Override
public String toString() {
	return super.toString()+"ContractEmp [noOfHrs=" + noOfHrs + ", ratePerHr=" + ratePerHr + "]";
}
 
}
