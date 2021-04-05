package com.ict03.class03;

//Ex02 와 Ex03은 상속관계
public class Ex03 extends Ex02 {
	String name = "차두리";
	int age = 34;
	static String hobby = "영화보기";
	
	public Ex03() {
		System.out.println("자식 클래스 생성자" + this);
	}
	
	public void sound() {
		System.out.println("자식 클래스 메소드");
	}
	
	public void study() {
		System.out.println("공부장소 : " + addr);// 전역변수에서 찾지못함 . 객체 생성없이 부모클래스의 멤버를 사용한것.
		System.out.println("name : " + this.name ); 
		System.out.println("name : " + super.name ); //전역변수에서 찾았다.
		
		//부모와 자식의 변수이름이 같으면 부모 변수에 super.을 붙인다.
	//부모의 것을 내가 쓸 수 있다.
	}
	public void walk() {
		System.out.println("하루에 무조건 한시간은 걷는다.");
	}
	
	//오버라이딩을 할수없게 만드는 예약어 final
	@Override
	public void eat() {
		System.out.println("아침밥은 생략한다.");
	}
	

}
