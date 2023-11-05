package com.friends;

import java.util.*;

public class Friend {
	private int id;
	private String name;
	private String lastname;
	//important: we have ser the list 
	private List<String> hobbieList ;
	private String mobno;
	private Date dateOfBirth;
	private String address;
	
	
	public Friend() {
		
	}
	//constructor
	public Friend(int id, String name, String lastname, List<String> hobbieList, String mobno, Date dateOfBirth,
	String address) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.hobbieList = hobbieList;
		this.mobno = mobno;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public List<String> getHobbiesList() {
		return hobbieList;
	}
	public void setHobbiesList(List<String> hobbieList) {
		this.hobbieList = hobbieList;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//check if it has hobby
    public boolean hasHobby(String hobby) {
        return hobbieList.contains(hobby);
    }

	@Override
	public String toString() {
		return "Friend [id=" + id + ", name=" + name + ", lastname=" + lastname + ", hobbies="
				+ hobbieList + ", mobno=" + mobno + ", dateOfBirth=" + dateOfBirth + ", address="
				+ address + "]";
	}
	
	

}
