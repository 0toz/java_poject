package com.ict03.class01;

import java.util.Iterator;
import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
		
		// 5명의 이름 국어 영어 수학 점수를 받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고 정령하자.
		
		Scanner sc = new Scanner(System.in);
		Ex10[]	arr = new Ex10[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int math = sc.nextInt();
		
			Ex10 person = new Ex10();
			person.setName(name);
			person.p_sum(kor , eng , math);
			
			
			arr[i]  = person;
			
		}
		
		//순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j])continue;
				if(arr[i].getSum() > arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank()+1);
				}
			}
		}
		
		//정렬
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
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+ " ");
			System.out.println(arr[i].getSum()+ " ");
			System.out.println(arr[i].getAvg()+ " ");
			System.out.println(arr[i].getHak()+ " ");
			System.out.println(arr[i].getRank()+ " ");
		}
		
		
	}
}
