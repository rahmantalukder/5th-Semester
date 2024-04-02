package com.exaple;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		String[] arr = {"5", "5", "+", "10", "/"};
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<arr.length; i++) {
			String temp = arr[i];
			if(!temp.equals("+") || !temp.equals("-") || !temp.equals("*") || !temp.equals("/")) {
				st.push(Integer.parseInt(temp));
				System.out.println(st);
			}else {
				int a = st.pop();
				int b = st.pop();
				
				if(temp.equals("+")) {
					int rslt = (int)(a + b);
					st.push(rslt);
				}else if(temp.equals("-")) {
					int rslt = b - a;
					st.push(rslt);
				}else if(temp.equals("*")) {
					int rslt = a * b;
					st.push(rslt);
				}else if(temp.equals("/")) {
					int rslt = b / a;
					st.push(rslt);
				}
			}
		}
		System.out.println("Result is : "+st.pop());
	}

}
