package com.ict03.class07;
// 1. Member 내부클래스

public class Ex02 {
	String name = "홍길동";
	private int age = 24;
	static String addr = "제주도";

	public Ex02() {
		System.out.println("외부 클래스 생성자 : " + this);
	}

	public void sound() {
		int money = 1000;
		final int time = 2;
//		static int number = 12;
//		static final int number2 = 12; 지역변수는 스태틱을 쓸 수 없다.

		System.out.println("외부클래스 메소드 : " + name + ", money : " + money);
	}

	public static class Inner01 {

		String name = "홍일점";
		final int i2 = 10;
		// 내부클래스에서는 static 사용못함.
		static int i3 = 20;
		static final int i4 = 30;

		// 내부클래스는 외부클래스와 메서드를 마음대로 사용한다.
		public Inner01()
		{
			System.out.println("내부클래스 생성자 : " + this);
		}

		public void sound() {
			int money = 10000;
			System.out.println("이름 : " + name);
			System.out.println("금액 : " + money);
			System.out.println("나이 : " + age);

			// 외부 클래스 메서드
			sound();

		}
	}
}
