package com.ict06.Thread;

// 문제 : 두개의 스레드를 생성하여 첫번쨰 스레드의 출력을 1- 100 까지 출력하고 두번쨰 스레드의 출력은 101-200까지 출력하라(synchronized사용)
public class Ex15 implements Runnable {
	@Override
	public synchronized void run() {
		int x = 0;
		if(Thread.currentThread().getName().equals("Thread-1")) {
			x += 100;
		}
		
		for (int i = 0; i < 200; i++) {
			if (i == 100) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
			
		}
	}

	
	
}
