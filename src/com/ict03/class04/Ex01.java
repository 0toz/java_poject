package com.ict03.class04;

public abstract class Ex01 {
// 추상 클래스 : 추상메소드를 가지고 있는 클래스를 추상클래스 라고 한다.
	
	// 일반 적인 메소드와 필드를 가질 수 있다.
	
	int s1  =10; //인스턴스 변수
	static int s2 = 10; //스태틱 변수
	final int S3 = 10; //인스턴스 상수
	static final int S4 = 10; //스태틱 상수
	
	public void play() {
		System.out.println("인스턴스 메소드");
		
	}
	public static void prn() {
		System.out.println("static 메소드");
	}

	//추상메소드
	public abstract void sound();

}

