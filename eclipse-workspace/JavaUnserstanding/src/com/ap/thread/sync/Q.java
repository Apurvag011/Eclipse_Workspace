package com.ap.thread.sync;

public class Q {
	
	boolean valueEntered = false; 
	int n = 0;
	public synchronized int getNumber() {
		while (!valueEntered) {
			try {
				System.out.println("Waiting for input");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		valueEntered = false;
		notify();
		System.out.println("Reading :" + n);
		return n; 
	}
	
	public synchronized void putNumber(int number) {
		while (valueEntered) {
			try {
				System.out.println("Waiting for removal");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		valueEntered = true;
		System.out.println("Writing :" + number);
		n = number;
		notify();
	}
}
