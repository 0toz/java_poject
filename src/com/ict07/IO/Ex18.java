package com.ict07.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex18 {
	public static void main(String[] args) {
		// BufferedReader : 속도 향상을 위한 것이기도 하지만 한줄 한줄씩 읽을 수 있는 메소드가 존재.
		

		String pathname = "C:" + File.separator + "study" + File.separator + "util" 
						+ File.separator + "ict05.txt";

		File file = new File(pathname);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			//한글자씩 읽기.
			int k = br.read();
			System.out.println((char) (k));
			
			
//			전체읽기.
//			int k = 0;
//			while((k = br.read())!= -1) {
//				System.out.println(k + ":" + (char) (k));
//			}
//			
			// char[] 이용.
//			char[] c = new char[(int)(file.length())];
//			br.read(c);
//			for(char k : c) {
//				System.out.println(k);
//			}
			//String 이용.
//			char[] c = new char[(int)(file.length())];
//			br.read(c);
//			String msg = new String(c);
//			System.out.println(msg);
			
			//첫줄 읽기
//			String msg = br.readLine();
//			System.out.println(msg);
			
			//모두읽기
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				sb.append(msg + "\n");
			}
			System.out.println(sb.toString());
			
		} catch (Exception e) {
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
			}
		}

	}
}
