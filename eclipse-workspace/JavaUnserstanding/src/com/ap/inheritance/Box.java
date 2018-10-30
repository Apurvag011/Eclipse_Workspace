package com.ap.inheritance;

public class Box {

	 double height ; 
	 double width; 
	 double length; 
	
	 Box(double height , double width, double length) {
		this.height = height;
		this.width = width;
		this.length = length;
				
	}
	 
	 Box(double len){
		 width= length = height = len;
	 }

	 public Box(){
		height = -1; 
		width = -1; 
		length = -1;
		
	}
	
	 void showData() {
			
			System.out.println("width " + width  + " Height is " + height +" length is " + length );
	}
	 
	double volume() {		
		return height * width * length; 
	}
	
}
