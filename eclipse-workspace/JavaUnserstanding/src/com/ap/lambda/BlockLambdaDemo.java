package com.ap.lambda;

interface NumericFunction{
	int function(int n );
}
public class BlockLambdaDemo {

	public static void main(String[] args) {
		
		//This has a block of code in the right side of lambda function
		NumericFunction factorial = (n) -> {
			int fact = 1; 
			
			for(int i = 1 ; i<= n ; i++) {
				fact *= i;
			}
			
			return fact;
		};
		
		System.exit(1);
		System.out.println("Factorial of 8 is :" + factorial.function(8));
	}
}
