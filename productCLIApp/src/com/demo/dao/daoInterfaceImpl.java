package com.demo.dao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import com.demo.beans.*;
public class daoInterfaceImpl implements daoInterface {
Scanner sc = new Scanner(System.in);
List<Product> li = new ArrayList<>();
	@Override
	public void addPerishable() {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("enter the id");
		//int id, String name, String type, double price,Date mfd
		int id = sc.nextInt();
		sc.nextLine();		
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter the price");
		double price = sc.nextInt();
		System.out.println("enter the date yyyy-MM-dd");
		String date;
		try {
			 date = sc.next();
		Date mfd =dateFormat.parse(date);
		li.add(new Perishable(id,name,price,mfd));
		}catch(ParseException e) {
			System.out.print("Invalid format");
			sc.close();
		}
		
	
		
		
	}

	@Override
	public void addnonPeriahable() {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date exd = null;
		System.out.println("enter the id");
		//int id, String name, String type, double price,Date mfd
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter the price");
		double price = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the date yyyy-MM-dd");
		String date = sc.next();
		try {
			exd= dateFormat.parse(date);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("1.furniture\n2.stationary\n3.utinsil");
		int ch = sc.nextInt();
		if(ch == 1) {
			String category = "furniture";
			//int id,String name,double price,Date exd,String category
			li.add(new NonPershable(id,name,price,exd,category));
		}
		else if(ch == 3) {
			String category = "stationary";
			li.add(new NonPershable(id,name,price,exd,category));
		}
		else {
			String category = "utinsil";
			li.add(new NonPershable(id,name,price,exd,category));
		}
	}
	
	
	
	
	public void print() {
		for(Product p:li) {
			System.out.println(p);
		}
	}

}
