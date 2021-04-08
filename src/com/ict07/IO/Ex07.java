package com.ict07.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		// 1. FileinputStream ; 파일을 대상으로 1byte씩 데이터를 읽기 할 수 있는 스트림.
		// - 생성자 : FileInputStream (File file ) , FileInputStream(String name);
		// File file, String name => 특정위치 + 파일이름.
		// - 주요메소드 //메소드는 반환형이 중요하다.
		// read () : int 결과가 숫자(아스키코드)로 나옴. 이를 캐릭터형으로 변경시켜야함.char 형변환.
		// read (byte[] b) : int => 배열을 만들어서 인자에 넣으면 
//				 배열크기만큼 문자를 읽을 수 있다.
//			 	 byte[] b 에 읽을 문자들이 배열크기만큼. 저장된다.
		// close : open된 스트림 닫기 (사용 후 닫기) 보통 finally에서 처리.
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ddd22.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			
//			int k = 0;
//			while(true) {
//				k = fis.read();
//				if(k==-1)break;
//				System.out.println(k + ":" +(char)(k)); 그림 소리 동영상 파일들을 처리할때는 무조건 1바이트씩 처리. 해당방식 사용.
//			}
//			int k = 0;
//			while ((k = fis.read()) != -1){
//				System.out.println(k + " : "+ (char)(k));
//			}
		// 배열을 이용하는 방법.
//			byte[] b = new byte[(int)(file.length())];
//			fis.read(b);
//			for (byte k : b) {
//				System.out.println(k + " : "+ (char)(k));
//			}
			

			byte[] b = new byte[(int)(file.length())];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
		
			
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				
			}catch(IOException e) {
			e.printStackTrace();
		}
		
	
	
	}
	
}
