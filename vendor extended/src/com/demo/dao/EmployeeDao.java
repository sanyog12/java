package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	List<Employee> getAll();

	Employee getById(int id);

	boolean removeById(int id);

	boolean updateSalById(int id, double sal);

	boolean updateAmtById(int id, double amount);

	boolean updateCharById(int id, double charges);
	List<Employee> sortByName();

	

}
