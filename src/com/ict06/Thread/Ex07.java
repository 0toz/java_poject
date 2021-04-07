package com.ict06.Thread;

public class Ex07 implements Runnable {
	//Runnable 인터페이스는 run()만 가지고 있다.
	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + " : " + " aaaa");
		}

	}

}
