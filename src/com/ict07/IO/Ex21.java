package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Ex21 {
	public static void main(String[] args) {
		//system.out 을 바꾸어보자.
		// 바이트 문자 결합 : 체인방식
		// 출력 : OutputStreamWriter : outputStream > Writer
		// OutputStream > outputStreamWirter > Writer > BufferedWriter
		
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write("Welcome");
			bw.newLine();
			bw.write("Java world");
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
