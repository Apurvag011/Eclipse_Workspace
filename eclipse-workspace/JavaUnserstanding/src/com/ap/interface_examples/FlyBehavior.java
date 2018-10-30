package com.ap.interface_examples;

 interface FlyBehavior {
	 	 default void Fly() { 		
	 		System.out.println("Flybehaviour called");
	 	}
}
