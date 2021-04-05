package com.ict03.class01;

public class Ex03 {

	public static void main(String[] args) {
		
		//1. Ex02클래스를 사용하기 위해서 클래스를 객체로 만들자.
		// 클래스 참조변수 = new 생성자;
//스태틱 변수들은 개체 생성과 상관없이 미리 만들어진다.
//		 호출은  클래스 이름.메소드.

//		System.out.println(Ex02)//주소
		
//		System.out.println(Ex02.k1);에러
		System.out.println(Ex02.k2);
//		System.out.println(Ex02.K3);에러
		System.out.println(Ex02.K4);
//개체생성과 상관없이 갖다 쓰는놈. 스태틱.
		
		
		
		
		Ex02 test = new Ex02();
		
		System.out.println(test);//주소
		
		System.out.println(test.k1);
//		System.out.println(test.k2);
		System.out.println(test.K3);

		
//		생성해야.가져다 쓸수 있는 인스턴스
	}

}
