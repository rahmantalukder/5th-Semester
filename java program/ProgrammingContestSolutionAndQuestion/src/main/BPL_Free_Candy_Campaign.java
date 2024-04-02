package main;

import java.util.Scanner;

public class BPL_Free_Candy_Campaign {
	public void execute() {
		BPL_Free_Candy_Campaign b = new BPL_Free_Candy_Campaign();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Max Candy Number is: "+b.maxCandy(arr));
	}
	
	public int maxCandy(int[] arr) {
		int max = 0;
		int temp = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				temp = arr[i] + arr[j];
				if(temp % 2 == 0) {
					max = Math.max(temp, max);
				}else {
					max = Math.max(temp/2, max);
				}
			}
		}
		return max;
	}
}
