package com.ap.generics;

//Here Tesla is parameter type 
public class Gen<Tesla> {
	Tesla object; 
	
	public Gen(Tesla passedObject) {
		object = passedObject;
	}
	Tesla getObj() {
		return object;
	}
	
	void setObj(Tesla setObject) {
		object = setObject;
	}
	
	void printValue() {
		System.out.println("The value for T is : " + object.toString());
	}

}
