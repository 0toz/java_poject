package com.ict02.array;

import java.util.Iterator;

public class Ex07 {
	public static void main(String[] args) {
		//다차원 배열 : 1차원 배열이 여러개 모인 것.
		//종류 고정길이 , 가변길이.
		//기본자료형 배열, 참조자료형 배열(클래스로 만드는것.)
	
//		//1.고정길이 배열
//		서언 자료형 [][]이름
//		생성 이름 = new 자료형[1차원 배열의 수][1차원 배열안에 존재하는 배열의 수];
	// 3. 저장 이름 [index][index] = 데이터;(고정길이만 가능)
		// 1차원 배열만들어서 다른 배열에 넣기.(고정길이 가변길이 모두사용하는 방법)
	
		int[][] k1;
		k1 = new int[2][4];
	
		k1[0][0] = 100;
		k1[0][1] = 200;
		k1[0][2] = 300;
		k1[0][3] = 400;
		k1[1][0] = 1000;
		k1[1][1] = 2000;
		k1[1][2] = 3000;
		k1[1][3] = 4000;
	
		System.out.println("k1 : " +k1);
		System.out.println("k1 : " +k1[0]);
		System.out.println("k1 : " +k1[1]);
	
		
		for (int i = 0; i < k1.length; i++) {
			for (int j = 0; j < k1[i].length; j++) {
				System.out.print(k1[i][j]+ " ");
			}
			System.out.println();
		}
		
	//고정 길이 선언과 생성을 한번에
		char[][] k2 = new char[3][2];
		k2[0][0] ='a';
		k2[0][1] ='A';
		k2[1][0] ='b';
		k2[1][1] ='B';
		k2[2][0] ='c';
		k2[2][1] ='C';
		
		
		for (int i = 0; i < k2.length; i++) {
			for (int j = 0; j < k2[i].length; j++) {
				System.out.print(k2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		
		char[][] k4 = new char[3][4];
		
		char[] s1 = {'j','a','v','a');
		
		
		k4[1] = s1[4];
		}
		
	}
}
