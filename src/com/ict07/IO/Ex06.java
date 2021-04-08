package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ddd22.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			// 기존 파일이 이쓰면 덮어ㅅ쓰기하고 없으면 생성한다.
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			bos.write(54);
			bos.write(97);
			// int이기 때문에 캐릭터를 넣을 수 있다.
			bos.write('j');
			bos.write(13);
			byte[] b = { 'h','i', 'j', 'a', 'v', 'a', 'o', 's', 13, 'k' };
			bos.write(b);
			
			
			bos.flush();
			// 아스키코드 자바에서는 13 캐리지 리턴 (CR) 복귀 \r 줄변경. 다른언어(메모장)중에는 \r\n(라인피드 10)를 같이 사용하는 경우도
			// 있다.
			// 기존파일이 있으면 이어쓰기 하고 없으면 생성한다.
//		fos = new FileOutputStream(file, true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
