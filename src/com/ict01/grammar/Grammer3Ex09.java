package com.ict01.grammar;
import java.util.Scanner;


class Grammer3Ex09{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� ���� : ");
	int kor = sc.nextInt();


	System.out.print("���� ���� : ");
	int eng = sc.nextInt();

	System.out.print("���� ���� : ");
	int math = sc.nextInt();
	
	double sum = kor + eng + math;

	String res = sum/3 >= 60 && kor >= 40 && eng >=40 && math>= 40 ? "�հ�" : "���հ�";

	System.out.println("����� : " + res);



	}
}
