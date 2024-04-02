package com.project;

import java.util.Scanner;

public class StudentDetails {
	public void getAllData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Full Name: ");
		String name = sc.nextLine();
		System.out.print("Enter ID: ");
		String id = sc.nextLine();
		System.out.print("Enter contact Number: ");
		String phn = sc.nextLine();
		System.out.print("Enter Address: ");
		String address = sc.nextLine();
		String fullDetails = id + " "+ name + " " + phn + " " + address;
		Execute e = new Execute();
		e.writeFile(fullDetails);
		//sc.close();
	}
}
