package com.ict06.Thread;

public class Ex16 implements Runnable {
// 두개의  스레드를 생성하여 첫번쨰 스레의 출력을 1- 50 까지 출력하고
//	두번쨰 쓰레드의 출력을 51-100까지 출력하고,
//다시 첫번째 스레드가  101-150까지 출력,
//두번째 스레드가 151 -200까지 출력 (synchronized)

	@Override
	public synchronized void run() {
		int x = 0;
		if(Thread.currentThread().getName().equals("Thread-1")) {
			x += 50;
		}
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));

			if (x == 50 || x== 100 || x ==150) {
				try {
					x += 50;
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				notify();
			}
		}
	}

}
