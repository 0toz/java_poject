package com.ict05.exception;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<>(); // 문자열형 객체 모임.
		HashSet<Integer> h2 = new HashSet<>();// 정수형 객체 모임.
		HashSet<Boolean> h3 = new HashSet<>(); // 논리형 객체 모임
		HashSet<Double> h4 = new HashSet<>(); // 실수형 객체 모임

		// h2(정수형)에 객체를 추가하는 방법.
		// 방법1 기본자료형을 객체로 만들어서 넣기.이것을 박싱이라고한다.
		Integer k1 = new Integer(10);
		Integer k2 = new Integer("10");
		// 방법 2 기본자료형을 그냥 넣는다. 기본자료형이 자동으로 객체가 되어서 넣어진다.
		// 기본자료형이 자동으로 객체가 되어지는 것. 오토박싱.
		// h2 컬렉션에 객체 넣기 (add(요소))
		h2.add(k1);
		h2.add(k2);
		h2.add(10); // 기본자료형은 이렇게.
		h2.add(new Integer(10));// 이건 클래스들을 묶을 떄.
//		h2.add('A'); 작은게 큰곳에 들어간다는 개념 안통함.

//		h3.add(3.14);
//		h3.add(new Doble(31.4));
	// h3.add(14) 같은 제네릭 타입이 아니면 무조건 오류.
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		
		
		h1.add("java");
		h1.add("JAVA");
		h1.add("jsp");
		h1.add("Java");
		h1.add("jsp");
		h1.add("spring");
		
		System.out.println(h1);
		// 하나씩 꺼내서 사용하기
		//1. 개선된 for문 (일반 for문은 사용 못함. 인덱스가 없음)
	//	2. iterator(0)

		for (String k : h1) {
			String msg = k;
			System.out.println(msg);
		}
		System.out.println("========================");
	
		Iterator<String> it = h1.iterator();
		while (it.hasNext()) {
			String msg = (String) it.next();
			System.out.println(msg);
		}
		
		
		
	}
}
