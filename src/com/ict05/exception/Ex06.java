package com.ict05.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex06 {
	public static void main(String[] args) {
		// ArrayList 와 Vector 배열과 흡사한 구조. 삽입 삭제 추가가 자유롭다.
		// ArrayList 와 Vector  배열과 흡사한 구조이지만 , 삽입, 삭제, 추가가 자유롭다.
//		크기를 미리 지정하지 않아도된다.
//		ArrayList(동기화 지원안함)와 Vector(동기호화 지원함)는 동기화 지원 유무에 다르다.
//		set 구조는 순서가 없다 . 중복안됨.
//		list구조는 순서가 존재 . 중복가능
		
		ArrayList<String> list = new ArrayList<String>();
		
		list .add("박찬호");
		list .add("류현진");
		list .add("손흥민");
		System.out.println(list);
		
		list.add(1, "추신수");
		System.out.println(list);
		
		Vector<String> vector = new Vector<>();
		vector.add("둘리");
		vector.add("도우너");
		vector.addElement("또치");
		System.out.println(vector);		
		
		//삽입 :
		vector.add(2,"희동이");
		System.out.println(vector);
	
	//검색 : 위치값 검색
		if(list.contains("손흥민")) {
			System.out.println(list.indexOf("손흥민")+ "번째 위치");
		// 검색 해당위치에 존재하는 객체 검색.
			System.out.println(list.get(3)); //검색. 
			System.out.println(list.get(list.indexOf("손흥민"))); //검색. 
		// list에 존재하면 가져오기.
		list.lastIndexOf(list.size()+ " 요소가 존재함.");
		//치환 set
		list.set(3, "이대호");
		}
	
		//추신수 가 있으면 추신수를  이종범으로 변경해라.
		
		
		if(list.contains("추신수")) {
			list.set(list.indexOf("추신수"), "이종범");
		}else {
			System.out.println("없다.");
		}
		System.out.println();
		
		// 하나씩 꺼내서 (for, iterator)
		
		for (String k : list) {
			System.out.println(k);
		}
		System.out.println("========");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s1 = (String) it.next();
			System.out.println(s1);
		}
		
		
		
		
	}
}
