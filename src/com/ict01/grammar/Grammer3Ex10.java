package com.ict01.grammar;
import java.util.Scanner;

class Grammer3Ex10 {

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);

	int workTime = sc.nextInt();
	
	int sum = (workTime <= 8) ? (workTime * 8720) : (int)((workTime - 8) * 8720 * 1.5)+ (8 * 8720);        
	

	System.out.println("당신의 금액은 " + sum);
	}

}