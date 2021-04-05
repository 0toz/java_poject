package com.ict03.class03;

public class Ex02 {
	String name = "차범근";
	int age = 57;
	String addr = "서울 우리집 거실";
	private String dog = "댕댕이";
	static int car = 2;

	public Ex02() {
		System.out.println("부모 클래스 생성자" + this);
	}
	
	public void prn() {
		System.out.println("부모 클래스 메서드");
	}
	
	public static void play() {
		System.out.println("부모 클래스 static 메소드");
	}
	
	
	public void eat() {
		System.out.println("우리집안은 무조건 아침식사를 한다.");
	}
	
	public final void walk() {
		System.out.println("하루에 무조건 한시간은 걷는다.");
	}
	// 오버라이딩 ; 부모메소드를 그대로 사용하는 것. 겉모양은 그대로 사용하면서 내용만 변경하는 것.[재정의]
	
}
