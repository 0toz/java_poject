package com.ict03.class05;

public interface Ex01 {
	// 인터페이스는 서비스를 제공하는 목록과 같은것 .
	// 상수와 추상 메소드 들로 이루어져있다.
	// 생성자가 없다. (객체 생성 못함 )  >> 실제 사용없음. >> 그래서 다중상속가능
	
	
	//실제 사용하기 위해서는 인터페이스를 상속받은 클래스가 있고
	//상속받은 클래스를 사용하는 것이다.
	// 인터페이스가 같다는 말은 대쳬(호환)이 가능하다는 뜻.
	
	final int su1 = 10;
	static final int su2 = 20;
	int su3 = 30;
	static int su4 = 40;
	
//	위 멤버 필드들은 모두 static final 이다.
	// 인터페이스에서 추상메소드가 아닌것을 선언해서 그럼.
	//public void play() { };
	public abstract void like();
	
	public void sound();
	// 인터페이스 안에서는 abstract 예약어를 사용하지않아도된다.
	
}
