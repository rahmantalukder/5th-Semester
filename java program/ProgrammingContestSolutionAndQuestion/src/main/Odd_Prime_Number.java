package main;

import java.util.Scanner;

public class Odd_Prime_Number {
	public void execute() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int flag = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 1) {
				continue;
			}
			if(arr[i] % 2 != 0) {
				if(isPrime(arr[i])) {
					System.out.println(1);
					flag = 1;
					break;
				}
			}
		}
		if(flag == 0) {
			System.out.println(0);
		}
	}
	
	public static boolean isPrime(int num) {
		for(int i=2; i<=(num/2)+1; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
