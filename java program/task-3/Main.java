package com.StudentManagement;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String path = "D:\\Project\\StudentManageMentSystem";
		FileReadWrite frw = new FileReadWrite();
		/*for(int i=1; i<=100; i++) {
			frw.writeFile(String.valueOf(i), path+"//numberFormat.txt");
		}*/
		
		ArrayList<String> ans = frw.readFile(path+"\\numberFormat.txt");
		System.out.println(ans);
		
		int sum = 0;
		
		for(int i=0; i<ans.size(); i++) {
			sum = sum + Integer.parseInt(ans.get(i));
		}
		System.out.println(sum);
	}

}
