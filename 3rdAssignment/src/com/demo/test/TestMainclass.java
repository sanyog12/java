package com.demo.test;
import com.demo.service.*;

import java.util.*;

public class TestMainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ServiceInterface si = new ServiceInterfaceImpl();
		int ch;
		do {
			ch=sc.nextInt();
			System.out.println("1. Display All employees 2. Search by id\r\n"
					+"3. Search by name\r\n"
					+ "4. Display all employee \r\n"
					+ "5. calculate salary and display for all emplyees with particular designation\r\n"
					+ "6. accept department from user and display 5 employees of that department. \r\n"
					+ "5. Exit");
			switch(ch) {
			case 1:
				System.out.println("1.Salaried\n2.Contract\n3.Vendor");
				int choice = sc.nextInt();
				si.addNewEmployee(choice);
				break;
			case 2:
				si.searchById();				
				break;
			case 3:
				si.display();
				break;
			case 4:
				si.salOfParticularDesg();
				break;
			case 5:
				si.display5Emp();
				break;
			
			case 6:
				System.out.println("thanks for visiting");
				sc.close();
				break;
			}
		}while(ch!=6);
		
		
		
	}

}
