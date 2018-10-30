package com.ap.thread.sync;

public class Producer implements Runnable {

	Q q;
	Thread t;
	Producer(Q queueObj ){
		q = queueObj;
		t= new Thread(this, "Producer");
	}
	
	@Override
	public void run() {
		int a = 1;
		for (int i = 30 ; i>0; i--) {
			q.putNumber(a++);
		}
		
	}
}
