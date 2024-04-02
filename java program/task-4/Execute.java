package com.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Execute {
	public void writeFile(String data) {
		String path = "D:\\Project\\FileReadWrite\\abc.txt";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
			bw.write(data);
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public ArrayList<String[]> readFile() {
		String path = "D:\\Project\\FileReadWrite\\abc.txt";
		ArrayList<String[]> list = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String val = "";
			while((val = br.readLine()) != null) {
				String[] all = val.split(" ");
				list.add(all);
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		return list;
	}
	
	public void option() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Student Management System");
			System.out.println("1. Add Student\n2. Delete Student\n3. Edit Student\n4. Search\n5. Exit");
			
			System.out.println("Enter option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
				case 1:
					StudentDetails sd = new StudentDetails();
					sd.getAllData();
					System.out.println("Student add Success");
					break;
				case 2:
					System.out.println("Delete add Success");
					break;
				case 3:
					System.out.println("Edit add Success");
					break;
				case 4:
					Execute ex = new Execute();
					ArrayList<String[]> list = ex.readFile();
					ArrayList<Student> stDetails = new ArrayList<>();
					for(int i=0; i<list.size(); i++) {
						String t_id = list.get(i)[0];
						String t_name = list.get(i)[1] + " "+list.get(i)[2];
						String t_phn = list.get(i)[3];
						String t_add = list.get(i)[4];
						Student st = new Student(t_name, t_id, t_phn, t_add);
						stDetails.add(st);
					}
					
					System.out.println("Search Student");
					break;
				case 5:
					sc.close();
					System.out.println("Application Exited Successful");
					System.exit(0);
					break;
				default:
					System.out.println("Please Enter correct option");
			}
			
		}while(true);
	}
}











