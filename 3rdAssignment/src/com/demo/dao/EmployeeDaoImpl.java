package com.demo.dao;
import com.demo.beans.*;

import java.util.*;

public class EmployeeDaoImpl implements EmployeeDao{
	
	static List<Employee> elist;
	static {


		elist = new ArrayList<>();
		elist.add(new SalariedEmp(1,"salemp1","234123422","email@gamil.com","Salaried","Manager",new Date(),1000));
		elist.add(new SalariedEmp(2,"salemp2","345232345","email@gamil.com","Salaried","Assistant",new Date(),900));
		elist.add(new ContractEmp(3,"Contemp1","42342223","email@gamil.com","Contract","Manager",new Date(),10,120));
		elist.add(new ContractEmp(4,"Contemp2","53453444","email@gamil.com","Contract","Assistant",new Date(),90,23));
		elist.add(new Vendors(4,"Contemp2","53453444","email@gamil.com","Contract","Assistant",new Date(),90,23));
		
	}
	
}
