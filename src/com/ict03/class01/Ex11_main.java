package com.ict03.class01;

import java.util.Scanner;

public class Ex11_main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ex11 product = new Ex11();
		
		
		
		System.out.print("주문 인원을 입력하시오 : ");
		int p_num = sc.nextInt();
		Ex11.setPeopleNum(p_num);
		
		int n = 0;
		int[] menu = new int[p_num];
		int [] offer = new int[p_num];
		
		while(true) {
			System.out.print("주문할 상품을 고르시오(1.카페모카 2.아메리카노 3. 카페라떼 4.자몽쥬스)  :  ");
			menu[n] = sc.nextInt();
			
			if(menu[n] == 1) {
				product.setProductName("카페모카");
				product.setProductPrice(3000);
				
			}else if(menu[n] == 2) {
				product.setProductName("아메리카노");
				product.setProductPrice(2500);
			}else if(menu[n] == 3) {
				product.setProductName("카페라떼");
				product.setProductPrice(3500);
			}else if(menu[n] == 4) {
				product.setProductName("자몽쥬스");
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
		
		System.out.println("총액 : "+ sum);
		System.out.print("넣을 금액은? : ");
		int input = sc.nextInt();
		System.out.println("잔 돈 : " + (input - sum));
		
		
		
	}
}
