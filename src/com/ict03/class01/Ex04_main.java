package com.ict03.class01;

public class Ex04_main {

	public static void main(String[] args) {
		// Ex04를 클래스 객체로 만듦.
		Ex04 test = new Ex04();
		
		
		//plus01 는 보이드 이므로 받을 데이터가 없다.
		//test.plus01();
		test.sub01();
		System.out.println( test.result);
		//원래 0이었지만 끝에는 15가 되었기때문. 메소드는 호출해야만 실행이된다!.
		int sub = test.sub01();
		System.out.println(sub);
		
	}

}
