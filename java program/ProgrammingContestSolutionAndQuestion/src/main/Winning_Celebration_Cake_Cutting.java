package main;

import java.util.Scanner;

public class Winning_Celebration_Cake_Cutting {
	public void execute() {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		sc.close();
		int ans = line*(line+1)/2 +1;
		System.out.println(ans);
	}
}
