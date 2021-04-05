package com.ict03.class02;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {

		//2.(int)(nextDouble() * 숫자 )// : 0- 1정수전까지 난 수 발생.
		//더블을 더 많이 씀 경우의 수가 훨시 넓어서.
	//	자료형의 데이터를 무작위로 추출.

		Random ran = new Random();
		
		System.out.println("boolean형 : " + ran.nextBoolean());
		System.out.println("int형 : " + ran.nextInt());
		System.out.println("Long형 : " + ran.nextLong());
		//실수형태는 0.0이상  ~ 1.0미만.
		System.out.println("float형 : " + ran.nextFloat());
		System.out.println("double형 : " + ran.nextDouble());



//		0.0 - 1.0 * 3 // 0~2이다.

		int s3 = (int)(Math.random()*3);
//		3가지 수 중 하나가 나온다.


		//E 자연상수
		//PI 원주율

		//2. Math 클래스 : 생성자가 없다.
	//	메소드들이 static 이다. 객체생성 하지않고 호출가능.
				


//		abs 절대값 반환
		System.out.println(Math.abs(100));
		System.out.println(Math.abs(-100));

		//ceil( 올림) round(반올림), floor(버림)
		System.out.println("올림 : " + Math.ceil(3.45));
		System.out.println("올림 : " + Math.ceil(3.55));

		System.out.println("버림 : " + Math.floor(3.45));
		System.out.println("버림 : " + Math.floor(3.55));
		System.out.println("반올림 : " + Math.round(3.45));
		System.out.println("올림 : " + Math.round(3.55));


		//5. max 둘중 큰 값 찾기
		//static double 

		//max(double a, double b) 되도록 오버로딩할땐 자료형별로 만들어 주면 좋다.


		//6.pow(double a , double b) 제곱
		System.out.println (Math.pow(2,3)); // 0-8
		System.out.println(Math.pow(3,2)); // 0- 9

	}
}
