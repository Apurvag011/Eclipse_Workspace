package com.ap.generics;

public class GenericsDemo<T> {

	public static void main(String[] args) {
		Gen<Integer> iObj = new Gen<>(88);
		Gen<String> sObj = new Gen<>("This is Sparta!!!!!");
		iObj.printValue();
		sObj.printValue();
		
		//Min Max Example 
		Integer insA[] = {1,2,3,4};
		Character cA[] = {'a','b','x'};
		MinMaxImpl<Integer> intergerArray = new MinMaxImpl<Integer>(insA);
		MinMaxImpl<Character> cArray = new MinMaxImpl<Character>(cA);
		System.out.println("The Max Number is : " + intergerArray.max());
		System.out.println("The Min Number is : " + intergerArray.min());
		System.out.println("The Max Number is : " + cArray.max());
		System.out.println("The Min Number is : " + cArray.min());
		
		//Generics method 
		System.out.println(" Is it true !!!! ????" + GenMethodExample.isIn('a', cA));
	}

	
}
