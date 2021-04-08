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
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("복사 장소를 입력하시오 : ");
		String pathname1 = sc.next();
		System.out.print("복사할 파일명을 입력하시오 : ");
		String pathname2 = sc.next();

		String pathnameBefore = pathname1 +  File.separator + pathname2;
		System.out.println("붙일 장소를 입력하시오 : ");
		String pathname3 = sc.next();
		System.out.print("붙일 파일명을 입력하시오 : ");
		String pathname4 = sc.next();
		String pathnameAfter = pathname3 +  File.separator + pathname4;

		File file1 = new File(pathnameBefore);
		File file2 = new File(pathnameAfter);
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		
		try {
			fr =  new FileReader(file1);
			br = new BufferedReader(fr);
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg= br.readLine()) !=null) {
				sb.append(msg + "\n");
				
			}
			System.out.println(sb.toString());
			
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			//bw.write(sb.toString());
			
			String str = sb.toString();
			str = str.replace("대한민국", "eogksralsrnr");
			bw.write(str);
			
			
			bw.flush();
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
