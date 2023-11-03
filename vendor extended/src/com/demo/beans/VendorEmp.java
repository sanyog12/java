package com.demo.beans;

import java.time.LocalDate;

public class VendorEmp extends Employee{
	private int workers;
	double amount;
	
	
	public VendorEmp() {
		super();
	}

	public VendorEmp(int pid, String pname, String mobile, String email,String dept, String desg, LocalDate doj,int workers, double amount)
	{
		super(pid,pname,mobile,email,dept,desg,doj);
		this.workers = workers;
		this.amount = amount;
	}

	public int getWorkers() {
		return workers;
	}

	public void setWorkers(int workers) {
		this.workers = workers;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return super.toString()+"VendorEmp [workers=" + workers + ", amount=" + amount + "]";
	}

	

}
