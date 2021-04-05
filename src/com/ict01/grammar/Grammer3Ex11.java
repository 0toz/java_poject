package com.ict01.grammar;
import java.util.Scanner;

class Grammer3Ex11 {
	public static void main(String[] args){
	//단순 이프 조건식이 참일때만 실행하는것.
	//거짓일때 이프문을 무시.

	//형식 : if(조건식){
	//	조건식이 참일때 실행할 문장;
	//	조건식이 참일때 실행할 문장;
	//	}
	// 단 실행할 문장이 한줄이면 {}블록 생략가능.
	
	int g1 = 80;
	String res = "초기값";
	if(g1 >=80){
		res = "합격";
	}

	Scanner sc = new Scanner(System.in);	

	int k1= 80;
	if(k1 >= 60){
	System.out.println("합격");
	}
	else {
	System.out.println("불합격");
	}
	

	int k2 = 3;
	if(k2 % 2 ==0 ){
		System.out.println("짝수");
	}
	else {
		System.out.println("홀수");
	}



	char k3 = 'S';
	if('A' <= k3 && k3 <= 'Z'){
		System.out.println("char k3 는 대문자이다.");
	
	}
	else {
		System.out.println("char k3는 대문자가 아니다.");
	}

	int k4 =2;
	if(k4 == 1 || k4 == 3){
		System.out.println("남자");

	}
	else{
	System.out.println("여자");
	}	

	int workT = 12;
	int pay;
	if(0 <= workT && workT <= 8){
	pay = workT * 8720;
	}
	else{
	pay = (int)((workT - 8) * 8720 * 1.5) + 8 * 8720;
	}
 	System.out.println(pay + "를 받아야 합니다.");





	}
}
