package com.ict01.grammar;
class Grammer4Ex01{

	public static void main(String[] args){
	
	//char k1이 A이면 아프리카 B이면 브라질, C이면 캐나다 .나머지한국.

	char k1 = 'C';
	String str = "";//초기화 안시켜두면 에러 날지 모르니...
	switch(k1){
		case 'A' : str = "아프리카"; break;

		case 'B' : str = "브라질"; break;

		case 'C' : str = "캐나다" ; break;
		
		default : str = " 한국" ;
	}

	System.out.println("결과 : " + str);

	}
}