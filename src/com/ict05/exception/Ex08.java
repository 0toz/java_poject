package com.ict05.exception;

import java.util.HashMap;
import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
//			Map 인터페이스 : key와 value를 매핑하는 구조로 이루어짐.
//			key 는 중복될 수 없다. 
//			Value는 중복가능하다 key가 중복될시 덮어쓰기가 된다.
//			key를 호출하면 value가 나온다.
//			key가 중요함으로 set컬렉션에 별도로 관리한다. << keySet()메소드
//			
//			주요메서드
//			add() 로 추가 , 삽입 안됨.
//			삽입 : put(K key, V value)
//			key를 set에서 관리 : keySet()
//			containsKey(Object key)	 : boolean
//			인자로 받은 key가 존재하면  true, 아니면 false
//			containsValue(Object value) : boolean
//			인자로 받은 value가 존재하면 true, 아니면 false
//			get(Object key) : 키를 받아서 value를 리턴한다.
//			remove(Object key) : 키를 받아서 삭제.
//			replace(K Key,V Value ) :치환.
//			
//			1.key를 순서있는 숫자로 만들면 for문 사용가능.
			HashMap< Integer , String> map1  = new HashMap<Integer, String>();
			map1.put(1, "한국");
			map1.put(2, "미국");
			map1.put(3, "중국");
			map1.put(4, "영국");
			map1.put(5, "태국");
			
			
			map1.put(3, "일본"); ///
			System.out.println(map1);
			
			map1.put(6,"한국"	); //value가 중복 (상관없다.)
			System.out.println(map1);

			for (int i = 1; i < map1.size()+1; i++) {
				System.out.println(map1.get(i));
				
			}
			System.out.println();
			//개선된 for문 사용. : keySet()사용.  ****
			for (Integer k : map1.keySet()) {
				System.out.println(map1.get(k));
			}
			
			
			System.out.println();
			Iterator<Integer>it = map1.keySet().iterator();
			while (it.hasNext()) {
				int s1 = (int) it.next();
				System.out.println(map1.get(s1));
			}
			
			//2. key를 문자로 만들면 출력시 iterator를 사용해야 된다.
			
			
	
			HashMap<String, String> map2 = new HashMap<String, String>();
			mp2.put("이름", "고길동");
			mp2.put("나이", "34");
			mp2.put("주소", "도봉구");
			mp2.put("성별", "남");
			System.out.println("map2");
	
			for(String k : map2.keySet()) {
				System.out.println(map2.get(k));
				
			}
			System.out.println();
			
			Iterator<String> it2 = map2.keySet().iterator();
			while(it2.hasNext()) {
				String k = (String) it2.next();
				System.out.println(map2.get(k));
			}
	
	
	
	
	
	
	}
	
}
