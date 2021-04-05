package com.ict03.class01;

public class Ex07_main {

	public static void main(String[] args) {

		Ex07 t = new Ex07();
		
		String s1 = t.k1();
		System.out.println("이름 : " + s1 );
		
		int s2 = t.k2();
		System.out.println("나이 : " + s2);
		
		double s3 = t.k3();
		System.out.println("신장 : " + s3);
		
		char s4 = t.k4();
		System.out.println("점수 : " + s4);
		
		
		t.m1("고길동");
		
		System.out.println(t.k1());
	
	
	}

}
