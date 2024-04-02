package main;

import java.util.Scanner;

public class Supermarket_Bill_Calculation {
	public void execute() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i=0; i<n; i++) {
			ans += sc.nextInt();
		}
		sc.close();
		System.out.println(ans);
	}
}
