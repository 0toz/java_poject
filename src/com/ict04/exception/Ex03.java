package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
//다중캐치문.  : try 문
	//: try 문의 예외 발생이 여러가지의 예외가 발생할 경우 사용.
	//주의 사항.  exception 을 사용할떄는 반드시 아래쪽 catch 문에서 사용한다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	
		try {
			int var = 27;
			System.out.println("정수 입력 : ");
			int su = scan.nextInt();
			System.out.println("정답 : "+ (var/su));
			
			System.out.println("수고하셧습니다.");
			
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력하시오");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		
		System.out.println("수고하셧습니다.");
	}
	
}
