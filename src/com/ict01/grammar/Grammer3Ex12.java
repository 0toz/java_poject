package com.ict01.grammar;
class Grammer3Ex12{

	public static void main(String[] args){
//���� if�� ���ǽ��� �����϶� �ٽ� ���ǽ��� ����Ѵ�.
// if (���ǽ� 1) {
// 	���ǽ��� ���϶� ����;
//	}else if(���ǽ�2){
//	���ǽ� 1�� �����̸鼭 ���ǽ� 2�� ���� ��.	
//	}else{
// 	���ǽ� 1,2,3  ��� ������ �� ������ ���.
//	}
// ������ ������ 7�������ۿ� �� �� ����.



//	int k1�� ������ 90�̻��̸� A, 80�̻��̸� B, 70�̻��̸� C, ������ F
//	char k2 �� �빮������, �ҹ�������
//	char k3 A,a�̸� ������ī  ? B,b ����� Cc ĳ���� ������ �ѱ�.


	int k1 = 75	;
	if( k1 >= 90) {
	System.out.println("A");
	}else if( k1 >= 80) {
		System.out.println("B");
	}else if(k1 >= 70){
		System.out.println("C");
	}else{
		System.out.println("F");
	}

	
	System.out.println('0');	

	char k2 = '2';
	if('A'<= k2 && 'Z' >= k2){
		System.out.println("�빮��");
	}else if('a'<= k2 && 'z' >= k2){
		System.out.println("�ҹ���");
	}
	else if( '0' <= k2 && '9'>= k2){
		System.out.println("����");	
	} else{
		System.out.println("��Ÿ ����");
	}


	char k3 = 'c';
	if('A'== k3 || 'a' == k3){
		System.out.println("������ī");
	}else if('B'== k3 || 'b' == k3){
		System.out.println("�����");
	}
	else if( 'C' == k3 || 'c'== k3){
		System.out.println("ĳ����");	
	} else{
		System.out.println("�ѱ�");
	}

	int money = 0;
	int menu = 4 ;
	if(menu == 1){
	money = 10000 - (int)(3500 * 1.1 * 2);
	} else if(menu == 2){
	money = 10000 - (int)(4000 * 1.1 * 2);
	}else if(menu == 3){
	money = 10000 - (int)(3000 * 1.1 * 2);
	}else if(menu == 4){
	money = 10000 - (int)(3500 * 1.1 * 2);
	}
	System.out.println(money);



	}
}