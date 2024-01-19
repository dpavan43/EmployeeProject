package com.example.japps.dao;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		EmployeeeDao employeeDao =new EmployeeeDao();
		int choice;
		do {
			System.out.println("**********-Menu-**********");
			System.out.println("1. Create Employee Details");
	        System.out.println("2. Show Employee Details");
	        System.out.println("3. Update the Employee Details");
	        System.out.println("4. Exit");
	        System.out.print("Enter the Choice (1-4):");
	        Scanner sc = new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice) {		
				case 1:
					employeeDao.create();
					System.out.println("====Create Sucessfully====");
					break;
				case 2:
					employeeDao.show();
					break;
				case 3:
					employeeDao.update();
					
				default:
					System.out.println("Wrong Choice");
			}
		}while(true);
	}	
}



