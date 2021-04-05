package com.ict01.grammar;
import java.util.Scanner;

class Grammer3Ex07{
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	System.out.print("당신의 이름 : ");
	// 저장된 정보를 가져오자.
//	(가지고 온 정보를 String 으로 만들자)
	System.out.println(scan.next());


	System.out.print("국어 점수 : ");
	System.out.println(scan.next());


	System.out.print("영어 점수 : ");
	System.out.println(scan.next());

	System.out.print("수학 점수 : ");
	System.out.println(scan.next());

	double sum = kor + eng + math;
	System.out.println("총점 : " + sum);

	Systme.out.print("당신의 키는? : ";
	double height = scan.nexDouble();

	}
}

