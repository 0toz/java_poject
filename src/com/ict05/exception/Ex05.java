package com.ict05.exception;

import java.util.Iterator;
import java.util.Stack;

public class Ex05 {
	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.add("둘리");
		stack.addElement("공실이");
		stack.push("마이콜");

		System.out.println(stack);
		
		stack.add(1, "도우너"); //삽입
		stack.add(0, "또치");//삽입
		stack.add(1, "뿌끄");// 삽입 중복이 아니다.
		stack.add(1, "둘리"); // 중복 사용가능.
		System.out.println(stack);
		
		// 마지막 개체보기 pop(삭제 0), peek(삭제 X = for문을 사용하면 무한 루프)
		System.out.println(stack.peek());
		System.out.println("");
		// contain
		if (stack .contains("둘리")) {
			System.out.println(stack.indexOf("둘리")+ "번째 위치"); // 배열식
			System.out.println(stack.search("둘리")+ "번째 위치");// 스택식
			
			
			System.out.println(stack.get(1));
			System.out.println(stack.get(Stack.indexOf("둘리")));
			System.out.println(stack.elementAt(stack.indexOf("둘리")));
			System.out.println(stack.firstElement());
			System.out.println(stack.lastElement());
		}else {
			System.out.println("존재하지 않음.");
		}
		// size , set(치환) , setElementAt(치환)
		System.out.println(stack.size() + "요소가 존재합니다");
		// index가 3인
		stack.setElementAt("마이콜", 3);
		System.out.println(stack);
		
		//하나씩 꺼내기(개선된 for, iterator( 데이터가 그대로 존재), pop(데이터 삭제.))
		//개선된 for 문
		for(String k : stack) {
			System.out.println();
		}
		System.out.println(stack.size() + " 요소가 존재함");
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			String msg = (String) it.next();
			System.out.println(msg);
		}
		System.out.println(stack.size()+ "요소가 존재함");
		
		while (! stack.isEmpty()) {
			String k = stack.pop();
			System.out.println(k+"삭제됨 크기는 "+ stack.size());
		}
		
		
		
		// contains , indexOf, search, get, elementalAt, firstElement, lastElement
		//겟을 많이 씀.
		//size, setElementAt
	}
}
