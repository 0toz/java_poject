package com.ict06.Thread;

public class Ex15_main {
	public static void main(String[] args) {
		Ex15 t1 = new Ex15();
		
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		Thread thread2 = new Thread(t1);
		thread2.start();
		
	}
}
