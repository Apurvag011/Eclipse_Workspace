package com.ap.lambda;

interface MyFunc<T>{
	boolean func(T v1, T v2);
}

class HighTemp{
	private int hTemp;
	
	HighTemp(int temp){
		hTemp = temp;
	}
	
	boolean sameTemp (HighTemp ht) {
		return hTemp == ht.hTemp;
	}
}

class InstanceMethodClass{
	public <T> int counter(T[] vals, MyFunc<T> funcObj , T t ) {
		int count  = 0;
		for(T t1 : vals) {
			if(funcObj.func(t, t1)) count++;
		}
		return count;
	}
}

public class MethodReferenceInstance {
	public static void main(String[] args) {
		HighTemp[] weekHighTemp = {new HighTemp(34),
				new HighTemp(35),
				new HighTemp(33),
				new HighTemp(34),
				new HighTemp(33) };
		InstanceMethodClass instanceClass = new InstanceMethodClass();
		int countSame = instanceClass.counter(weekHighTemp, 
				HighTemp::sameTemp ,
				new HighTemp(33));
		System.out.println("The count of the day when temp was highest: " + countSame);
	}

}
