package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex14 {
	public static void main(String[] args) {
		//PrintStream : 모든 기본 자료형을 사용 할 수 있다.
		// 화면에 출력하려면 Sytem.out 를 활용.
		// 파일에 출력하려면 FileOutputStream 과 BufferedOutputStream 활용.
	
		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "ict04.txt";
		
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps;
		try {
			
			
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			
			System.out.println(true);
			System.out.println('C');
			System.out.println(24);
			System.out.println("대한민국");
			System.out.println(24.1);
			
			//파일에 출력.
			ps.println('C');
			ps.println(24);
			ps.println("대한민국");
			ps.println(true);
			ps.println(24.1);

			
		} catch (Exception e) {
		}finally {
			try {

				bos.close();
				fos.close();
				
			} catch (Exception e2) {
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
