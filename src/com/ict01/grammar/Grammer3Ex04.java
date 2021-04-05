package com.ict01.grammar;
class Grammer3Ex04 {
	public static void main(String[] args){


	int result = true ? 14 : 10;
	System.out.println ("결과  : " + result);

	result = false ? 14 : 10;
	System.out.println ("결과  : " + result);

	int result2 = false ? 14 : 'C';

	System.out.println ("결과  : " + result2);

	System.out.println ("결과  : " + (char)(result2));


// 주어진 Sum이 80 이상이면 "합격", 아니면 "불합격";
	int sum = 81;
	String result3 = (sum >= 80) ? "합격" : "불합격" ;
	System.out.println("결과 : " + result3);

// 평균점수가 90이상이면 A 아니면 B이다.

	double avg = 87.0;
	double result4 = (avg >= 90)? 'A': 'B' ;
//더블과 인트 자료형은 달라서 저장은안되지만 비교는 가능.

	System.out.println ("결과  : " + (char) (result4));



	}
}