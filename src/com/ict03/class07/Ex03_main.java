package com.ict03.class07;

public class Ex03_main {
	public static void main(String[] args) {
		//Ex03 t1 = new Ex03();
		// Ex03.Inner02 t2 = t1.new Inner02();
// 멤버 내부클래스 처럼 객체 생성 못함.
	
//	외부클래스 객체 생성
	Ex03 t1 = new Ex03();
	
//	내부크래스를 가지고 있는 메소드를 실행해야 내부클래스를 만들 조건이 된다.
// 내부클래스를 가지고 있는 메소드를 실행해야 내부클래스를 만들 조건이 된다.
//	내부클래스의 끝과 내부클래스의 메소드가 끝나는 지점 사이에서 객체생성과 실행을 다해야 한다.
//	
//	메서드가 끝나 
t1.play();
	}

}
