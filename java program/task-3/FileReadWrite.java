package com.StudentManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileReadWrite {
	public void writeFile(String data, String p) {
		String path = p;
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
			bw.write(data);
			bw.newLine();
			bw.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public ArrayList<String> readFile(String p) {
		ArrayList<String> allString = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(p));
				String line = "";
				while((line = br.readLine()) != null) {
					allString.add(line);
				}
				br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return allString;
	}
}












