package com.ict04.exception;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("이제 제대로 나오기를ㅇㅇㅇ");
		/// 이거맞나 할정도록.
		try {
			int[] var = { 10, 20, 30 };
			
			for (int i = 0; i <= var.length; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var[" + i + "] = " + var[i]);
				System.out.println(3);
				System.out.println(4);
			}
			
		} catch (Exception e) {
			// 예외 발생시 이곳으로 온다.
			System.out.println("예외발생");
		}
		System.out.println("수고하셨습니다.");

	
	}
}
