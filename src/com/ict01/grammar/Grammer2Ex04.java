package com.ict01.grammar;
class Grammer2Ex04{

	public static void main(String[] args){
	// ���ڵ��� ũ�⿡ ���� ���� ����

// char < int < long < float < double
// ����<  ������ ���� < �Ǽ��� ����

// ����ȯ : �ڵ�����ȯ�� ���� ����ȯ
//�ڵ�����ȯ ���� �ڷ����� ū �ڷ����� ����ɶ� 
//

//char �� int�� ������ �� �ִ�.
	char c1 = 'a';
	System.out.println(c1);//a


	int s1 = 'a';
	System.out.println(s1);//97


	int s2 = c1;
	System.out.println(s2);//97

// ���� ����ȯ ��ȣ�� �������� ������ ����. �ڷ����� �����.

	byte k1 = (byte)128; //-128 ���� �����ڸ�ó�� �Ѿ��.
	System.out.println(k1);



	int k3 = 97;
	char k4 = (char)(k3);
	System.out.println(k4);

	//int k5 = 87.64; // ������ ��Ʈ�� ��.
	int k5 = (int)(87.64);
	System.out.println(k5);
	
//�Ҽ��� ù° ¥���������ϱ�.


	double k6 = 87.64;

	double k7 = (int)(k6 * 10);
	k7 = k7 / 10;

	System.out.println(k7);

	}

}
