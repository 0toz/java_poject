package com.ict01.grammar;
class Grammer2Ex12{
	public static void main(String[] args){
	
	int s1 = 90;
	int s2 = 80;
	boolean res = s1 >= s2;

	System.out.println("��� : " + res);

	char s3 = 'c';
	char s4 = 'a';
	res = s3 >= s4;

	System.out.println("��� : " + res);

	res = 'a' >= 97;
	System.out.println("��� : " + res);


	res = 97 >= 97.0001;
	
	System.out.println("��� : " +res);

	System.out.println();
	String str1 = "���ѹα�";
	String str2 = "���ѹα�";
	//res = str1 > str2;
	
	//System.out.println("��� : " + res);
	//res = str1 >= str2;
	//System.out.println("��� : " + res);
	res = str1 == str2;
	System.out.println("��� : " + res);

	}
}