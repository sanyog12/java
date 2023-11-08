package com.demo.test;
import java.util.*;
import com.demo.service.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		ServiceInterface si = new ServiceInterfaceImpl();
		do {
			
			System.out.println("1.perishable\n2.nonPerishable\n3.display All\n4.exit\nchoice");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				si.perishable();
				break;
			case 2:
				si.nonPerishable();
				break;
			case 3:
				si.display();
			
			}
		}while(ch!=4);

	}

}
