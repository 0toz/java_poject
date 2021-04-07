package com.ict06.Thread;

// 
public class Ex03 extends Thread {
	public void go() {

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}

//	public void start() {
//
//		for (int i = 10; i < 20; i++) {
//			System.out.println(Thread.currentThread().getName() + " : " + i);
//		}
//	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}

}
