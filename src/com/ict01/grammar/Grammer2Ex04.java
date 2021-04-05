package com.ict01.grammar;
class Grammer2Ex04{

	public static void main(String[] args){
	// 숫자들의 크기에 따른 저장 원리

// char < int < long < float < double
// 문자<  정수형 숫자 < 실수형 숫자

// 형변환 : 자동형변환과 강제 형변환
//자동형변환 작은 자료형이 큰 자료형에 저장될때 
//

//char 를 int에 저장할 수 있다.
	char c1 = 'a';
	System.out.println(c1);//a


	int s1 = 'a';
	System.out.println(s1);//97


	int s2 = c1;
	System.out.println(s2);//97

// 강제 형변환 등호를 기준으로 무조건 왼쪽. 자료형에 맞춘다.

	byte k1 = (byte)128; //-128 나옴 십의자리처럼 넘어간것.
	System.out.println(k1);



	int k3 = 97;
	char k4 = (char)(k3);
	System.out.println(k4);

	//int k5 = 87.64; // 더블을 인트에 탭.
	int k5 = (int)(87.64);
	System.out.println(k5);
	
//소숫점 첫째 짜리까지구하기.


	double k6 = 87.64;

	double k7 = (int)(k6 * 10);
	k7 = k7 / 10;

	System.out.println(k7);

	}

}
