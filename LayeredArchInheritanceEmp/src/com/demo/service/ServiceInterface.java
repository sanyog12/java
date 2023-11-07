package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface ServiceInterface {

	void display();

	void addNewEmployee(int ch);

	void searchById();

	void salOfParticularDesg(String name);

	void display5Emp();

	Employee searchById(int id);

	void searchByName(String name1);

}
