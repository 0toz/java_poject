package com.ict07.IO;

import java.io.File;
import java.io.FileReader;

public class Ex17 {
	public static void main(String[] args) {
		// FileInputStream : 1byte 처리 , read(): int(아스키)=> char형 변환, 대소문자, 숫자만 가능.
		// read(byte[] b), String이용
		// FileReader : read : int( 유니코드) => char로 형변환해야함. 하지만 전세계 문자 처리 가능.
		// read(char[] b) , String 이용가능.

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict06.txt";

		File file = new File(pathname);
		FileReader fr = null;
		try {

			fr = new FileReader(file);

//			int k = fr.read();
//			System.out.println(k + ":" + (char) (k));
//			
			
//			
//			int k = 0;
//			while((k = fr.read())!= -1) {
//				System.out.println(k + ":" + (char) (k));
//			}
//			
			// char[] 이용.
//			char[] c = new char[(int)(file.length())];
//			fr.read(c);
//			for(char k : c) {
//				System.out.println(k);
//			}
			//String 이용.
			char[] c = new char[(int)(file.length())];
			fr.read(c);
			String msg = new String(c);
			System.out.println(msg);
			
			
		} catch (Exception e) {
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
			}
		}

	}
}
