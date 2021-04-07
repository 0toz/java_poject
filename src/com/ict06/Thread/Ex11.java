package com.ict06.Thread;

public class Ex11 implements Runnable {
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + " : aaaaa");
		}
	}
}
