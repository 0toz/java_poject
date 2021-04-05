package com.ict03.class06;

public class Ex01 {

	static final int JAVA = 100;
	static final int DB = 200;
	
	public enum Lesson{
		JAVA, JSP, SPRING, ANDROID, HTML
	}

	public static void main(String[] args) {
		System.out.println("JAVA : " + Ex01.JAVA); // 일반적 상수 호출.
		System.out.println("enum JAVA : " + Lesson.JAVA);//enum 호출
	
	
	// 배열로 만듦.  ordinal() > index;
	Lesson[] arr = Lesson.values();
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]+ ":" + arr[i].ordinal());
	}



	}
}
