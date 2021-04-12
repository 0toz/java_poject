package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("만들고자하는 파일 경로와 이름을 입력하시오.");
		String pathname1 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "3311.txt";
		
		File file1 = new File(pathname1);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			
			
			
			fw = new FileWriter(file1);
			bw = new BufferedWriter(fw);
			bw.write("이제 시작이다");
			
			
			
			
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine())!= null) {
				sb.append(msg+"/n");
			}
			
			
			bw.write(sb.toString());
			
			
			
			String str = sb.toString();
			str = str.replace("이제", "eogksralsrnr");
			bw.write(str);			
			

			bw.flush();
			
			
		} catch (Exception e) {
			System.out.println(e);
			
		}finally {
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
