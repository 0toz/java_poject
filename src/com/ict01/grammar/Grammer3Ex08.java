package com.ict01.grammar;
import java.util.Scanner;

class Grammer3Ex08{

	public static void main(String[] args){
	//���� �޾� Ȧ�� ¦�� ����


	Scanner sc = new Scanner(System.in);

	int num = sc.nextInt();

	String answer = (num % 2 == 0) ? "¦��" : "Ȧ��";


	
	System.out.println(num + "�� " + answer + "�Դϴ�.");
	}
}