package com.ict03.class01;

public class Ex04_main {

	public static void main(String[] args) {
		// Ex04�� Ŭ���� ��ü�� ����.
		Ex04 test = new Ex04();
		
		
		//plus01 �� ���̵� �̹Ƿ� ���� �����Ͱ� ����.
		//test.plus01();
		test.sub01();
		System.out.println( test.result);
		//���� 0�̾����� ������ 15�� �Ǿ��⶧��. �޼ҵ�� ȣ���ؾ߸� �����̵ȴ�!.
		int sub = test.sub01();
		System.out.println(sub);
		
	}

}
