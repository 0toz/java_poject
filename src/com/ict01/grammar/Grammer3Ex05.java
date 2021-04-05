package com.ict01.grammar;
class Grammer3Ex05 {

	public static void main(String[] args){

	int k1  = 70;
	String result1 = (k1 >= 60) ? ("합격") : ("불합격");
	System.out.println("결과 : " + result1);

	int k2 = 46 ;
	String result2 = (k2 %  2 == 0) ? ("짝수") : ("홀수");
	System.out.println("결과 : " + result2);


	char k3 = 'D';
	String result3 = (k3 >= 'A' && k3 <= 'Z') ? ("대문자 ") : ("소문자") ;
	System.out.println("결과 : " + result1);

	//int k1 가 60이상이면 합격 아니면 불합격.
	//int k2 가 홀수인지 짝수인지 판별
	//	 char k3 가 대문자인지/

	// 근무시간이 8시간까지는 시간당 8720원이고 8시간을 초과한 시간만큼은 1.5배이다.
	// 현재 근무시간이 10시간이다 얼마를 받아야하는가?

	int workT = 10;
	int sum = (workT < 8) ? (workT * 8720) : (int)(((workT -8)* 8720 * 1.5)+ 8720 * 8);
	System.out.println("결과 : " + sum);


	}



}