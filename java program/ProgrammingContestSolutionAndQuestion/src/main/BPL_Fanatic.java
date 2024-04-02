package main;

import java.util.Scanner;

public class BPL_Fanatic {
	public void execute() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int w = 0;
		int l = 0;
		int t = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'W') {
				w++;
			}else if(str.charAt(i) == 'T') {
				t++;
			}else {
				l++;
			}
		}
		System.out.println(w+" "+l+" "+t);
	}
}
