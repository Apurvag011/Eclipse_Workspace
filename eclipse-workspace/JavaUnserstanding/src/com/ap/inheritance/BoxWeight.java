package com.ap.inheritance;

public class BoxWeight extends Box {

	public BoxWeight() {
		super();
		// TODO Auto-generated constructor stub
	}

	double weight;
	
	void showData() {
		
		System.out.println("Weight is " + weight + " Height is " + height +" length is " + length );
	}
	
	BoxWeight(double w, double h , double l , double lb){
		super(w,l,h);
		weight = lb;
	}
}
