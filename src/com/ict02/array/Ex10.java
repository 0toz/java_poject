
package com.ict02.array;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		번호 국어 영어 수학점수를 입력받아서
//		번호 총점 평균 학점 순위를 구하고 정렬하자
//		다섯명임
		
		
		int [][] arr = new int [5][4];
		//데이터 입력받기
		for (int i = 0; i < arr.length; i++) {
			
			arr [i][0] = i+1;
			System.out.print((i+1) +"학생의 국어점수는 ? : ");
			arr [i][1]	= sc.nextInt();
			System.out.print((i+1) + "학생의 영어점수는 ? : ");
			arr [i][2]	= sc.nextInt();
			System.out.print((i+1) + "학생의 수학점수는 ? : ");
			arr [i][3]	= sc.nextInt();
			
		}
		// 총점 계산기
		
		int [][] arr2 = new int [5][5];
		
		// 번호 총점 평균 학점 순위를 넣은 arr2 만들기
		for (int i = 0; i < arr.length; i++) {
			arr2 [i][0] = i+1; //번호는 0번에 저장
			arr2 [i][1] = arr [i][1] + arr [i][2] + arr [i][3]; // 총점은 1번에 저장.
			arr2 [i][2] = arr2 [i][1] /3; // 평균 2번
			if(arr2 [i][2] >= 90 ) {//학점 3번
				arr2[i][3] = 'A';
			}else if(arr2 [i][2] >= 80) {
				arr2[i][3] = 'B';
			}else if(arr2 [i][2] >= 70) {
				arr2[i][3] = 'C';
			}else {
				arr2[i][3] = 'F';
			}
			arr2 [i][4] = 1;
		}	
		
			
		int[] temp = new int [5];
			
		//순위책정	
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				if(arr2[i][1] < arr2[j][1]) {
					arr2[i][4]++;
				}
			}
		}
		
		//순위에 따른 정렬.
		for (int i = 0; i < temp.length-1; i++) {
			for (int j = i+1; j < temp.length; j++) {
				if(arr2[i][1] < arr2[j][1] ) {
					temp  = arr2 [i];
					arr2[i] = arr2 [j];
					arr2[j] = temp;
					
				}
			}
		}
		//출력
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if(j ==  3) {
					System.out.print((char)(arr2[i][3]) + " ");
				}else
				System.out.print(arr2[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		
	}
}
