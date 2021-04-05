package com.ict03.class02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd. hh: mm:ss E");
		System.out.println(dateFormat.format(date));
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yy.M.d. hh: mm:ss E");
		System.out.println(dateFormat2.format(date));
	
		
		System.out.println(date.getYear() + "�⵵"); // Calendar.get(Calendar.YEAR) 2021-1900.
		System.out.println(date.getMonth() +1 +  "��");//??�������� ���ڿ��� ���ڰ� �������µ� ���������̼���ƴ�??
		System.out.println(date.getDate() + "��");
		System.out.println(date.getHours() + "��");
		System.out.println(date.getMinutes() + "��");
		System.out.println(date.getDay() + "����");
		
		System.out.println("========================");
		
		//Calendar Ŭ����
		System.out.println(Calendar.getInstance().get(Calendar.YEAR)+ "�⵵");
		Calendar now = Calendar.getInstance(); // ��ǻ���� ���� ��¥�� �ð�, ������ ���Ѵ�.
		System.out.println(now.get(Calendar.YEAR)+ "�⵵");
		System.out.println(now.get(Calendar.MONTH)+ 1 + "��");
		System.out.println(now.get(Calendar.DATE)+ "��");
		System.out.println(now.get(Calendar.DAY_OF_MONTH)+ "��");

		//�ð� ; 12 �ð��� 24�ð���.
		System.out.println(Calendar.HOUR + "��"); //12�ð���
		System.out.println(Calendar.HOUR_OF_DAY + "��"); //24�ð���
		
		// 12�ð����� ����, ���İ� �ʿ��ϴ�.(AM_PM)
		// AM = 0 , PM = 1
		int res = now.get(Calendar.AM_PM);
		if(res ==0) {
			System.out.println("AM"+ now.get(Calendar.HOUR)+ "��");
		}else if(res==1) {
			System.out.println("PM" + now.get(Calendar.HOUR)+ "��");
		}
		
		
		// ���� (1 =>�Ͽ��� 7=>�����)
		
		int res2 = now.get(Calendar.DAY_OF_WEEK);
		switch(res2){
			case 1: System.out.println("�Ͽ���");break;
			case 2: System.out.println("������");break;
			case 3: System.out.println("ȭ����");break;
			case 4: System.out.println("������");break;
			case 5: System.out.println("�����");break;
			case 6: System.out.println("�ݿ���");break;
			case 7: System.out.println("�����");break;
		}
		
//		���� �Ǹ� ������ϱ� ��
		
		
//		Ư�������� �����ؼ� ����ϴ� ���.
		//1) nextInt(����) : 0���� ���������� ���� �߻�
		
		Random ran = new Random();
		
		
		int s1 = ran.nextInt(3);
		System.out.println(s1);
		
		
		//2.(int)(nextDouble() * ���� )// : 0- ���������� �� �� �߻�.
		//������ �� ���� �� ����� ���� �ν� �о.
		
		
		
		
	}
	
}
