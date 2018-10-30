package com.ap.lambda;

interface GenMathFunction<T>{
	T function(T t);
}
class EmptyArrayException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyArrayException() {
		super("Array is empty you doofus");
	}
	
}
interface LambdaWithException{
	double function(double[] arrayDouble) throws EmptyArrayException;
}
public class GenericLambda {

	
	public static void main(String[] args) throws EmptyArrayException {
		int n =0 ;
		double[] doubleArray = {1.0,2.34,3.45,55.66};
		LambdaWithException averageFinder = (dArray) ->{
			double average = n;
			if(dArray.length == 0 ) {
				throw new EmptyArrayException();
			}
			for(double d : dArray) {
				average += d;
			}
			return average/dArray.length;
		}; 
		
		System.out.println("Average for the array is : " + averageFinder.function(doubleArray));
		
		GenMathFunction<Integer> factorial = (i) -> {
			int fact = 1;
			for(int j=1 ;j <= i; j++ ) {
				fact *= j;
			}
			return fact;
		} ;
		
		System.out.println("Factorial for the Number 4 is: " + factorial.function(4));
		

	}

}
