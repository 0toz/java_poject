package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex13 {
	public static void main(String[] args) {
		// DataOutputStream 과 DataInputStream
		// 기본자료형을 주고 받을 때 사용. (기본 자료형을 읽고 쓰는 메소드가 별도로 존재.)
		// FileInputStream과 FileOutputStream과 다른점은
		// 이진(0,1) 데이터를 입출력할 때 사용. (타시스템과 입출력하때 유리)
		// ** 입력순서와 출력순서가 다르면 데이터의 결과가 달라질 수 있다.
		// BufferedInputStream과 BufferedOutputStream을 활용할 수 있다.

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict03.txt";

		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);

			// 읽는 메소드 : readㅌㅌ xx는 기본자료형.
			System.out.println(dis.readLong());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());

			
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			dos.writeLong(126L);
			dos.writeBoolean(true);
			dos.writeFloat(3.14f);
			dos.writeInt(3);
			dos.writeDouble(234.14);
			dos.writeChar('A');
			dos.flush();

	
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				dis.close();
				bis.close();
				fis.close();
				dos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}

	}

}
