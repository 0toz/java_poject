package com.ict01.grammar;
class Grammer2Ex10{
	public static void main(String[] args){
//9630�ʴ� ��ð� �ΰ�?

	int hour;
	int min;
	int sec;

	int time = 9630;

	hour = (int) (time / (60*60));
	min = (int) ((time % (60*60)) / 60);
	sec =  ((time %(60*60)) % 60); 

	System.out.println(hour + "�ð�" + min + "��" + sec + "��");
	}
}
