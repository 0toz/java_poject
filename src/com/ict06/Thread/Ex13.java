package com.ict06.Thread;

public class Ex13 implements Runnable {
	int x = 0;

	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
		}
	}
}
