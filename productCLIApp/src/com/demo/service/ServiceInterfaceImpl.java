package com.demo.service;

import com.demo.dao.daoInterface;
import com.demo.dao.daoInterfaceImpl;

public class ServiceInterfaceImpl implements ServiceInterface {

	daoInterface edao = new daoInterfaceImpl();
	
	@Override
	public void perishable() {
		// TODO Auto-generated method stub
		edao.addPerishable();
		
		
		
	}

	@Override
	public void nonPerishable() {
		// TODO Auto-generated method stub
		edao.addnonPeriahable();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		edao.print();
		
	}

}
