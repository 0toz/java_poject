package com.ict01.grammar;
class Grammer2Ex06{

	public static void main(String[] args){
	//��������� ; + ,- ,*,/,%[������]
	// �����ڷ����� ū �ڷ����� �����ϸ� ū�ڷ������� ����.
	

	//������ ����
	int k1 = 21755; // => 21750�� ������.
	int s1 = k1 /10; // 2175	
	int s3 = s1*10 ; //21750

	int s4 = (21755/10) * 10;
	System.out.println("s3 = " + s3);
	System.out.println("s4 = " + s4);


	//�Ҽ��� ù°�ڸ��������ϱ�
	//int k2 = 24.6843 // => 24.6


	double k2 = 24.6843;
	double s5 = (int)(k2 *10) / 10; //246'
	double s6 = s5/ 10.0;
		
	double s7 = (int)(k2*10) /10.0;
	double s8 = (int)(24.6843 * 10)/10.0;
	System.out.println("s7 = " + s7);
	System.out.println("s8 = " + s8);



	int su1 = 7;
	int su2 = 3;
	int res1 = 7 / 3;
	int res2 = 7 % 3;

	}

}
