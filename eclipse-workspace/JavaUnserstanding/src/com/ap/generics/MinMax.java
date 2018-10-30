package com.ap.generics;

public interface MinMax<T extends Comparable<T>> {
	 T min();
	 T max();
}
