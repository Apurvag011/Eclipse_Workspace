package com.ap.lambda;

import java.util.Scanner;

interface StringFunction {
	String function(String s);
}
public class StringReverse {

	public static void main(String[] args) {
		
		StringFunction reverseString = (s) -> {
			String reverse = ""; 		
			for(int i =s.length()-1 ; i>=0 ; i--) {
				reverse += s.charAt(i);
			}
			return reverse;
		};
		
		System.out.println("Enter String to Reverse (): " );
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

	}

}
