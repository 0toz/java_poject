package com.ict03.class01;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		Ex09 coffee = new Ex09();
		coffee.setNameString("커피음료");
		coffee.setPrice(1800);
		Ex09 ion = new Ex09();
		ion.setNameString("이온 음료");
		ion.setPrice(1500);

		Ex09 cola = new Ex09();
		cola.setNameString("콜라");
		cola.setPrice(2000);

		Ex09 juice = new Ex09();// 인스턴스 = 객체화 Ex09로만들어서 자료형이 Ex09이다.클래스로 만들었다.참조자료형.
		juice.setNameString("과일 음료");
		juice.setPrice(2200);

		// Ex09[] arr = new Ex09[4];
		// arr[0] = coffee;
		// arr[1]= ion;
		// arr[2]= cola;
		// arr[3]= juice;

		Ex09[] arr = { coffee, ion, cola, juice };

		// 가지고 있는 이름과 가격들을 출력하자.
		// 배열에 넣자
		// 자료형[] 이름 = new 자료형[갯수];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getNameString() + ", " + arr[i].getPrice());
		}

//		동전투입 1500미만이면 금액부족 이상이면 구입가능

		Scanner sc = new Scanner(System.in);
		
		System.out.print("넣을 돈을 입력하세요. : ");
		int input = sc.nextInt();
		int output = 0;
		
		while (true) {
			if (input < 1500) {
				System.out.println("금액 부족");
				break;
			}

			else {

				System.out.println("1.커피\t2.이온\t3.탄 산\t4.과 일");
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
			System.out.print("번호로 선택하세요  >>> ");
			int drink = sc.nextInt();
			

			if (drink == 1) {
				output = input - arr[0].getPrice();
				System.out.println(arr[0].getNameString());
				System.out.println("돈이 "+ output + "원 남았습니다");
				if (output >= 1500)
					continue;
			} else if (drink == 2) {
				output = input - arr[1].getPrice();
				System.out.println(arr[1].getNameString());
				System.out.println("돈이 "+ output + "원 남았습니다");
				
				if (output >= 1500)
					continue;
			} else if (drink == 3) {
				output = input - arr[2].getPrice();
				System.out.println(arr[2].getNameString());
				System.out.println("돈이 "+ output + "원 남았습니다");
				if (output >= 1500)
					continue;
			} else if (drink == 4) {
				output = input - arr[3].getPrice();
				System.out.println(arr[3].getNameString());
				System.out.println("돈이 "+ output + "원 남았습니다");
				if (output >= 1500)
					continue;
			}
			if (output < 1500) {
				System.out.println(output + "원 을 거슬러 드립니다.");
				break;
			}
		
			
			
			

		}

	}

}
