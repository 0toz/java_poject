package com.ict03.class03;

//Ex02 �� Ex03�� ��Ӱ���
public class Ex03 extends Ex02 {
	String name = "���θ�";
	int age = 34;
	static String hobby = "��ȭ����";
	
	public Ex03() {
		System.out.println("�ڽ� Ŭ���� ������" + this);
	}
	
	public void sound() {
		System.out.println("�ڽ� Ŭ���� �޼ҵ�");
	}
	
	public void study() {
		System.out.println("������� : " + addr);// ������������ ã������ . ��ü �������� �θ�Ŭ������ ����� ����Ѱ�.
		System.out.println("name : " + this.name ); 
		System.out.println("name : " + super.name ); //������������ ã�Ҵ�.
		
		//�θ�� �ڽ��� �����̸��� ������ �θ� ������ super.�� ���δ�.
	//�θ��� ���� ���� �� �� �ִ�.
	}
	public void walk() {
		System.out.println("�Ϸ翡 ������ �ѽð��� �ȴ´�.");
	}
	
	//�������̵��� �Ҽ����� ����� ����� final
	@Override
	public void eat() {
		System.out.println("��ħ���� �����Ѵ�.");
	}
	

}
