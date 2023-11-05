package com.student;

import java.util.*;

public class test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.add the student\n2.display students\n3.display student gpa\n4.search by name\n5.search by id\n6.exit\nChoice");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
			StudentService.addStudent();
				break;
			case 2:
				StudentService.displayAll();
				break;
			case 3:
				StudentService.displayGpaById();
				break;
			case 4:
				StudentService.searchByname();
				break;
			case 5:
				StudentService.searchById();
				break;
			case 6:
				System.out.println("Yea get lost..");
				sc.close();
				break;
			}
		}while(ch != 6);
	}
	
}
