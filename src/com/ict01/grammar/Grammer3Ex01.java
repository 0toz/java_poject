package com.ict01.grammar;
class Grammer3Ex01{
	public static void main(String[] args){

	int s1 = 10;
	int s2 = 7;

	boolean result = true && true;
	System.out.println(result);

	result = (s1 >= 7) && (s2 >= 5);
	System.out.println(result);


	result = ((s1= s1+2) < s2) && (s1 == (s2 = s2 +5));
	System.out.println("결과 : " + result);
	System.out.println("s1 : " + s1);
	System.out.println("s2 : " + s2);


	result = (s1 >= 'a') && (s1 <= 'z');
	System.out.println("결과 : " + result);

	}


}