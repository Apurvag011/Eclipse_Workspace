package com.ap.lambda;

public class LambdaDemo {

	 
	
	public static void main(String[] args) {
		MyNum myNum; 
		
		MyNum yourNum;
		
		//getting what we want without lambda expressions
		yourNum = new MyNum() {
			
			@Override
			public double getValue() {
				return 123.56;
			}
		};
		
		//Using lambda in initialization 
		myNum = () -> 123.56;
		print("Outcome of the your anonymous function is : " + yourNum.getValue());
		print("Outcome of the first lambda function is : " + myNum.getValue());
		
		//Fancy initialization 
		myNum = () -> Math.random()*100;
		print("First fancy random number: " + myNum.getValue());
		
		
		//Lambda as a target type
		NumberTest ifEven = (n) -> ( (n)%2 == 0 );
		NumberTest ifPositive = (n) -> ((n) >= 0  );
		if(ifEven.test(10)) print("10 is Even");
		
		if(ifPositive.test(-12)) print("-12 is positive");
		else print("Na be");
		
	}
	static void print(String x) {
		System.out.println(x);
	}

}
