
package com.ict02.array;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		��ȣ ���� ���� ���������� �Է¹޾Ƽ�
//		��ȣ ���� ��� ���� ������ ���ϰ� ��������
//		�ټ�����
		
		
		int [][] arr = new int [5][4];
		//������ �Է¹ޱ�
		for (int i = 0; i < arr.length; i++) {
			
			arr [i][0] = i+1;
			System.out.print((i+1) +"�л��� ���������� ? : ");
			arr [i][1]	= sc.nextInt();
			System.out.print((i+1) + "�л��� ���������� ? : ");
			arr [i][2]	= sc.nextInt();
			System.out.print((i+1) + "�л��� ���������� ? : ");
			arr [i][3]	= sc.nextInt();
			
		}
		// ���� ����
		
		int [][] arr2 = new int [5][5];
		
		// ��ȣ ���� ��� ���� ������ ���� arr2 �����
		for (int i = 0; i < arr.length; i++) {
			arr2 [i][0] = i+1; //��ȣ�� 0���� ����
			arr2 [i][1] = arr [i][1] + arr [i][2] + arr [i][3]; // ������ 1���� ����.
			arr2 [i][2] = arr2 [i][1] /3; // ��� 2��
			if(arr2 [i][2] >= 90 ) {//���� 3��
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
			
		//����å��	
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				if(arr2[i][1] < arr2[j][1]) {
					arr2[i][4]++;
				}
			}
		}
		
		//������ ���� ����.
		for (int i = 0; i < temp.length-1; i++) {
			for (int j = i+1; j < temp.length; j++) {
				if(arr2[i][1] < arr2[j][1] ) {
					temp  = arr2 [i];
					arr2[i] = arr2 [j];
					arr2[j] = temp;
					
				}
			}
		}
		//���
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
