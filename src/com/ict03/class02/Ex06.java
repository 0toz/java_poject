package com.ict03.class02;

public class Ex06 {
	public static void main(String[] args) {
		// String buffer, String
		String msg = "hello";
		
		msg = msg + "java";
				
					
				StringBuffer sb new StingBuffer("wellcome");
		// StringBuffer sb = new StringBuffer("welcome")
				// 현재 영역에서 내용을 추가한다.
				
	
//			내용을 추가할 때 (append ("문자열"));
			sb.append("JAVA");
			System.out.println(sb.toString());
	
	}
	
}
