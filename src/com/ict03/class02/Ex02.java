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
	
		
		System.out.println(date.getYear() + "년도"); // Calendar.get(Calendar.YEAR) 2021-1900.
		System.out.println(date.getMonth() +1 +  "월");//??묶음없이 문자열과 숫자가 더해졌는데 덧셈연산이수행됐다??
		System.out.println(date.getDate() + "일");
		System.out.println(date.getHours() + "시");
		System.out.println(date.getMinutes() + "분");
		System.out.println(date.getDay() + "요일");
		
		System.out.println("========================");
		
		//Calendar 클래스
		System.out.println(Calendar.getInstance().get(Calendar.YEAR)+ "년도");
		Calendar now = Calendar.getInstance(); // 컴퓨터의 현재 날짜와 시간, 요일을 뜻한다.
		System.out.println(now.get(Calendar.YEAR)+ "년도");
		System.out.println(now.get(Calendar.MONTH)+ 1 + "월");
		System.out.println(now.get(Calendar.DATE)+ "일");
		System.out.println(now.get(Calendar.DAY_OF_MONTH)+ "일");

		//시간 ; 12 시간제 24시간제.
		System.out.println(Calendar.HOUR + "시"); //12시간제
		System.out.println(Calendar.HOUR_OF_DAY + "시"); //24시간제
		
		// 12시간제는 오전, 오후가 필요하다.(AM_PM)
		// AM = 0 , PM = 1
		int res = now.get(Calendar.AM_PM);
		if(res ==0) {
			System.out.println("AM"+ now.get(Calendar.HOUR)+ "시");
		}else if(res==1) {
			System.out.println("PM" + now.get(Calendar.HOUR)+ "시");
		}
		
		
		// 요일 (1 =>일요일 7=>토요일)
		
		int res2 = now.get(Calendar.DAY_OF_WEEK);
		switch(res2){
			case 1: System.out.println("일요일");break;
			case 2: System.out.println("월요일");break;
			case 3: System.out.println("화요일");break;
			case 4: System.out.println("수요일");break;
			case 5: System.out.println("목요일");break;
			case 6: System.out.println("금요일");break;
			case 7: System.out.println("토요일");break;
		}
		
//		내년 되면 까먹으니까 ㅇ
		
		
//		특정범위를 지정해서 사용하는 방법.
		//1) nextInt(정수) : 0부터 정수전까지 난수 발생
		
		Random ran = new Random();
		
		
		int s1 = ran.nextInt(3);
		System.out.println(s1);
		
		
		//2.(int)(nextDouble() * 숫자 )// : 0- 정수전까지 난 수 발생.
		//더블을 더 많이 씀 경우의 수가 훨시 넓어서.
		
		
		
		
	}
	
}
