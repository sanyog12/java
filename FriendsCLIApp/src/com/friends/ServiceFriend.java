package com.friends;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class ServiceFriend {

	static Friend[] fri ;
	static int cnt=0;
	static {
		//important
		fri= new Friend[100];
		fri[0]=new Friend (1,"pnay","bisan",Arrays.asList("reading","Hiking"),"1234567890",new Date(),"yea!Address");
		fri[1]= new Friend (2,"sanyog","mane",Arrays.asList("reading","earning"),"23423424",new Date(),"Solapur");
		cnt = 2;
	}
	
	public static void display() {
		for(Friend f:fri) {
			if(f!=null)
			System.out.println(f);
		}
		
	}

	public static void searchById() {
		// TODO Auto-generated method stub'
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id");
		int id = sc.nextInt();
		boolean yn = false;
		for(Friend f:fri) {
			if(f!= null) {
				if(f.getId()==id) {
					System.out.println(f);
					yn = true;
					break;
				}
			}
			if(yn == false)
			System.out.println("friend not found");
		}
		
		
	}

	public static void searchByName() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name= sc.nextLine();
		boolean yn = false;
		for(Friend f:fri) {
			if(f!= null) {
				if(f.getName().equals(name)) {
					System.out.println(f);
					yn = true;
					break;
				}
			}
		
		}
		if(yn == false)
			System.out.println("friend not found");
		
	}

	public static void allFriendsWithOneHobby() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the hobby");
		String hobbyToSearch = sc.nextLine();
		boolean found = false;
		for(Friend f: fri) {
			if(f!=null) {
				if(f.hasHobby(hobbyToSearch)) {
					System.out.println(f);
					found = true;
				}
			}
		}
		if(!found) {
			System.out.println("no friend found with hobby");
		}
		
	}
//important: all the things needed to add friends are done here
	public static void addFriend() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the name");
		String name = sc.nextLine();
		System.out.println("enter the lastname");
		String lastName = sc.nextLine();
		
		List<String> hobbieList = new ArrayList<>();
		System.out.println("Enter the number of hobbies");
		int numHobbies = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numHobbies; i++) {
			System.out.println("Enter the hobby "+(i+1)+":");
			String hobby = sc.nextLine();
			hobbieList.add(hobby);
		}
		System.out.print("Enter the mobile number: ");
	    String mobno = sc.next();
	    
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date birthDate =null;
		try {
		System.out.println("Enter the birth date yyyy-MM-dd");
		String dateStr = sc.next();
		birthDate = dateFormat.parse(dateStr);
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		
		sc.nextLine();
		
		System.out.println("enter the address");
		String address= sc.nextLine();
		
		fri[cnt] = new Friend(id, name, lastName, hobbieList, mobno,  birthDate, address);
		cnt++;
		
}

}
