package com.ict01.grammar;
class Grammer3Ex05 {

	public static void main(String[] args){

	int k1  = 70;
	String result1 = (k1 >= 60) ? ("�հ�") : ("���հ�");
	System.out.println("��� : " + result1);

	int k2 = 46 ;
	String result2 = (k2 %  2 == 0) ? ("¦��") : ("Ȧ��");
	System.out.println("��� : " + result2);


	char k3 = 'D';
	String result3 = (k3 >= 'A' && k3 <= 'Z') ? ("�빮�� ") : ("�ҹ���") ;
	System.out.println("��� : " + result1);

	//int k1 �� 60�̻��̸� �հ� �ƴϸ� ���հ�.
	//int k2 �� Ȧ������ ¦������ �Ǻ�
	//	 char k3 �� �빮������/

	// �ٹ��ð��� 8�ð������� �ð��� 8720���̰� 8�ð��� �ʰ��� �ð���ŭ�� 1.5���̴�.
	// ���� �ٹ��ð��� 10�ð��̴� �󸶸� �޾ƾ��ϴ°�?

	int workT = 10;
	int sum = (workT < 8) ? (workT * 8720) : (int)(((workT -8)* 8720 * 1.5)+ 8720 * 8);
	System.out.println("��� : " + sum);


	}



}