package com.ap.lambda;

interface StringJob{
	String function(String s);
}

class MyStringOperations{
	public String reverseString(String s) {
		String result = "";
		for(int i = s.length()-1;i>=0 ; i--) {
			result += s.charAt(i);
		}		
		return result;
	}
}

public class MethodReferenceStatic {
	
	static String staticStringMethod(StringJob j , String s) {
		return j.function(s);
	}
	
	public static void main(String[] args) {
		
		MyStringOperations operationsMethods = new  MyStringOperations();
		
		System.out.println("Executing the complex structure: " + staticStringMethod(operationsMethods::reverseString, "HeadTwist"));
	}

}
