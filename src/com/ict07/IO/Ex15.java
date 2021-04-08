package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex15 {
	public static void main(String[] args) {
		// 문자 스트림(사람중심) : 모든 처리를 2바이트씩 처리
		//대상 전세계 의 모든 언어로 구성된 문서 파일들
		// 최상위 클래스 : 리더 (입력) ,Writer(출력)
		//FileOutputStream (바이트) : 1바이트 처리 , write(int b) , write(byte[] b); 
		// FileWriter(문자) : 2byte 처리 , write(int b) , write(char[] b), write(String str);
		// BuffereWrite : 속도 향상을 위해 사용. 줄바꾸기 메소드가 존재한다.
		String pathname = "C:" + File.separator + "study"+
							File.separator+ "util"+ File.separator + "ict05.txt" ;
		
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(97);
			bw.write(65);
// int 이므로 'x' 캐릭터 형으로 대체 할 수 있다.
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.write('대');// FileOutputStream은 안되지만 FileWriter는 가능.
			bw.write('한');// FileOutputStream은 안되지만 FileWriter는 가능.
			bw.write(13);
			char[] c = {'k', 'o', 'r', 'e', 'a', 13, '대', '한', '민', '국'};
			
			bw.write(c);
			bw.newLine();
			bw.write("한국 ICT인재 개발원\n");
			bw.newLine();
			bw.write("1강의장");
			
			
			bw.flush();
			
			
		}catch (Exception e) {
			
		}finally {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	
	
	
	}
}
