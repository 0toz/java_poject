package com.ict01.grammar;
class Grammer4Ex01{

	public static void main(String[] args){
	
	//char k1�� A�̸� ������ī B�̸� �����, C�̸� ĳ���� .�������ѱ�.

	char k1 = 'C';
	String str = "";//�ʱ�ȭ �Ƚ��ѵθ� ���� ���� �𸣴�...
	switch(k1){
		case 'A' : str = "������ī"; break;

		case 'B' : str = "�����"; break;

		case 'C' : str = "ĳ����" ; break;
		
		default : str = " �ѱ�" ;
	}

	System.out.println("��� : " + str);

	}
}