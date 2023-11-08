package com.demo.beans;

import java.util.Date;

public class Perishable extends Product{
//int id, String name, String type, double price
	Date mfd;
	public Perishable(){
		super();
		setType("Perishable");
	}
	public Perishable(int id, String name, double price, Date mfd) {
		super(id,name,"Perishable",price);
		this.mfd = mfd;
	}
	public Date getMfd() {
		return mfd;
	}

	public void setMfd(Date mfd) {
		this.mfd = mfd;
	}

	@Override
	public String toString() {
		return super.toString()+"Perishable [mfd=" + mfd + "]";
	}
	
}
