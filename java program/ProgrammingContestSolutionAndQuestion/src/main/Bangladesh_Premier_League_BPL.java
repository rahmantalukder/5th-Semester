package main;

import java.util.Scanner;

public class Bangladesh_Premier_League_BPL {
	public void execute() {
		Scanner sc = new Scanner(System.in);
		int over = sc.nextInt();
		int totalRun = 0;
		for(int i=0; i<over; i++) {
			int overRun = 0;
			for(int j=0; j<6; j++) {
				overRun += sc.nextInt();
			}
			totalRun += overRun;
			System.out.println(overRun);
		}
		sc.close();
		System.out.println("Total Run is: "+totalRun);
	}
}
