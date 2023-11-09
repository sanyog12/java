package com.demo.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.LocalDate;
import com.demo.beans.*;

public class daoInterfaceImpl implements daoInterface {

	static Map<Student, List<String>> map;
	List<String> skills = new ArrayList<>();
	// sid,name,bdate,degree, marks
	static {
		map = new HashMap<>();

		map.put((new Student(1, "sudh", new Date(), "Engg", 12)), Arrays.asList("1", "12"));
		map.put(new Student(1, "ani", new Date(), "Engg", 12), Arrays.asList("1", "12", "bunny"));
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("enter the date in \"yyyy-MM-dd\"");
		String date = sc.next();
		Date newDate = null;
		try {
			newDate = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
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

		map.put(new Student(id, name, newDate, stream, marks), skills);

	}

	@Override
	public void displayAll() {
			System.out.println(map);
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
	public void deleteSkillForStudent() {
		// TODO Auto-generated method stub
		Set<Student> s = map.keySet();
		for (Student stud : s) {
			List<String> listSet = map.get(stud);
			for (String l : listSet) {
				if (l.equalsIgnoreCase("1")) {
//					map.get(stud).remove("1");
					
				}
			}
		}

	}

	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addNewSkillForStudnets() {
		// TODO Auto-generated method stub

	}

}
