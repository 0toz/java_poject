package com.ict02.array;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String[] name = {"","","", "",""};
		int[] kor = {0, 0, 0, 0, 0};
		int[] eng = {0, 0, 0, 0, 0};
		int[] math = {0, 0, 0, 0, 0};
		
		for (int i = 0; i < name.length; i++) {
			System.out.print("�л��� �̸��� �Է��ϼ��� : ");
			name[i] = sc.next();
			
			System.out.print(name[i] +"�� ���������� �Է��ϼ��� : ");
			kor[i] = sc.nextInt();
		
			System.out.print(name[i] +"�� ���������� �Է��ϼ��� : ");
			eng[i] = sc.nextInt();
		
			System.out.print(name[i] +"�� ���������� �Է��ϼ��� : ");
			math[i] = sc.nextInt();
		}	
		
		
		int[] rank = {1, 1, 1, 1, 1};
		int[] sum = new int[5];
		double [] avg = new double[5];
		String [] hak = new String[5];
		
		
		
		for (int i = 0; i < hak.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i] / 3.0 *10)/10.0;
			if(avg[i]>=90) {
				hak[i]	= "A";
				}
			else if(avg[i]>=80){
				hak[i]	= "B";
				}
			else if(avg[i]>=70){
				hak[i]	= "C";
				}
			else {
				hak[i]	= "F";
			}
		}
		for (int i = 0; i < hak.length; i++) {
			for (int j = 0; j < hak.length; j++) {
				if(sum[i]<sum[j]) {
					rank[i]++;
				}
			}
		}
		
		System.out.println("�� ��\t�� ��\t�� ��\t�� ��\t�� ��\t");
		
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i]+ "\t");
			System.out.print(sum[i]+ "\t");
			System.out.print(avg[i]+ "\t");
			System.out.print(hak[i]+ "\t");
			System.out.println(rank[i]);
		}
		
		
	}

}
