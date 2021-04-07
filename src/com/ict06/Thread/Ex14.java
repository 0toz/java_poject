package com.ict06.Thread;

public class Ex14 implements Runnable {
	// 동기화 처리 할 떄 실행 중인 스레드를 강제로 대기 상태로 변경 시키는 메소드를 wait() 라고 한다.
//	한번 wait()된 스레드는 풀어주지 않으면 그대로 대기 상태에서 프로그램이 종료된다.
//	wait()된 스레드를 풀어주는 메소드를 notify(), notifyAll()이라고 한다.
	

	@Override
	public synchronized void run() {
		int x = 0;
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
			if (x == 25) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notify();
			}
		}
	}
}
