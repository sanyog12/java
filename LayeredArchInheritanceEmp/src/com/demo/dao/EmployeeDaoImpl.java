package com.demo.dao;

import com.demo.beans.*;

import java.util.*;

public class EmployeeDaoImpl implements EmployeeDao {

	static List<Employee> elist;
	static {

		elist = new ArrayList<>();
		elist.add(
				new SalariedEmp(1, "salemp1", "234123422", "email@gamil.com", "Salaried", "Manager", new Date(), 1000));
		elist.add(new SalariedEmp(2, "salemp2", "345232345", "email@gamil.com", "Salaried", "Assistant", new Date(),
				900));
		elist.add(new ContractEmp(3, "Contemp1", "42342223", "email@gamil.com", "Contract", "Manager", new Date(), 10,
				120));
		elist.add(new ContractEmp(4, "Contemp2", "53453444", "email@gamil.com", "Contract", "Assistant", new Date(), 90,
				23));
		elist.add(
				new Vendors(4, "Contemp2", "53453444", "email@gamil.com", "Contract", "Assistant", new Date(), 90, 23));

	}

	@Override
	public void save(Employee e) {
		elist.add(e);
	}

	@Override
	public Employee getById(int id) {
		Employee e = new Employee();
		System.out.println("---------");
		for (int i = 0; i < elist.size(); i++) {
			if (elist.get(i).getId() == id) {
				System.out.println(elist.get(i).getId());
				e = elist.get(i);
				return e;
			}
		}
		return null;

	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		for (Employee e : elist)
			System.out.println(e);

	}

	@Override
	public void salOfParticularDesgs(String name) {
		// TODO Auto-generated method stub
		double sal = 0;
		for (Employee e : elist) {
			
			if (e.getDesignation().equals(name)) {
				if (e instanceof SalariedEmp) {
					sal = sal + ((SalariedEmp) e).getBasicSalary();
				}
				else if (e instanceof ContractEmp) {
					sal = sal + ((ContractEmp) e).getRatePerHr();
				}
				else {
					sal = sal + ((Vendors) e).getAmount();
				}
			}

		}
		System.out.println("Salary : "+sal);

	}

	@Override
	public void searchByNames(String name1) {
		// TODO Auto-generated method stub
		for (Employee e : elist) {
			if (e.getName().equals(name1)) {
				System.out.print(e);
			}
		}

	}

}
