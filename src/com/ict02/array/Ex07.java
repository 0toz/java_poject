package com.ict02.array;

import java.util.Iterator;

public class Ex07 {
	public static void main(String[] args) {
		//������ �迭 : 1���� �迭�� ������ ���� ��.
		//���� �������� , ��������.
		//�⺻�ڷ��� �迭, �����ڷ��� �迭(Ŭ������ ����°�.)
	
//		//1.�������� �迭
//		���� �ڷ��� [][]�̸�
//		���� �̸� = new �ڷ���[1���� �迭�� ��][1���� �迭�ȿ� �����ϴ� �迭�� ��];
	// 3. ���� �̸� [index][index] = ������;(�������̸� ����)
		// 1���� �迭���� �ٸ� �迭�� �ֱ�.(�������� �������� ��λ���ϴ� ���)
	
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
		
	//���� ���� ����� ������ �ѹ���
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
