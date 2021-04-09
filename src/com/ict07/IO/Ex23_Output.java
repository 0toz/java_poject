package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// 객체 직렬화 : ObjectOutputStream : writeObject()이거만 쓰면되는데 전제조건. 파일로 만들어 저장할것.
public class Ex23_Output {
	public static void main(String[] args) {
		
		// 직렬화란 특정클래스를 객체로 만들어 ...특정위치에 .ser로 만들어 저장한다 직렬화.)
	// 객체들이 가지고 있는 내용이 직렬화 되어있다. (사람은 정보를 제대로 볼 수 없다.)
		
		FileOutputStream  fos = null;
		BufferedOutputStream bos = null;
		
		ObjectOutputStream oos = null;
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util"  + File.separator  + "ict07.ser"; 
				File file = new File(pathname);
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream (bos); //스트림 체인방식.
			 
			//특정클래스를 객체로 만들자. VO
			// 객체 직렬화를 하기위한 객체 만들기.
			Ex23_VO vo = new Ex23_VO("둘리",  28, 67.3, true);
		
			//객체 직렬화
			oos.writeObject(vo);
			oos.flush();
			
			// 역직렬하기 전까지 무슨 내용인지 모름.
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	
	
	
	
	
	
	}
}
