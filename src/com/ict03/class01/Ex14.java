package com.ict03.class01;

public class Ex14 {
	
	private String name = "희동이";
	private int age = 3;
	private String addr = "서울";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public Ex14(String name, int age , String addr) {
		this.name = name;
		this.addr = addr;
		this.age = age;

		System.out.println("네번째 생성자");
	}

	public Ex14( int age , String name) {
		this(name, age, "남극");
		

	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Ex14() {
		this("공실이", 21, "남극");
		// 기본생성자 
		// this. 객체 내부에서 객체 자신을 지칭하느 예약어.
		// this 변수 : 전역변수.
		
		// this() 생성자가 생성자를 호출할 떄 사용하는 예약어. 
		// 반드시 생성자 첫줄에만 사용가능. 두번째 줄에 쓰면 오류.
		
		System.out.println("기본생성자 : " + this);
		System.out.println(this.name);
		System.out.println(this.getName());
	}
}
