package com.ict03.class01;

public class Ex15 {
	//static ��ü ������ ������� �̸� ��������� �ʵ�� �޼ҵ� 
	// Ŭ������ �������������� static ����� �� �� ����.
	// �������� (��� ��ü�� ��� �� �� �ִ�.)
	//	���������ڰ� private�̸� static�̶� ������ �� ����.
	
	int su1 = 10 ;
	static int su2 = 10;
	
	public Ex15() {
		su1++;
		su2++;
		
	}
	
	public void prn() {
		int su3 = 10;
		//static int su4 = 10; ����ƽ�� �޼���ȿ� ���� �� ����.
		
	}
	// static �޼ҵ��  static ������ ������ �� �ִ�.
	public static void prn2() {
		//	System.out.println(su1); ����. // �ν��Ͻ� ���� ���� �ȵ�.
		System.out.println(su2);
		int su4 = 10;
		//static int su5 = 10; ���������� ����ƽ���ȵ�.
		
		
	}
}
