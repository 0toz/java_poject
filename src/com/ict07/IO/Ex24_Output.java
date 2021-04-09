package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

// 객체 직렬화 : ObjectOutputStream : writeObject()이거만 쓰면되는데 전제조건. 파일로 만들어 저장할것.
public class Ex24_Output {
	public static void main(String[] args) {
		
		// 직렬화란 특정클래스를 객체로 만들어 ...특정위치에 .ser로 만들어 저장한다 직렬화.)
	// 객체들이 가지고 있는 내용이 직렬화 되어있다. (사람은 정보를 제대로 볼 수 없다.)
		
		FileOutputStream  fos = null;
		BufferedOutputStream bos = null;
		
		ObjectOutputStream oos = null;
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util"  + File.separator  + "ict08.ser"; 
				File file = new File(pathname);
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream (bos); //스트림 체인방식.
			 
			//특정클래스를 객체로 만들자. VO
			// 객체 직렬화를 하기위한 객체 만들기.
			Ex24_VO vo1 = new Ex24_VO("마이콜",  28, 67.3, true);
			Ex24_VO vo2 = new Ex24_VO("고길동",  34, 59.3, true);
			Ex24_VO vo3 = new Ex24_VO("도우너",  23, 67.3, true);
			Ex24_VO vo4 = new Ex24_VO("희동이",  8, 61.3, false);
			Ex24_VO vo5 = new Ex24_VO("또치",  24, 62.3, false);
			//객체 직렬화 암호화.부호화(인코딩).
	//객체는 배열이나 컬렉션에 담을 수 있따.
			ArrayList<Ex24_VO> list = new ArrayList<Ex24_VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			//0과 1로 구성 바이트스트림.
			oos.writeObject(list);
			oos.flush();
			
			// 역직렬(복호화)디코딩)하기 전까지 무슨 내용인지 모름.
			
			
			
			
			
			
			
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
