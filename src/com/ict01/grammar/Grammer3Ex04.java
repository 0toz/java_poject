package com.ict01.grammar;
class Grammer3Ex04 {
	public static void main(String[] args){


	int result = true ? 14 : 10;
	System.out.println ("���  : " + result);

	result = false ? 14 : 10;
	System.out.println ("���  : " + result);

	int result2 = false ? 14 : 'C';

	System.out.println ("���  : " + result2);

	System.out.println ("���  : " + (char)(result2));


// �־��� Sum�� 80 �̻��̸� "�հ�", �ƴϸ� "���հ�";
	int sum = 81;
	String result3 = (sum >= 80) ? "�հ�" : "���հ�" ;
	System.out.println("��� : " + result3);

// ��������� 90�̻��̸� A �ƴϸ� B�̴�.

	double avg = 87.0;
	double result4 = (avg >= 90)? 'A': 'B' ;
//����� ��Ʈ �ڷ����� �޶� �������ȵ����� �񱳴� ����.

	System.out.println ("���  : " + (char) (result4));



	}
}