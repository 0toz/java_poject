package com.ict03.class01;

public class Ex02 {
//	Ŭ�����ȿ��� 3���� ����
//	����ʵ� ��� �޼��� ������.
//	����ʵ�� ��ҿ� ������ ����. static�� instance�� ����
	public static void main(String[] args) {
//	�������� ��밡��.
	}
		int k1 = 80; //�ν��Ͻ�
		static int k2 = 90; //����ƽ����.
		final int K3 = 85; //  �ν��Ͻ� ���. final�̺����� ���.
		static final int K4 = 95; // static��� API���� �����ϴ� ��� ����


//		����޼ҵ� : ���� , ���.
		
		// �ν��Ͻ� �̸鼭 ��ȯ���� ����.
		public void prn01() {
			k1 = k1 +20;
			k2 = k2 +10;
//			K3 = K3 + 15;//���
//			K4 = k5	+ 5;//��� ������ �ȵǼ� ����
			System.out.println("k1 = " + k1);
			System.out.println("k2 = " + k2);
	
			//�̸������������ static�� ���������� �� �� ����.
		}
//		����ƽ ��ȯ���� ����. return������ ����.
		public static void prn02() {
			//����ƽ �޼��忡���� �ν��ͽ� ������ ����� �� ����.
			
		}
//		�ν��Ͻ� ��ȯ�� ���� �������ٿ� return '����������'�� �־����.
		public int prn03() {
			
			return 'c'; //����
		}
//		����ƽ ��ȯ���� ����.
		public static double prn04() {
			
			return '3';
		}
		
	
	

}
