package com.ict01.grammar;
class Grammer3Ex06{
	public static void main(String[] args){
	char k1  = '*';
	String res1 = (k1 >= 'A' && k1 <= 'Z')? "대문자" : 
		(k1 >= 'a' && k1 <= 'z') ? " 소문자" : "기타문자" ;

	System.out.println(res1);

	int k2 = 85;

	String score = (k2 >= 90) ? "A학점" : ( k2 >= 80) ? "B학점" : "F학점";

	System.out.println("결과는 : " , score);


	int k3 = 2;
	
	String res = (k3 == 1 || k3 == 3) ? "남자" : (k3 == 2 || k3 == 4) ? "여자" : "외국인";


	System.out.println("결과는 : " , res);






	}


}