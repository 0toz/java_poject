package com.ict06.Thread;

public class Ex11_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : 시작");
		Ex10 t1 = new Ex10();
		Ex11 t2 = new Ex11();

		Thread thread1 = new Thread(t1);
		thread1.setDaemon(true);
		thread1.start();
		
		
		//new Thread(t2).start();
		Thread thread2 = new Thread(t2);
		thread2.setDaemon(true);
		thread2.start();
		
		for (int i = 0; i < 51; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		System.out.println(Thread.currentThread().getName() + " : 끝");

	}

}
