package com.ict01.grammar;
import java.util.Scanner;

class Grammer4Ex09 
{
	public static void main(String[] args) 
	{
		//무한루프에서 숫자를 받아 짝수 홀수 판별.


	// 1 - 10까지 짝수만 출력. 컨티뉴사용.
		for(int i = 1; i< 11; i++){

			if(i%2 ==1) continue;
			System.out.println(i);
		}










		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("숫자를 입력하세요  :");
			int k = sc.nextInt();
			String msg = "";
			if(k%2 ==0) {
				msg = "짝수 ";
			}else{
				msg = "홀수";
			}

			System.out.println(k + "는 " + msg + "입니다.");

			System.out.println("계속 할까요? ( 1. Yes , 2. No ) ");
			int k2  = sc.nextInt();
			if(k2 == 2)break;

//잘못 입력하면 다시 입력하게끔해야함.
		}


	}
}
