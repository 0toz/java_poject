package com.ict03.class03;

public class Ex08 {
	public static void main(String[] args) {
		Ex06_MP3 mp3 = new Ex06_MP3();
		mp3.call();
		
		System.out.println("������ : " + mp3.s_sms);
		mp3.sms();
		System.out.println("������ : " + mp3.s_sms);
		mp3.sound();
		
		Ex07_DCa dca = new Ex07_DCa();
		dca.call();
		
		System.out.println("������ : " + dca.s_sms);
		dca.sms();
	
		System.out.println("������ : " + dca.s_sms);
	
		dca.picture();
	
		System.out.println("======================");
		
		
		//��Ӱ��迡���� �θ�Ŭ������ ������ ���� �� �� �ִ�.
		// �� , �ڽ� Ŭ������ �޼ҵ带 ����� �� ����.
		// p1�� Ex06_Mp3Ŭ������ ���� �޼ҵ��� sound()�� ���� �� �� ����.
		
		Ex05 p1 = new Ex06_MP3();
		p1.call();
		p1.sms();
		System.out.println(p1.s_sms);
		//���� p1.sound();
		
		
		
		
	}
}
