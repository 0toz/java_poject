package com.ict03.class01;

import java.util.Iterator;
import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
		
		// 5���� �̸� ���� ���� ���� ������ �޾Ƽ�
		// �̸�, ����, ���, ����, ������ ���ϰ� ��������.
		
		Scanner sc = new Scanner(System.in);
		Ex10[]	arr = new Ex10[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("���� : ");
			int kor = sc.nextInt();
			System.out.print("���� : ");
			int eng = sc.nextInt();
			System.out.print("���� : ");
			int math = sc.nextInt();
		
			Ex10 person = new Ex10();
			person.setName(name);
			person.p_sum(kor , eng , math);
			
			
			arr[i]  = person;
			
		}
		
		//����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j])continue;
				if(arr[i].getSum() > arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank()+1);
				}
			}
		}
		
		//����
		Ex10 temp = new Ex10();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].getRank() > arr[j].getRank()) {
					temp = arr[i];
					arr[i]	= arr[j];
					arr[j]= temp;
				}
			}
		}
		
		//���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+ " ");
			System.out.println(arr[i].getSum()+ " ");
			System.out.println(arr[i].getAvg()+ " ");
			System.out.println(arr[i].getHak()+ " ");
			System.out.println(arr[i].getRank()+ " ");
		}
		
		
	}
}
