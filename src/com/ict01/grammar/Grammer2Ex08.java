package com.ict01.grammar;
class Grammer2Ex08{

	public static void main(String[] args){
	//�Ƹ޸�ī�� 2500 ģ���� ���̼� 10000���� �ֹ�.
//�ܵ���? �ΰ��� 10����.
	
	int pay = 2500;
	double tax = 2500 / 10;

	int sum = (int)(10000 - pay * 2 - tax * 2);

	System.out.println("�ܵ��� "+ sum);	



	}
}