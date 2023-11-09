package com.demo.service;

import com.demo.dao.daoInterface;
import com.demo.dao.daoInterfaceImpl;

public class serviceInterfaceImpl implements serviceInterface {
	daoInterface edao = new daoInterfaceImpl();
	@Override
	public void addNewStudent() {
		// TODO Auto-generated method stub
		edao.addNewStudents();
		
	}

	@Override
	public void addNewSkillForStudnet() {
		// TODO Auto-generated method stub
		edao.addNewSkillForStudnets();
		
	}

	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		edao.deleteStudent();
		
	}

	@Override
	public void deleteSkillForStudent() {
		// TODO Auto-generated method stub
		edao.deleteSkillForStudent();
		
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		edao.displayAll();
		
	}

	@Override
	public void displayAllStudentWithDegree() {
		// TODO Auto-generated method stub
		edao.displayAllStudentWithDegree();
		
	}

}
