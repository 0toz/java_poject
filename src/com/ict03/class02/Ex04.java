package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		// ��ǻ�Ϳ� ���������� �ϱ�.
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		esc:
		while (true) {

			int com = (int) (Math.random() * 3);
			System.out.println("��ǻ�Ϳ� ������������ �����մϴ�.");
			System.out.print("0.���� 1.����  2.�� �ϳ��� �Է��Ͻÿ�. : ");
			int me = sc.nextInt();
			if(me == 1 || me == 2 || me == 0) {
			}else continue;

			int[][] result = { { 1, 0, 2 }, { 2, 1, 0 }, { 0, 2, 1 } };

			// �̱�� +1

			int i = me;
			int j = com;
			int winCount =0;
			int drawCount = 0;
			int loseCount = 0;
			
			
			if (result[i][j] == 1) {
				System.out.println("�����ϴ�.");
				drawCount++;
			} else if (result[i][j] == 2) {
				System.out.println("����� �̰���ϴ�.");
				winCount++;
				System.out.println();
			} else if (result[i][j] == 0) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				loseCount++;
				System.out.println();
			
			} else
				System.out.println("����");

			// ����0 ����1 ��2
			// ����0 ��� �� �̱�
			// ����1 �̱� ��� ��
			// ��2 �� �̱� ���

			System.out.print("����ұ��? y/n >> ");
			String msg = sc.next();
			if(msg.equalsIgnoreCase("y")) {
				continue esc;
			}
			else if(msg.equalsIgnoreCase("n")) {
				System.out.println("����� �̱�Ƚ�� : "+ winCount);
				System.out.println( "�·�  :" + (winCount / (winCount + loseCount + drawCount)));
				break esc;
			}else {
				continue;
			}
			
			
			// 20���ȿ� ���ڸ��߱�. �߱�.
			// 2 3 5 �ϳ��� �ȸ����� ���� �ƿ�. ����.
			// 1���迭 ũ�� 3 ���� 0-9���� ���߱�. ������ �¾ƾ���. ������ ��Ʈ����ũ Ʋ���� �ƿ� 20���ȿ� �� ��Ʈ����ũ ������ �¸�.

		}

		
	}
}
