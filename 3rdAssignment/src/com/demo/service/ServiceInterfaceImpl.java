package com.demo.service;

import java.util.*;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;

public  class ServiceInterfaceImpl implements ServiceInterface {
	private EmployeeDao  edao = new EmployeeDaoImpl() {
		
	}
	@Override
	public void addNewEmployee(int ch) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name");
		String name = sc.nextLine();
		System.out.println("enter the mobile number");
		String mobno = sc.nextLine();
		System.out.println("enter the email");
		String email = sc.next();
		System.out.println("enter the department");
		String department = sc.next();
		System.out.println("enter the designaion");
		String designation = sc.next();
		System.out.println("enter the date of joining yyyy-MM-dd");
		String date = sc.next();
		Employee e = null;
		switch(ch) {
		case 1:
			System.out.println("enter the basic salary");
			double salary = sc.nextInt();
			sc.nextLine();
			e = new SalariedEmployee(id);
			break;
			
		case 2:
			System.out.println("enter the name");
			break;
		case 3:
			System.out.println("enter the name");
			break;
		}
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void searchById() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salOfParticularDesg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display5Emp() {
		// TODO Auto-generated method stub
		
	}
	
}
