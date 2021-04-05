package com.ict01.grammar;
import java.util.Scanner;


class Grammer3Ex09{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("국어 점수 : ");
	int kor = sc.nextInt();


	System.out.print("영어 점수 : ");
	int eng = sc.nextInt();

	System.out.print("수학 점수 : ");
	int math = sc.nextInt();
	
	double sum = kor + eng + math;

	String res = sum/3 >= 60 && kor >= 40 && eng >=40 && math>= 40 ? "합격" : "불합격";

	System.out.println("결과는 : " + res);



	}
}
