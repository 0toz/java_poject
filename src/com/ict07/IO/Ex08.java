package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		// 속도 향상을 위해서 BufferedInputStream을 사용한다.
		// 혼자서는 사용할 수 없고 반드시 inputStream을 받아서 사용.
		// 생성자 : BufferedInputStream(InputStream in)

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ddd22.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
//		int k = 0;
//		while(true) {
//			k = fis.read();
//			if(k==-1)break;
//			System.out.println(k + ":" +(char)(k));
//		}
//		int k = 0;
//		while ((k = fis.read()) != -1){
//			System.out.println(k + " : "+ (char)(k));
//		}
			// 배열을 이용하는 방법.
//		byte[] b = new byte[(int)(file.length())];
//		fis.read(b);
//		String str = new String(b);
//		System.out.println(str);
//		for (byte k : b) {
//			System.out.println(k + " : "+ (char)(k));
//		}

			byte[] b = new byte[(int) (file.length())];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}