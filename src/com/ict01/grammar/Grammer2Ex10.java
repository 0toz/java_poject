package com.ict01.grammar;
class Grammer2Ex10{
	public static void main(String[] args){
//9630초는 몇시간 인가?

	int hour;
	int min;
	int sec;

	int time = 9630;

	hour = (int) (time / (60*60));
	min = (int) ((time % (60*60)) / 60);
	sec =  ((time %(60*60)) % 60); 

	System.out.println(hour + "시간" + min + "분" + sec + "초");
	}
}
