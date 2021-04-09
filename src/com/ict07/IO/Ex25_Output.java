package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

// 객체 직렬화 : ObjectOutputStream : writeObject()이거만 쓰면되는데 전제조건. 파일로 만들어 저장할것.
public class Ex25_Output {
	public static void main(String[] args) {

		// 직렬화란 특정클래스를 객체로 만들어 ...특정위치에 .ser로 만들어 저장한다 직렬화.)
		// 객체들이 가지고 있는 내용이 직렬화 되어있다. (사람은 정보를 제대로 볼 수 없다.)

		Scanner sc = new Scanner(System.in);
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict09.ser";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos); // 스트림 체인방식.

			// 특정클래스를 객체로 만들자. VO
			// 객체 직렬화를 하기위한 객체 만들기.
			Ex25_VO list = new Ex25_VO("김땡칠", 88, 67, 97);

			esc:
			while(true) {
				System.out.println("이름 : ");
				String name = sc.next();
				System.out.println("국어 : ");
				int kor = sc.nextInt();
				System.out.println("영어 : ");
				int eng = sc.nextInt();
				System.out.println("수어 : ");
				int math = sc.nextInt();

				Ex25_VO vo = new Ex25_VO(name, kor, eng, math);
				list.add(vo);
				while(true) {
					System.out.println("계속할까요?(y/n)");
					String msg = sc.next();
					if(msg.equalsIgnoreCase("y")) {
					 continue esc;
					}else if(msg.equalsIgnoreCase("n")) {
						 
						 break esc;
					}else continue;	 
				}
			}
			
		
		
			
			// 객체 직렬화
			oos.writeObject(list);
			oos.flush();

			// 역직렬하기 전까지 무슨 내용인지 모름.

		}catch(

	Exception e)
	{
		// TODO: handle exception
	}finally
	{
		try {
			oos.close();
			bos.close();
			fos.close();

		} catch (Exception e2) {
			// TODO: handle exception
		}
	}

}}
