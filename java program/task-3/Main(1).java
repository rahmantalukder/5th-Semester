package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		//int i = Runtime.getRuntime().availableProcessors();
		//System.out.println(i);
		
		map.put(10, "Rafi");
		map.put(15, "Niloy");
		map.put(20, "swity");
		System.out.println(map);
		
		//String name = map.get(10);
		map.remove(15);
		//System.out.println(name);
		map.clear();
		System.out.println(map);
		
		/*int[] a = {10, 34, 56, 21, 23, 65, 76};
		for(int i : a) {
			System.out.println(i);
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		*/
		
		Map<String, Student> ma = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println("Enter your name: ");
			String name = scanner.nextLine();
			System.out.println("Enter your id: ");
			String id = scanner.nextLine();
			System.out.println("Enter your phn: ");
			String phn = scanner.nextLine();
			Student student = new Student(name, id, phn);
			ma.put(id, student);
		}
		scanner.close();
		for(String key : ma.keySet()) {
			Student student = ma.get(key);
			System.out.println("Name: "+student.name+", Phn: "+student.phn+", Id: "+student.id);
		}
	}

}
