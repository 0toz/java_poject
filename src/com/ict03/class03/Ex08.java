package com.ict03.class03;

public class Ex08 {
	public static void main(String[] args) {
		Ex06_MP3 mp3 = new Ex06_MP3();
		mp3.call();
		
		System.out.println("실행전 : " + mp3.s_sms);
		mp3.sms();
		System.out.println("실행후 : " + mp3.s_sms);
		mp3.sound();
		
		Ex07_DCa dca = new Ex07_DCa();
		dca.call();
		
		System.out.println("실행전 : " + dca.s_sms);
		dca.sms();
	
		System.out.println("실행후 : " + dca.s_sms);
	
		dca.picture();
	
		System.out.println("======================");
		
		
		//상속관계에서는 부모클래스를 가지고 선언 할 수 있다.
		// 단 , 자식 클래스의 메소드를 사용할 수 없다.
		// p1은 Ex06_Mp3클래스의 고유 메소드인 sound()는 실행 할 수 없다.
		
		Ex05 p1 = new Ex06_MP3();
		p1.call();
		p1.sms();
		System.out.println(p1.s_sms);
		//오류 p1.sound();
		
		
		
		
	}
}
