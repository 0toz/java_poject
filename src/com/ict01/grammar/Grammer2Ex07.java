package com.ict01.grammar;
class Grammer2Ex07 {
	public static void main(String[] args){
	// �̸��� ȫ�浿�� ����� ���� 90 ���� 80 ���� 90
//������ ����� ���Ͻÿ�.
//������� �Ҽ��� ù°�ڸ�.



	String name = "ȫ�浿";
	int Kscore = 90;
	int Escore = 80;
	int Mscore = 90;
	int sum = Mscore + Escore +Kscore;
	double avr = (int)(sum *10 / 3.0 ) /10.0;
	

	System.out.println("�̸��� : "+ name);
	System.out.println("������ : "+ (Kscore+Escore+Mscore));
	System.out.println("����� : "+ avr);




	}
}