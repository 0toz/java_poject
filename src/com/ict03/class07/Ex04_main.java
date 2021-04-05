package com.ict03.class07;

import com.ict03.class07.Ex04.Inner03;

public class Ex04_main {
	public static void main(String[] args) {
		// static 내부클래스는 객체 생성 가능, static은 그냥 호출 가능.
		System.out.println(Inner03.i3);
		System.out.println(Inner03.i4);

	Inner03 t1 = new Inner03();//내부클래스 자체를 객체생성.
	System.out.println(t1.name);
	System.out.println(t1.i2);
	
	t1.play();
	
	
	
	
	//외부클래스에 의해 내부클래스가 종속적으로 변화. 객체지향 언어에선 좀 안맞음. 종속일 필요가 있을때만 씀.
	}
}
