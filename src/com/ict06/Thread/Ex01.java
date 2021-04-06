package com.ict06.Thread;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("1" + Thread.currentThread().getName());

		Ex02 test = new Ex02();
		test.add(5, 8);
		System.out.println("4" + Thread.currentThread().getName());

		int result = test.sub(8, 5);

		System.out.println("7 " + Thread.currentThread().getName());
		System.out.println(result);

	}

}
