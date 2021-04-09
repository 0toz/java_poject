package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex22 {
	public static void main(String[] args) {
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		
		//키보드를 이용해서 입력.
		try {
			isr = new InputStreamReader(System.in) ;
			br = new BufferedReader (isr);
			
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			
			bw.write("원하는 문자 입력");
			bw.flush();
			
			String msg = br.readLine(); // 한줄 읽기
			
			//nextInt() >> int k = Integer.parseInt(msg);
			
			bw.write("받은 문자 : " + msg);
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				br.close();
				isr.close();
				
				bw.close();
				osw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
