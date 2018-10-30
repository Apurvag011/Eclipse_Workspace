package com.ap.generics;

public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {

	T[] vals; 
	
	public MinMaxImpl(T[] o) {
		vals = o;
	}
	
	@Override
	public T min() {
		T v = vals[0];
		for(T t : vals) {
			if(t.compareTo(v) < 0 )
				 v=t;
		}
		return v;
	}

	@Override
	public T max() {
		T v = vals[0];
		for(T t : vals) {
			if(t.compareTo(v) > 0 )
				 v=t;
		}
		return v;
	}

}
