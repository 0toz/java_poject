package com.ict01.grammar;
import java.util.Scanner;

class Grammer3Ex08{

	public static void main(String[] args){
	//¼ýÀÚ ¹Þ¾Æ È¦¼ö Â¦¼ö ±¸ºÐ


	Scanner sc = new Scanner(System.in);

	int num = sc.nextInt();

	String answer = (num % 2 == 0) ? "Â¦¼ö" : "È¦¼ö";


	
	System.out.println(num + "Àº " + answer + "ÀÔ´Ï´Ù.");
	}
}