package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex09 {
	public static void main(String[] args) {

		// C:\\study\\ util \\ test100.txt
		// 이름 : --
		// 나이 : 00
		// 전화번호 000-0000-0000
		//

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "test100.txt";

		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String msg = " 이름 : 김인환 \n 나이 : 13 \n 전화번호 : 010- 22 -222"
			
			
			
		} catch (Exception e) {

		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e) {

			}
		}

	}
}
