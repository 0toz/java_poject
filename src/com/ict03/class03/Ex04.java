package com.ict03.class03;

public class Ex04 {
	public static void main(String[] args) {
		//자식을 객체생성하는 게 유리. 부모는 자식거를 못갖다 쓰지만 자식은 부모것을 가져다 쓸 수 있기때문
		Ex03 t1 = new Ex03();
		// 부모 클래스가 먼저 만들어진다!!.
		// t1.name ; 지역변수가 있으면 지역변수를 찾는다. 없으면 전역변수 없으면 부모클래스.
		t1.sound();
		t1.prn();
		
//		this() 자기자신의 생성자를 호출할떄
//		super(); 부모클래스의 생성자를 호출할 때.
		t1.eat();
		
	}
}
