package com.ict03.class01;

public class Ex05_main {
	public static void main(String[] args) {
		Ex05 test = new Ex05();
		
		int k1 = test.add();
		int k2 = test.add2(100);
		int k3 = test.add3(100, 1000);
		int k4 = test.add4(90,80,90);
		
	System.out.println("k1 = " + k1);
	System.out.println("k2 = " + k2);
	System.out.println("k3 = " + k3);
	System.out.println("k4 = " + k4);
	}
	
}
