package com.ict03.class02;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {

		//2.(int)(nextDouble() * ���� )// : 0- 1���������� �� �� �߻�.
		//������ �� ���� �� ����� ���� �ν� �о.
	//	�ڷ����� �����͸� �������� ����.

		Random ran = new Random();
		
		System.out.println("boolean�� : " + ran.nextBoolean());
		System.out.println("int�� : " + ran.nextInt());
		System.out.println("Long�� : " + ran.nextLong());
		//�Ǽ����´� 0.0�̻�  ~ 1.0�̸�.
		System.out.println("float�� : " + ran.nextFloat());
		System.out.println("double�� : " + ran.nextDouble());



//		0.0 - 1.0 * 3 // 0~2�̴�.

		int s3 = (int)(Math.random()*3);
//		3���� �� �� �ϳ��� ���´�.


		//E �ڿ����
		//PI ������

		//2. Math Ŭ���� : �����ڰ� ����.
	//	�޼ҵ���� static �̴�. ��ü���� �����ʰ� ȣ�Ⱑ��.
				


//		abs ���밪 ��ȯ
		System.out.println(Math.abs(100));
		System.out.println(Math.abs(-100));

		//ceil( �ø�) round(�ݿø�), floor(����)
		System.out.println("�ø� : " + Math.ceil(3.45));
		System.out.println("�ø� : " + Math.ceil(3.55));

		System.out.println("���� : " + Math.floor(3.45));
		System.out.println("���� : " + Math.floor(3.55));
		System.out.println("�ݿø� : " + Math.round(3.45));
		System.out.println("�ø� : " + Math.round(3.55));


		//5. max ���� ū �� ã��
		//static double 

		//max(double a, double b) �ǵ��� �����ε��Ҷ� �ڷ������� ����� �ָ� ����.


		//6.pow(double a , double b) ����
		System.out.println (Math.pow(2,3)); // 0-8
		System.out.println(Math.pow(3,2)); // 0- 9

	}
}
