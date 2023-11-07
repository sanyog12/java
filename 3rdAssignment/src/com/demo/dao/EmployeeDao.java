package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	Employee getById(int id);

	void displayAll();
	

	void salOfParticularDesgs(String name);

	void searchByNames(String name1);

}
