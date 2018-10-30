package com.ap.thread.sync;

public class QueueDemo {

	public static void main(String[] args) {
		Q q = new  Q();
		Producer p = new Producer(q); 
		Consumer c=  new Consumer(q);
		p.t.start();
		c.t.start();

	}

}
