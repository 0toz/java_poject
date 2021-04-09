package com.ict07.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex20 {
	public static void main(String[]args) {
		//바이트 문자 결합 : 체인방식.
		//입력 : InputStreamReader : InputStream => Reader
		// 	InputStream (x)=> InputStreamReader => Reader(x) => BufferedReader
		//
		
		
		//출력 : OutputStreamWriter : OutputStream => Writer
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("원하는 문자 입력");
//		String msg = sc.next();
//		System.out.println("받은 문자 : " + msg);

		// 받아서 저장해서... 이거를 스캐너가 아니라 리더를 써보자.
		
		System.out.println("원하는 문자 입력");
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			System.out.println("받은 문자 : " + msg);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				isr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
	}
}
