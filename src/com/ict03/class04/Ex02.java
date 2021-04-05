package com.ict03.class04;

public class Ex02 extends Ex01 {

	@Override
	public void sound() {
		// TODO Auto-generated method stub

	}
//오버라이딩 안하려면 자식클래스를 추상 클래스로 만들어야함.
	
	// 부모의 추상메소드를 구체화 하지않고 또 추상메소드를 추가함.
	abstract class Ex03 extends Ex01 {
		public void song() {
			System.out.println("노래하기");
		}
	}
	abstract class Ex04 extends Ex01{
		public void music() {
			System.out.println("댄스음악");
		}
	}

	public abstract void pop() 	;
	
	
}
