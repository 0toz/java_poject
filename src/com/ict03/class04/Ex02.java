package com.ict03.class04;

public class Ex02 extends Ex01 {

	@Override
	public void sound() {
		// TODO Auto-generated method stub

	}
//�������̵� ���Ϸ��� �ڽ�Ŭ������ �߻� Ŭ������ ��������.
	
	// �θ��� �߻�޼ҵ带 ��üȭ �����ʰ� �� �߻�޼ҵ带 �߰���.
	abstract class Ex03 extends Ex01 {
		public void song() {
			System.out.println("�뷡�ϱ�");
		}
	}
	abstract class Ex04 extends Ex01{
		public void music() {
			System.out.println("������");
		}
	}

	public abstract void pop() 	;
	
	
}
