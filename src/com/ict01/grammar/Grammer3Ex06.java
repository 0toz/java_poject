package com.ict01.grammar;
class Grammer3Ex06{
	public static void main(String[] args){
	char k1  = '*';
	String res1 = (k1 >= 'A' && k1 <= 'Z')? "�빮��" : 
		(k1 >= 'a' && k1 <= 'z') ? " �ҹ���" : "��Ÿ����" ;

	System.out.println(res1);

	int k2 = 85;

	String score = (k2 >= 90) ? "A����" : ( k2 >= 80) ? "B����" : "F����";

	System.out.println("����� : " , score);


	int k3 = 2;
	
	String res = (k3 == 1 || k3 == 3) ? "����" : (k3 == 2 || k3 == 4) ? "����" : "�ܱ���";


	System.out.println("����� : " , res);






	}


}