package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.VendorEmp;

public class EmployeeDaoImpl implements EmployeeDao{
     static List<Employee> elist;
     static {
    	elist=new ArrayList<>();
 		elist.add(new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
 		elist.add(new SalariedEmp(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		elist.add(new ContractEmployee(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		elist.add(new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
 		elist.add(new VendorEmp(16,"Sudarshan","332","sudarshan@gmail.com","clerk","salesmanager",LocalDate.of(2010, 12,10),40,5000));
     }
	//@Override
	public void save(Employee e) {
		elist.add(e);
		
	}
	@Override
	public List<Employee> getAll() {
		return  elist;
	}
	@Override
	public Employee getById(int id) {
		int pos=elist.indexOf(new SalariedEmp(id));
		if(pos!=-1) {
			return elist.get(pos);
		}
		return null;
	}
	@Override
	public boolean removeById(int id) {
		return elist.remove(new SalariedEmp(id));
	}
	@Override
	public boolean updateSalById(int id, double sal) {
		Employee e=getById(id);
		if(e!=null) {
			if( e instanceof SalariedEmp) {
				((SalariedEmp) e).setSal(sal);
			}
			else if (e instanceof ContractEmployee) {
				((ContractEmployee) e).setCharges(sal);
	}
			else  {
//				if (e instanceof VendorEmp) {
//				((VendorEmp) e).setAmount(sal);
//			
			}
			return true;
		}
		return false;
	}
	@Override
	public List<Employee> sortByName() {
		List<Employee> elst=new ArrayList<>();
		for(Employee e:elist) {
			elst.add(e);
		}
		//Collections.copy( elst,elist);
		//Collections.sort(elst,null);
		elst.sort(null);
		return elst;
		
	}
	@Override
	public boolean updateAmtById(int id, double amount) {
		// TODO Auto-generated method stub
		Employee e=getById(id);
		if(e!=null) {
			 if (e instanceof VendorEmp) {
				((VendorEmp) e).setAmount(amount);
			}
			return true;
		}
		return false;
	}
	@Override
	public boolean updateCharById(int id, double charges) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
