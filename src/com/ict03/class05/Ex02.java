package com.ict03.class05;

public class Ex02 {
	public static void main(String[] args) {
// ��ü �������� Ŭ���� �̸����� ���� ����.
		
		System.out.println(Ex01.su1);
		System.out.println(Ex01.su2);
		System.out.println(Ex01.su3);
		System.out.println(Ex01.su4);
// �������� �ȵ�.
//		System.out.println(Ex01.su1++);
//		System.out.println(Ex01.su2++);
//		System.out.println(Ex01.su3++);
//		System.out.println(Ex01.su4++);
		
		
	}

	
}
class Ex03 implements Ex01 {
	@Override
	public void like() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
}

abstract class Ex04 implements Ex01{
	
}
//�������̽��� �������̽��� ���
interface Ex05 extends Ex01{
	
}
