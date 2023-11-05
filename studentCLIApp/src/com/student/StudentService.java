package com.student;
import java.util.*;
public class StudentService {
	static student[] stuarr;
	static int cnt;
	static {
		stuarr = new student[100];
		stuarr[0] = new student(1,"pnay",99,99,99);
		stuarr[1] = new student(2,"bhup",99,99,99);
		cnt=2;
	}
	public static void addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name:");
		String name = sc.nextLine();
		System.out.println("enter m1: ");
		
		int m1= sc.nextInt();
		System.out.println("enter m2: ");
		int m2 = sc.nextInt();
		System.out.println("enter m3: ");
		int m3 = sc.nextInt();
		stuarr[cnt] = new student(id,name,m1,m2,m3);
		cnt++;
	}
	
	public static void displayAll() {
		for(student s:stuarr) {
			if(s!=null) {
				System.out.println(s);
			}
			else
				break;
		}
	}

	public static void displayGpaById() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student id for Gpa");
		int id = sc.nextInt();
		int yn = searchById(id);
		if(yn!=-1) {
			student fndStudent  = stuarr[yn];
			double GPA = (fndStudent.getM1()/3)+(fndStudent.getM2()/2)+(fndStudent.getM3()/4);
			System.out.println("The GPA is: "+GPA);
		}
		else
			System.out.println("Student not found");
		
	}

	public static int searchById(int id) {
		// TODO Auto-generated method stub
		for(student s:stuarr) {
			if(s!=null) {
				if(s.getStudid() == id) {
					return id;
				}
				
			}
		}
		return -1;
	}

	public static void searchByname() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to find");
		String name = sc.nextLine();
		for(student s:stuarr) {
			if(s!=null && s.getName().equals(name)) {
				System.out.println(s);
			}
		}
		System.out.println("Student not found");
		
	}

	public static void searchById() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The id");
		int id = sc.nextInt();
		int flag = 0;
		for(student s:stuarr) {
			if(s!=null && s.getStudid()==id) {
				flag=1;
				System.out.println(s);
			}
		}
		if(flag ==0) {
			System.out.println("student not found");
		}
		
	}


}
