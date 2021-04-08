package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex11 {
	public static void main(String[] args) {
		// 그림파일을 res파일안에 복사하는 코딩
		
		String pathname1 = "C:" + File.separator + "study"+ File.separator + "util" + File.separator +"java_2.jpg" ;
		File read_file = new File(pathname1);
		
		// 쓰는 위치
		String pathname2 = "C:" +File.separator  + "study" + File.separator + "util" + File.separator + "res" + File.separator + "java_2.jpg";
		File write_file = new File(pathname2);
		
		// input스트림
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		// outputStream	
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
	
	try {
		fis = new FileInputStream(read_file);
		bis = new BufferedInputStream(fis);
		
		fos = new FileOutputStream(write_file);
		bos = new BufferedOutputStream(fos);
		
		int k = 0;// 복사하거나 이동할 때는.
		while((k = bis.read())!= -1) {
			//1byte 쓰기.
			bos.write(k);
		}
		bos.flush();
	
	
		
	} catch (Exception e) {

	}finally {
		try {
			bos.close();
			fos.close();
			bis.close();
			fis.close();
			
			read_file.delete();// 열려있을 때 삭제 되지 않음.
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
	}
}
