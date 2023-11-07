package com.demo.test;
import com.demo.beans.Employee;
import com.demo.service.*;

import java.util.*;

public class TestMainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ServiceInterface si = new ServiceInterfaceImpl();
		int ch;
		do {
			
			System.out.println("0.add new employee \n1. Display All employees\n 2. Search by id\r\n"
					+"3. Search by name\r\n"
					+ "4. Display all employee \r\n"
					+ "5. calculate salary and display for all emplyees with particular designation\r\n"
					+ "6. accept department from user and display 5 employees of that department. \r\n"
					+ "7. Exit");
			ch=sc.nextInt();
			switch(ch) {
			case 0:
				System.out.println("1.Salaried\n2.Contract\n3.Vendor");
				int choice = sc.nextInt();
				si.addNewEmployee(choice);
				break;
			case 1:
				si.display();
				break;
			case 2:
				System.out.println("Enter the id to search");
				int id = sc.nextInt();
				Employee list = new Employee(); 
				
				list = si.searchById(id);	
				if(list!=null) {
					System.out.println(list);
				}
				else
					System.out.println("ja Nahi milega");
				break;
			case 3:
				System.out.println("Enter the name");
				String name1 = sc.next();
				si.searchByName(name1);
				
				break;
			case 4:
				si.display();
				break;
			case 5:
				sc.nextLine();
				System.out.println(" Enter the desg ");
				String name = sc.next();
				
				si.salOfParticularDesg(name);
				break;
			
			case 7:
				System.out.println("thanks for visiting");
				sc.close();
				break;
			}
		}while(ch!=7);
		
		
		
	}

}
