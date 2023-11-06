package com.demo.beans;

import java.util.Date;

public class SalariedEmp extends Employee{
	private double basicSalary;
	
	
	public SalariedEmp(){
		
	}
	public SalariedEmp(int id, String name, String mobno, String emailId, String department, String designation,
			Date doj,double basicSalary) {
		super(id,name,mobno,emailId,department,designation,doj);
		this.basicSalary = basicSalary;
	}
	
	//Basic+DA+HRA-pf
	
	//DA-10% of basic
	//HRA – 15% of basic
	//Pf – 12% of Basic
	public double DA() {
		return 0.10*basicSalary;
	}
	
	public double HRA() {
		return 0.15*basicSalary;
	}
	
	public double PF() {
		return 0.12*basicSalary;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [basicSalary=" + basicSalary + "DA=" + DA() + "HRA="+HRA()+"PF="+PF()+ "]";
	}
	
	
}
