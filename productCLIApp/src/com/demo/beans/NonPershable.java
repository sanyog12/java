package com.demo.beans;

import java.util.Date;

public class NonPershable extends Product{
private Date exd;
private String category;

public NonPershable() {
	super();
	setType("nonPerishable");
}

//int id, String name, String type, double price,Date mfd
public NonPershable(int id,String name,double price,Date exd,String category) {
	super(id,name,"nonPerishable",price);
	this.exd = exd;
	this.category = category;
}


public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public Date getExd() {
	return exd;
}



public void setExd(Date exd) {
	this.exd = exd;
}



@Override
public String toString() {
	return super.toString()+"NonPershable [exd=" + exd + "]";
}

}
