package com.ict03.class03;

public class Ex15 extends Ex14{
	String name = "홍일점";
	int id = 2410;
	public Ex15() {
		super("일지매", 14);
		System.out.println("자식클래스 생성자 :"+ this);
		name ="홍두깨";
		id = 1004;
	}
	
	public Ex15(String name) {
		super("태권브이", 43);
		this.name =name;
	}
	
	public void prn() {
		String name ="홍시";
		//지역,전역,부모 모두같은이름의변수를가지고있다. ; 반드시구분.
		System.out.println("지역변수이름 :" + name);
		System.out.println("전역변수이름 :" + this.name);
		System.out.println("부모변수이름 :" + super.name);
		
		// 부모만 가지고있는변수 :구분하지않아도됨.
		System.out.println("지역변수이름 :" + age);
		System.out.println("전역변수이름 :" + this.age);
		System.out.println("부모변수이름 :" + super.age);
	
		//전역변수만 가지고 있는 변수
		System.out.println("지역변수이름 :"+ id);
		System.out.println("전역변수이름 :"+ this.id);
		//System.out.println("부모변수이름 :"+ super.id);// 부모만가지고있다.
		
	
	}
}
