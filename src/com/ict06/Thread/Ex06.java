package com.ict06.Thread;

public class Ex06 extends Thread{
	public void run() {
		while (true) {
			System.out.println(currentThread().getName() + " : " + " 가가가가");
		}
	}

}
