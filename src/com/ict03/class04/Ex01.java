package com.ict03.class04;

public abstract class Ex01 {
// �߻� Ŭ���� : �߻�޼ҵ带 ������ �ִ� Ŭ������ �߻�Ŭ���� ��� �Ѵ�.
	
	// �Ϲ� ���� �޼ҵ�� �ʵ带 ���� �� �ִ�.
	
	int s1  =10; //�ν��Ͻ� ����
	static int s2 = 10; //����ƽ ����
	final int S3 = 10; //�ν��Ͻ� ���
	static final int S4 = 10; //����ƽ ���
	
	public void play() {
		System.out.println("�ν��Ͻ� �޼ҵ�");
		
	}
	public static void prn() {
		System.out.println("static �޼ҵ�");
	}

	//�߻�޼ҵ�
	public abstract void sound();

}

