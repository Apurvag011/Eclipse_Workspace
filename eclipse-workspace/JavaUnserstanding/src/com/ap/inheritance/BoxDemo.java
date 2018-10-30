package com.ap.inheritance;

 class BoxDemo {

	public static void main(String[] args) {
		Box plainBox = new Box(2,2,0);
		Box a = new BoxWeight(2,2,2,2);
		a.showData();
		BoxWeight b = new BoxWeight(2,2,2,2);
		System.out.println(b.weight + " "+ a);
		
		BoxWeight weightBox = new BoxWeight(3,5,7,8.37);
		double vol; 
		vol = weightBox.volume();
		System.out.println(vol);
		plainBox = weightBox; 
		System.out.println(vol);
		vol = plainBox.volume();
		
	}

}

