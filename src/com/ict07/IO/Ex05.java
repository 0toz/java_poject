package com.ict07.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.annotation.processing.FilerException;

public class Ex05 {
	public static void main(String[] args) {

//		FileOutputStream : 파일을 대상으로 1byte씩 데이터 쓰기를 할 수 있는 스트림.
//		주요메소드.
//		파일에서 추가 덮어쓰기냐 아니냐의 개념.
//		생성자 : FileOutputStream (File file)<<덮어써짐., FileOutputStream(File file, boolean append)
//		FileOutputStream(String name)<<덮어써짐	,FileOutputStream(String name , boolean append)
//		boolean append : false or 생략을 하면 덮어쓰기 , true르 ㅏㅕ
//	
//		파일을 열었으면 무조건 닫아줘야함.
//		주요메소드
//		write(int b)  한글자 쓰기 가능( 영문자 숫자 )
//		write(byte[] b) 여러글자를 바이트 배열에 넣어서 쓰기가능
// 		flush()  -> write 후 반드시 실행
//		close() = > open된 스트림 닫기 (사용후 닫기 ), 보통 파이널리로 처리.
		
		
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ddd.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		try {
			// 기존 파일이 이쓰면 덮어ㅅ쓰기하고 없으면 생성한다.
			fos = new FileOutputStream(file);
			fos.write(54);
			fos.write(97);
			// int이기 때문에 캐릭터를 넣을 수 있다.
			fos.write('j');
			fos.write(13);
			byte[] b = {'b', 'o', 's', 13, 'k'};
			fos.write(b);	
			
			
			fos.flush();
			//아스키코드 자바에서는 13 캐리지 리턴 (CR) 복귀 \r 줄변경. 다른언어(메모장)중에는 \r\n(라인피드 10)를 같이 사용하는 경우도 있다.
			// 기존파일이 있으면 이어쓰기 하고 없으면 생성한다.
//			fos = new FileOutputStream(file, true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}
}
