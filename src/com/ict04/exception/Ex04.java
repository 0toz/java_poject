package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		try {
			int var = 27;
			System.out.println("정수 입력 : ");
			int su = scan.nextInt();
			System.out.println("정답 : "+ (var/su));
			return;
			
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력하시오");
			return;
			
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
			
		}finally {
			System.out.println("반드시 수행해야 할 문장");
		}
		System.out.println("수고하셧습니다.");
	
	}

}
