package com.ict03.class01;

import java.util.Scanner;

public class Ex13_main {
	public static void main(String[] args) {

		// 5���� �̸� ���� ���� ���� ������ �޾Ƽ�
		// �̸�, ����, ���, ����, ������ ���ϰ� ��������.

		Scanner sc = new Scanner(System.in);
		Ex13[] arr = new Ex13[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("���� : ");
			int kor = sc.nextInt();
			System.out.print("���� : ");
			int eng = sc.nextInt();
			System.out.print("���� : ");
			int math = sc.nextInt();

			Ex13 person = new Ex13(name , kor , eng, math);
			person.setName(name);
			person.p_sum(kor, eng, math);

			arr[i] = person;

		}

		// ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					continue;
				if (arr[i].getSum() > arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}

		// ����
		Ex13 temp = new Ex13();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + " ");
			System.out.println(arr[i].getSum() + " ");
			System.out.println(arr[i].getAvg() + " ");
			System.out.println(arr[i].getHak() + " ");
			System.out.println(arr[i].getRank() + " ");
		}

	}
}
