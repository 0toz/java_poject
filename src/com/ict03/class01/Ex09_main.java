package com.ict03.class01;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		Ex09 coffee = new Ex09();
		coffee.setNameString("Ŀ������");
		coffee.setPrice(1800);
		Ex09 ion = new Ex09();
		ion.setNameString("�̿� ����");
		ion.setPrice(1500);

		Ex09 cola = new Ex09();
		cola.setNameString("�ݶ�");
		cola.setPrice(2000);

		Ex09 juice = new Ex09();// �ν��Ͻ� = ��üȭ Ex09�θ��� �ڷ����� Ex09�̴�.Ŭ������ �������.�����ڷ���.
		juice.setNameString("���� ����");
		juice.setPrice(2200);

		// Ex09[] arr = new Ex09[4];
		// arr[0] = coffee;
		// arr[1]= ion;
		// arr[2]= cola;
		// arr[3]= juice;

		Ex09[] arr = { coffee, ion, cola, juice };

		// ������ �ִ� �̸��� ���ݵ��� �������.
		// �迭�� ����
		// �ڷ���[] �̸� = new �ڷ���[����];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getNameString() + ", " + arr[i].getPrice());
		}

//		�������� 1500�̸��̸� �ݾ׺��� �̻��̸� ���԰���

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է��ϼ���. : ");
		int input = sc.nextInt();
		int output = 0;
		
		while (true) {
			if (input < 1500) {
				System.out.println("�ݾ� ����");
				break;
			}

			else {

				System.out.println("1.Ŀ��\t2.�̿�\t3.ź ��\t4.�� ��");
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].getPrice() <= input) {
					System.out.print("O \t");
				}
				else {
				System.out.print("X \t");
				}
			}

			System.out.println();
			System.out.print("��ȣ�� �����ϼ���  >>> ");
			int drink = sc.nextInt();
			

			if (drink == 1) {
				output = input - arr[0].getPrice();
				System.out.println(arr[0].getNameString());
				System.out.println("���� "+ output + "�� ���ҽ��ϴ�");
				if (output >= 1500)
					continue;
			} else if (drink == 2) {
				output = input - arr[1].getPrice();
				System.out.println(arr[1].getNameString());
				System.out.println("���� "+ output + "�� ���ҽ��ϴ�");
				
				if (output >= 1500)
					continue;
			} else if (drink == 3) {
				output = input - arr[2].getPrice();
				System.out.println(arr[2].getNameString());
				System.out.println("���� "+ output + "�� ���ҽ��ϴ�");
				if (output >= 1500)
					continue;
			} else if (drink == 4) {
				output = input - arr[3].getPrice();
				System.out.println(arr[3].getNameString());
				System.out.println("���� "+ output + "�� ���ҽ��ϴ�");
				if (output >= 1500)
					continue;
			}
			if (output < 1500) {
				System.out.println(output + "�� �� �Ž��� �帳�ϴ�.");
				break;
			}
		
			
			
			

		}

	}

}
