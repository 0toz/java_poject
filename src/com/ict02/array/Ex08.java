package com.ict02.array;

import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		char[][] ch1;
		ch1 = new char[3][];
		
//		ch1[0][0] = 'j';
//		ch1[0][1] = 'a';
//		ch1[0][2] = 'v';
//		ch1[0][3] = 'a';
//		ch1[1][0] = 'j';
//		ch1[1][0] = 'J';
//		ch1[1][0] = 'A';
//		ch1[1][0] = 'V';
//		ch1[2][0] = 'A';
//		ch1[2][1] = 'n';
//		ch1[2][2] = 'd';
//		ch1[2][3] = 'r';
//		ch1[2][4] = 'o';

	
		for(int i =0; i <ch1.length ; i++) {
			for (int j = 0; j < ch1.length; j++) {
				System.out.println(ch1[i][j] + " ");
			}
		}
		char[][] ch2 = {{'J','A','V','A'} , {'ÀÚ','¹Ù'},{'1','2','3'}};
	
		for (int i = 0; i < ch2.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				System.out.println(ch1[i][j]);
			}
		}
	
	
	
	
	}
}
