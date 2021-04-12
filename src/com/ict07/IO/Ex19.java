package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		// 복사 장소와 파일명을 받고 붙이기 장소와 파일명을 받아서 붙이기 하자.

		Scanner scan = new Scanner(System.in);
		System.out.print("복사장소와 파일명 : ");
		String pathname1 = scan.next();
		System.out.print("붙이기 장소와 파일명 : ");
		String pathname2 = scan.next();

		File file1 = new File(pathname1);
		File file2 = new File(pathname2);

		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// 읽기
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine()) != null) {
				sb.append(msg + "\n");
			}

			// 쓰기
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());

			// 치환하기
			String str = sb.toString();
			str = str.replace("대한민국", "大韓民國");
			bw.write(str);
			bw.flush();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
