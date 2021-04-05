package com.ict03.class01;

public class Ex06_main {

	public static void main(String[] args) {
		//static은 객체 생성과 상관없이 사용가능.
		
		// 클래스이름. 멤버필드, 클래스이름.멤버메소드
		
		System.out.println(Ex06.s3);
		//스태틱이라도 프라이빗은 접근할 수 없다.
		System.out.println(Ex06.s3);
		
		
		Ex06 test = new Ex06();
		
		System.out.println(test.s1);
		System.out.println(test.s3);
	
	
		
		System.out.println("이름 : " + test.s1 );
		
	}

}
