package com.ap.thread.sync;

public class Consumer implements Runnable {

	Q q;
	
	Thread t;
	Consumer(Q queueObj ){
		q = queueObj;
		t= new Thread(this, "Consumer");
	}
	
	@Override
	public void run() {
		for(int i=30 ; i>0; i--)
			q.getNumber();
	}
	

}
