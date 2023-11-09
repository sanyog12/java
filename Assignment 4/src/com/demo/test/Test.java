package com.demo.test;

import java.util.Scanner;

import com.demo.service.serviceInterface;
import com.demo.service.serviceInterfaceImpl;

public class Test {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		serviceInterface si = new serviceInterfaceImpl();
		
		do {
			
			System.out.println("1. add new student\r\n"
					+ "2. add new skill for a student\r\n"
					+ "3. delete student\r\n"
					+ "4. delete skill for a student\r\n"
					+ "5. display all students with given skill(accept skill from user)\r\n"
					+ "6. display all students with given degree(accept degree from user\r\n"
					+ "7. exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				si.addNewStudent();
				break;
			case 2:
				si.addNewSkillForStudnet();
				break;
			case 3:
				si.deleteStudent();
				break;
			case 4:
				si.deleteSkillForStudent();
				break;
			case 5:
				si.displayAll();
				break;
			case 6:
				si.displayAllStudentWithDegree();
				break;
			case 7:
				System.out.print("thx for visitng");
				sc.close();
				break;
			}
		}while(ch!=7);
	}
	
}
