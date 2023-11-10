package com.demo.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.beans.*;

public class daoInterfaceImpl implements daoInterface {

	static Map<Student, Set<String>> map;
	Set<String> skills = new HashSet<>();
	
	// sid,name,bdate,degree, marks
	static {
		map = new HashMap<>();

		  map.put(new Student(1, "sudh", LocalDate.of(2000,12,12), "Engg", 12), new HashSet<>(Arrays.asList("1", "12")));
		  map.put(new Student(3, "sudh", LocalDate.of(2000,12,12), "Engg", 12), new HashSet<>(Arrays.asList("1", "12")));
		  map.put(new Student(5, "sudh", LocalDate.of(2000,12,12), "Engg", 12), new HashSet<>(Arrays.asList("1", "12")));
		  map.put(new Student(1, "sudh", LocalDate.of(2000,12,12), "Engg", 12), new HashSet<>(Arrays.asList("1", "12")));
		  map.put(new Student(2, "ani", LocalDate.of(2000,12,12),"Engg", 12), new HashSet<>(Arrays.asList("1", "12", "bunny")));

	}

	@Override
	public void addNewStudents() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id");
		int id = sc.nextInt();
		System.out.println("enter the name");
		sc.nextLine();
		String name = sc.nextLine();
		
		
		
		System.out.println("enter the date in \"yyyy/MM/dd\"");
		String date = sc.next();
		LocalDate ldf = LocalDate.parse(date,DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		
	
		
		
		
		
		System.out.println("enter the stream");
		String stream = sc.nextLine();
		sc.nextLine();
		System.out.println("enter the marks");
		int marks = sc.nextInt();

		System.out.println("how many skills u want to enter: ");
		int skillCnt = sc.nextInt();
		for (int i = 0; i < skillCnt; i++) {
			System.out.println("enter the skill name");
			sc.nextLine();
			String skillName = sc.next();
			skills.add(skillName);
		}

		map.put(new Student(id, name, ldf, stream, marks), skills);

	}

	@Override
	public void displayAll() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the skill tht u want");
	
		String enteredSkill = sc.nextLine();
		Set<Student> s = map.keySet();
		for(Student stud: s) {
			Set<String> skillSet = map.get(stud);
			if(skillSet.contains(enteredSkill)) {
				System.out.println(stud+" , "+ skillSet);
			}
			}
		
		
	//		System.out.println(map);
	}
	
	@Override
	public void deleteSkillForStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the id whose skill you want to delete");
		int id = sc.nextInt();
		sc.nextLine();
		// TODO Auto-generated method stub
		System.out.println("enter the Skill to delete");
		String deleteSkill = sc.nextLine();
		Set<Student> s = map.keySet();
		for(Student student:s) {
			if(student.getId() == id) {
				Set<String> studentSkills = map.get(student);
				studentSkills.remove(deleteSkill);
				System.out.println("Deleted Successfully");
			}
		}
		

	}

	@Override
	public void displayAllStudentWithDegree() {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter the degree you want to search");
		String searchDegree = sc.nextLine();
		Set<Student> s = map.keySet();
		for (Student s1 : s) {
			if (s1.getDegree().contains(searchDegree)) {
				System.out.println(s1);
				
			}
		}

	}

	

	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<Student> stud = map.keySet();
		System.out.println("Enter the id of student that you want to delete");
		int id = sc.nextInt();
		for(Student s:stud) {
			if(s.getId() == id) {
				map.remove(s);
				 System.out.println("Student deleted successfully.");
				 return;
			}
		}
		  System.out.println("Student not found with ID: " + id);
	}

	@Override
	public void addNewSkillForStudnets() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of student that you want to delete");
		int id = sc.nextInt();
		System.out.println("Enter the skill you want to enter");
		sc.nextLine();
		String skill=sc.nextLine();
		Set<Student> stud = map.keySet();
		for(Student s:stud){
			if(s.getId() == id) {
			Set<String> studSkill = map.get(s);
			studSkill.add(skill);
			 System.out.println("New skill added successfully.");
			
			 return;
			
			
		}

	}
	 System.out.println("Student not found with ID: " + id);

	}
}
