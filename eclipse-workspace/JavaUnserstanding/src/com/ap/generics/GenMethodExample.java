package com.ap.generics;

public class GenMethodExample {
	
	public static <T extends Comparable<T>, V extends T> boolean isIn(T object, V[] arrayObj) {	
		
		for(V v : arrayObj) {
			if(object.compareTo(v) == 0) {
				return true;
			}
		}
		return false;
		
	}

}
