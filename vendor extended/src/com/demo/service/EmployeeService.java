package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addnewEmployee(int ch);

	List<Employee> displayAll();

	Employee displayById(int id);

	boolean deleteById(int id);

	boolean modifySalById(int id, double sal);
	
	boolean modifyCharById(int id, double charges);
	
	
	boolean modifyAmtById(int id, double amount);
	

	List<Employee> sortByName();

}
