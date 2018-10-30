package com.ap.thread;

public class MyThread implements Runnable {

	public MyThread() {
		innerThread = new Thread(this, "MyThread");
		innerThread.setPriority(10);
	}

	private Thread innerThread;

	public void startThread() {
		 innerThread.start();
	}

	@Override
	public void run() {

		long time = System.currentTimeMillis();
		try {
			for (int i = 0; i < 500; i++) {
				System.out.println("Thread: " + innerThread.getName());
				System.out.println("TikTok: " + i);
				Thread.sleep(0);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Thread: " + innerThread.getName() + " Time: " + (System.currentTimeMillis()-time));
		}

	}

}
