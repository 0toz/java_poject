package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

// 객체 역직렬 : ObjectInputStream : readObject()

public class Ex23_Input {

	public static void main(String[] args) {
		// 객체 역 직렬화 : 직렬화된 파일이나 정보를 원래 내용으로 복원하는 역할을 함.
		// 직렬화 직전. Ex23_VO vo = new Ex23_VO(ddd,어쩌구,s, ,sd)
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util"  + File.separator  + "ict07.ser"; 
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			ois.readObject();
			// 역직렬화 원래 객체로 되돌아간다.
			Ex23_VO vo = (Ex23_VO)ois.readObject();
			
			System.out.println(vo.getName());
			System.out.println(vo.getAge());
			System.out.println(vo.getWeight());
			System.out.println(vo.isGender());
			//class를 셀렉션에 넣는게 최고다.
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
