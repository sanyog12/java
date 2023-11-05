package com.friends;

import java.util.*;

public class Test {
	public static void main(String args[]) {
		int ch;
		
		do {
			System.out.print("1. Display All Friend \n\n2. Search by id \n\n3. Search by name \n\n4. Display all friend with a particular hobby \n\n5.add new friend \n\n6. Exit\nChoice ");

			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
						switch(ch) {
			case 1:
				ServiceFriend.display();
				break;
			case 2:
				ServiceFriend.searchById();
				break;
			case 3:
				ServiceFriend.searchByName();
				break;
			case 4:
				ServiceFriend.allFriendsWithOneHobby();
				break;
			case 5:
				ServiceFriend.addFriend();
				break;
			case 6:
				System.out.print("thx for visting");
				sc.close();
				break;
			}
		}while(ch!=6);
	}
}
