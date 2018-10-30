package com.ap.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		//MyThread
		MyThread mythread = new MyThread();
		mythread.startThread();
		
		
		//Main Thread
		Thread t = Thread.currentThread();
		t.setPriority(1);
		//t.setPriority(2);
		System.out.println("Thread Name " + t.getName());
		long time  = System.currentTimeMillis();
		try {
		for(int i=0;i<500;i++) {			
			System.out.println("Thread :" + t.getName() + " Tik:" + i);
			Thread.sleep(0);
		}
		}catch(InterruptedException e ) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Thread : "+ t.getName() +  " Time " +  (System.currentTimeMillis() - time) );
		}
	}

}
