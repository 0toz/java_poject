package com.ict03.class01;

import java.util.Scanner;

public class Ex11_main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ex11 product = new Ex11();
		
		
		
		System.out.print("�ֹ� �ο��� �Է��Ͻÿ� : ");
		int p_num = sc.nextInt();
		Ex11.setPeopleNum(p_num);
		
		int n = 0;
		int[] menu = new int[p_num];
		int [] offer = new int[p_num];
		
		while(true) {
			System.out.print("�ֹ��� ��ǰ�� ���ÿ�(1.ī���ī 2.�Ƹ޸�ī�� 3. ī��� 4.�ڸ��꽺)  :  ");
			menu[n] = sc.nextInt();
			
			if(menu[n] == 1) {
				product.setProductName("ī���ī");
				product.setProductPrice(3000);
				
			}else if(menu[n] == 2) {
				product.setProductName("�Ƹ޸�ī��");
				product.setProductPrice(2500);
			}else if(menu[n] == 3) {
				product.setProductName("ī���");
				product.setProductPrice(3500);
			}else if(menu[n] == 4) {
				product.setProductName("�ڸ��꽺");
				product.setProductPrice(3000);
			}else return;
			
			offer[i] = product;
			
			n++;
			if(n == p_num)	break;
		}
		
		
		
		int sum =0;
		for (int j = 0; j < offer.length; j++) {
			sum = sum + offer[i].getPrice();
		}
		
		System.out.println("�Ѿ� : "+ sum);
		System.out.print("���� �ݾ���? : ");
		int input = sc.nextInt();
		System.out.println("�� �� : " + (input - sum));
		
		
		
	}
}
