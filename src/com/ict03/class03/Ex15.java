package com.ict03.class03;

public class Ex15 extends Ex14{
	String name = "ȫ����";
	int id = 2410;
	public Ex15() {
		super("������", 14);
		System.out.println("�ڽ�Ŭ���� ������ :"+ this);
		name ="ȫ�α�";
		id = 1004;
	}
	
	public Ex15(String name) {
		super("�±Ǻ���", 43);
		this.name =name;
	}
	
	public void prn() {
		String name ="ȫ��";
		//����,����,�θ� ��ΰ����̸��Ǻ������������ִ�. ; �ݵ�ñ���.
		System.out.println("���������̸� :" + name);
		System.out.println("���������̸� :" + this.name);
		System.out.println("�θ𺯼��̸� :" + super.name);
		
		// �θ� �������ִº��� :���������ʾƵ���.
		System.out.println("���������̸� :" + age);
		System.out.println("���������̸� :" + this.age);
		System.out.println("�θ𺯼��̸� :" + super.age);
	
		//���������� ������ �ִ� ����
		System.out.println("���������̸� :"+ id);
		System.out.println("���������̸� :"+ this.id);
		//System.out.println("�θ𺯼��̸� :"+ super.id);// �θ𸸰������ִ�.
		
	
	}
}
