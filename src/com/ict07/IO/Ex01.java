package com.ict07.IO;

import java.io.File;

public class Ex01 {
	public static void main(String[] args) {
		String pathname_1 = "C:\\study\\util"; //운영체제가 윈도우일때 이렇게 표현.
		String pathname_2 = "C:/study/util"; // 운영체제가 리눅스 , Unix일때.
		//운영체제에 의해서 종속되어있는것 아니냐. 자바의 경우 운영체제에 불과하고 실행되어야함.
//		그래서 운영체제와 상관없이 쓰려면 어떻게 해야하는가?
		String pathname_3 = "C:" +File.separator + "study"+ File.separator + "util";
		//이렇게 쓰면 리눅스든 뭐든 알아서 바꿔줌 운영체제에 맞게.
		
		File file = new File(pathname_3);
		String[] arr = file.list();
		for (String k : arr) {
			//System.out.println(k);
			File file2 = new File(pathname_3 , k);
			/*
			System.out.println(file2);
			C:\study\ util\7z2101-x64.exe
          출력값 절대경로C:\study\ util\ChromeSetup.exe
			C:\study\ util    부모경로              D2Coding 자식경로
			C:\study\ util\D2CodingAll "\ u"가 의미가 있기때문에 오류발생.
			*/
			if(file2.isDirectory()) {
				System.out.println("디렉토리 : " + file2);
			}else {
				System.out.println("파일: " + file2);
			}
			
			
		}
		
	}

}
