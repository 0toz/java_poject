package com.ict01.grammar;
import java.util.Scanner;

class Grammer3Ex11 {
	public static void main(String[] args){
	//�ܼ� ���� ���ǽ��� ���϶��� �����ϴ°�.
	//�����϶� �������� ����.

	//���� : if(���ǽ�){
	//	���ǽ��� ���϶� ������ ����;
	//	���ǽ��� ���϶� ������ ����;
	//	}
	// �� ������ ������ �����̸� {}��� ��������.
	
	int g1 = 80;
	String res = "�ʱⰪ";
	if(g1 >=80){
		res = "�հ�";
	}

	Scanner sc = new Scanner(System.in);	

	int k1= 80;
	if(k1 >= 60){
	System.out.println("�հ�");
	}
	else {
	System.out.println("���հ�");
	}
	

	int k2 = 3;
	if(k2 % 2 ==0 ){
		System.out.println("¦��");
	}
	else {
		System.out.println("Ȧ��");
	}



	char k3 = 'S';
	if('A' <= k3 && k3 <= 'Z'){
		System.out.println("char k3 �� �빮���̴�.");
	
	}
	else {
		System.out.println("char k3�� �빮�ڰ� �ƴϴ�.");
	}

	int k4 =2;
	if(k4 == 1 || k4 == 3){
		System.out.println("����");

	}
	else{
	System.out.println("����");
	}	

	int workT = 12;
	int pay;
	if(0 <= workT && workT <= 8){
	pay = workT * 8720;
	}
	else{
	pay = (int)((workT - 8) * 8720 * 1.5) + 8 * 8720;
	}
 	System.out.println(pay + "�� �޾ƾ� �մϴ�.");





	}
}
