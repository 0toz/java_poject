package com.ict01.grammar;
class Grammer3Ex12{

	public static void main(String[] args){
//다중 if문 조건식이 거짓일때 다시 조건식을 사용한다.
// if (조건식 1) {
// 	조건식이 참일때 실행;
//	}else if(조건식2){
//	조건식 1은 거짓이면서 조건식 2는 참일 때.	
//	}else{
// 	조건식 1,2,3  모두 거짓일 때 나머지 경우.
//	}
// 엑셀은 이프를 7개까지밖에 쓸 수 없다.



//	int k1의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지 F
//	char k2 가 대문자인지, 소문자인지
//	char k3 A,a이면 아프리카  ? B,b 브라질 Cc 캐나다 나머지 한국.


	int k1 = 75	;
	if( k1 >= 90) {
	System.out.println("A");
	}else if( k1 >= 80) {
		System.out.println("B");
	}else if(k1 >= 70){
		System.out.println("C");
	}else{
		System.out.println("F");
	}

	
	System.out.println('0');	

	char k2 = '2';
	if('A'<= k2 && 'Z' >= k2){
		System.out.println("대문자");
	}else if('a'<= k2 && 'z' >= k2){
		System.out.println("소문자");
	}
	else if( '0' <= k2 && '9'>= k2){
		System.out.println("숫자");	
	} else{
		System.out.println("기타 문자");
	}


	char k3 = 'c';
	if('A'== k3 || 'a' == k3){
		System.out.println("아프리카");
	}else if('B'== k3 || 'b' == k3){
		System.out.println("브라질");
	}
	else if( 'C' == k3 || 'c'== k3){
		System.out.println("캐나다");	
	} else{
		System.out.println("한국");
	}

	int money = 0;
	int menu = 4 ;
	if(menu == 1){
	money = 10000 - (int)(3500 * 1.1 * 2);
	} else if(menu == 2){
	money = 10000 - (int)(4000 * 1.1 * 2);
	}else if(menu == 3){
	money = 10000 - (int)(3000 * 1.1 * 2);
	}else if(menu == 4){
	money = 10000 - (int)(3500 * 1.1 * 2);
	}
	System.out.println(money);



	}
}