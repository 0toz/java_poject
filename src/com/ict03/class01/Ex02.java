package com.ict03.class01;

public class Ex02 {
//	클래스안에는 3가지 존재
//	멤버필드 멤버 메서드 생성자.
//	멤버필드는 상소와 변수로 나뉨. static과 instance로 나뉨
	public static void main(String[] args) {
//	지역변수 사용가능.
	}
		int k1 = 80; //인스턴스
		static int k2 = 90; //스태틱변수.
		final int K3 = 85; //  인스턴스 상수. final이붙으면 상수.
		static final int K4 = 95; // static상수 API에서 제공하는 상수 형태


//		멤버메소드 : 동작 , 기능.
		
		// 인스턴스 이면서 반환형이 없다.
		public void prn01() {
			k1 = k1 +20;
			k2 = k2 +10;
//			K3 = K3 + 15;//상수
//			K4 = k5	+ 5;//상수 값변경 안되서 오류
			System.out.println("k1 = " + k1);
			System.out.println("k2 = " + k2);
	
			//미리만들어진놈인 static을 지역변수로 할 수 없다.
		}
//		스태틱 반환형이 없다. return쓸수는 있음.
		public static void prn02() {
			//스태틱 메서드에서는 인스터스 변수를 사용할 수 없다.
			
		}
//		인스턴스 반환형 존재 마지막줄에 return '보낼데이터'가 있어야함.
		public int prn03() {
			
			return 'c'; //가능
		}
//		스태틱 반환형이 있음.
		public static double prn04() {
			
			return '3';
		}
		
	
	

}
