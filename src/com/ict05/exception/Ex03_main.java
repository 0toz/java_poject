package com.ict05.exception;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_main {
	public static void main(String[] args) {
		//세터를 이용해서 정함
		Ex03 coffee = new Ex03();
		coffee.setName("커피음료");
		coffee.setPrice(2500);
		// 생성자를 이용해서 정함
		Ex03 cola = new Ex03("콜라", 1600);
		Ex03 juice = new Ex03("과일음료", 2300);
		
		
		//디펜던시 의존관계. 로 만들면서 아예 집어넣음
		// 객체를 저장하고 관리하는 방법은 두가지.
		// 배열과 컬렉션.
		//1. 배열
		 Ex03 [] arr = new Ex03[3];
		 arr[0] = coffee;
		 arr[1] = cola;
		 arr[2] = juice;
		
		//이름과 가격 꺼내기
		for (Ex03 k : arr) {
			System.out.println("이름 : "+ k.getName());
			System.out.println("가격 : "+ k.getPrice());
		}
		System.out.println("===============");
		
		//2. 컬렉션.
		HashSet<Ex03> h1 = new HashSet<>();
		// 삽입 추가.
		h1.add(coffee);
		// 더 추가할 수 있다.
		h1.add(new Ex03("ion", 1400));
		
//		이름과 가격 꺼내기
//		1. 개선된 for문 사용.
		for (Ex03 k : h1) {
			System.out.println("이름 : "+ k.getName());
			System.out.println("가격 : "+ k.getPrice());
		}
		System.out.println("-------------------");
		//2. iterator 사용.
		Iterator<Ex03> it = h1.iterator();
		while (it.hasNext()) {
			Ex03 s1 = (Ex03) it.next();
			System.out.println("이름 : "+ s1.getName());
			System.out.println("가격 : "+ s1.getPrice());
		}
		
		// 포함여부 : contains
		if(h1.contains(coffee)) {
			System.out.println("있다");
		}else {
			System.out.println("없다");
		}
		
		
		System.out.println("===============");
		if(h1.contains(cola)) {
			h1.remove(cola);
			System.out.println(cola.getName() + "삭제");
		}else {
			System.out.println("존재하지 않아서 삭제 못함");
		}
		
		System.out.println("===============");
		
		// 비어있는지 확인 isEmpty()
		if(h1.isEmpty()) {
			System.out.println("비어있다.");
		}else {
			System.out.println("비어있지 않음.");
		}
		System.out.println("===============");
		
		// 전체삭제
		h1.clear();
		if(h1.isEmpty()) {
			System.out.println("비어있다.");
		}else {
			System.out.println("비어있지 않음.");
		}
		
		
	}
}
