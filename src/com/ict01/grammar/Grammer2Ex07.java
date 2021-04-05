package com.ict01.grammar;
class Grammer2Ex07 {
	public static void main(String[] args){
	// 이름이 홍길동인 사람의 국어 90 영어 80 수학 90
//총점과 평균을 구하시오.
//단평균은 소숫점 첫째자리.



	String name = "홍길동";
	int Kscore = 90;
	int Escore = 80;
	int Mscore = 90;
	int sum = Mscore + Escore +Kscore;
	double avr = (int)(sum *10 / 3.0 ) /10.0;
	

	System.out.println("이름은 : "+ name);
	System.out.println("총점은 : "+ (Kscore+Escore+Mscore));
	System.out.println("평균은 : "+ avr);




	}
}