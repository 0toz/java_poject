package com.ict03.class01;

public class Ex14 {
	
	private String name = "����";
	private int age = 3;
	private String addr = "����";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public Ex14(String name, int age , String addr) {
		this.name = name;
		this.addr = addr;
		this.age = age;

		System.out.println("�׹�° ������");
	}

	public Ex14( int age , String name) {
		this(name, age, "����");
		

	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Ex14() {
		this("������", 21, "����");
		// �⺻������ 
		// this. ��ü ���ο��� ��ü �ڽ��� ��Ī�ϴ� �����.
		// this ���� : ��������.
		
		// this() �����ڰ� �����ڸ� ȣ���� �� ����ϴ� �����. 
		// �ݵ�� ������ ù�ٿ��� ��밡��. �ι�° �ٿ� ���� ����.
		
		System.out.println("�⺻������ : " + this);
		System.out.println(this.name);
		System.out.println(this.getName());
	}
}
