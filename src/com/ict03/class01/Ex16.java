package com.ict03.class01;

import java.util.Iterator;

public class Ex16 {
	int s1 = 100;
	static int s2 = 200;
	// �ʱ�ȭ �� �����ʹ� �ʱ�ȭ�� ������ ��������.
	static {
		s2 = 2000;
		s3 = 3000;
		s4 = 4000;
	}

	static int s3 = 300;
	static int s4;

//	�ʱ�ȭ ���Ŀ�
//	�����ص� �����߻�����.

	public static void main(String[] args) {
		// System.out.println(s1);
		// �����ε� ����ƽ�޼���. ���θ޼��嵵 ����ƽ�̾ ���������� �ν��Ľ��̸� ����� �� ����.
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		// �ν��Ͻ��� ��������ؾ������� ����ƽ�������� �Ŀ� �ص���. ������ ���ϸ� ���� ����.

		String msg;
		msg = "���� i love you 123";

		char c1 = msg.charAt(7);
		System.out.println(c1);

		// ���� ���ڵ� �߿� �ҹ��ڸ� �빮�ڷ� �����Ͻÿ�.

		// ���ڿ��� ���̸� ������.

		System.out.println(msg.length());
		for (int i = 0; i < msg.length(); i++) { // ���̴� 1���� �����̴�.
			char c2 = msg.charAt(i);
			if (c2 >= 'a' && c2 <= 'z') {
				c2 = (char) (c2 - 32);// ������ ĳ���Ͱ� ���Ǹ� ĳ���ͷ� ���;��ϴϱ�.
			}
			System.out.print(c2);
		}

		String msg1 = "���ѹα�";

		String msg2 = "KOREA";
		String msg3 = msg1.concat(msg2);

		System.out.println(msg3);
		System.out.println(msg1 + msg2);

		// ��Ʈ�� ����,���� �� ��Ʈ���� �Һ��� ��Ģ���ִ�. ���ΰ�Ӹ���� ���δ�. ���θ�������⸸�һ� ���ϴ°� �ƴϴ�.
		// ���ѹα��� ���࿡ msg1 �� ����Ǿ��ְ� ���ѹα� korea�� �߰��Ͽ� ���̸� ���ѹα��̶�� ���� �������� ���´�.

		// contains (CharSequence(�̰� ��Ʈ������ ����) s) : boolean

		msg = "���� i love you 123";
		boolean b1 = msg.contains("you");

		// �弳 ����.

		System.out.println(b1);

		if (b1) {
			System.out.println("���ԵǾ� �ִ�");
		} else {
			System.out.println("���ԵǾ� �ִ�");
		}

		String s1 = "Korea";
		String s2 = "KOREA";
		String s3 = new String("Korea");
		String s4 = new String("Korea");

		System.out.println(s1 == s2); // false
		System.out.println(s2 == s3);// false
		System.out.println(s3 == s4);// false
		System.out.println();
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println();

		s1 = "seoul";
		s2 = "seoul";
		System.out.println(s1 == s2); // �ּҰ� ����?
		System.out.println(s1.equalsIgnoreCase(s2)); // ������ ����?

		//
		String msg4 = "�ѱ� ICT ���� ���߿�";
		int s5 = 14;
		double s6 = 98.167;
		String msg5 = msg4.format("%s�� ���۳⵵�� %d�� �̰� ��������� %.2f�̴�.", msg4, s5, s6);

		System.out.println(msg5);

		String msg6 = "java";
		byte[] b = msg6.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println((char) (b[i]) + " : " + b[i]);
		}

		// �ݴ�� �ش� ����Ʈ �迭�� ���ڿ��� ���� �� �ִ�. String ������ �̿��ϸ�ȴ�.
		String msg7 = new String(b);
		System.out.println(msg7);

		String msg8 = "�ڹ� 8 java8 ���� 123";
		char[] c = msg8.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.err.print(c[i]);
		}

//		�ݴ�� ĳ���� �迭�� ���ڷ� ���� �� �ִ�.

		String msg9 = new String(c);
		System.out.println(msg9);

		String msg10 = "BufferedReader";
		int k1 = msg10.indexOf('e'); // 4
		System.out.println(k1);

		// �ι�° 'e'�� ã�ƶ�.
		// ù���� 'e'�� 4�̹Ƿ� 5���� ã�ƾ� �ȴ�.
//		int len = 0;
//		boolean b2;
//		for (int i = 0; i < msg10.length(); i++) {
//			b2 = msg10.contains("e");
//			if(b1 == true)
//				len++;
//		} �������� �ƴ϶� �ɰ��� ������ üũ����...
//		
//		System.out.println(len);
//		
//		k1 = msg10.indexOf('e' , 5 );
//		for (int i = 0; i < len; i++) {
//			k1 = msg10.indexOf('e' , k1+1);
//			System.out.print(k1 +"  ");
//		}

		k1 = msg10.indexOf("er");
		System.out.println(k1);

		k1 = msg10.indexOf("er", msg10.indexOf("er") + 1);
		System.out.println(k1);
		System.out.println("==========================");

		String msg13 = "���ѹα�";
		String msg14 = msg13.replace("���ѹα�", "korea");
		String msg15 = msg13.replace(msg13, "korea");
		String msg16 = msg13.replace('��', '��');

		System.out.println(msg14);
		System.out.println(msg15);
		System.out.println(msg16);

		String msg17 = "���, ���� , ����, ������ , ���ξ���";
		String[] res = msg17.split(",");

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + "  ");
		}

		String[] res2 = msg17.split(",", 2);

		for (int i = 0; i < res2.length; i++) {
			System.out.println(res2[i]);
		}
		String[] res3 = msg17.split(",", 10);
		for (int i = 0; i < res3.length; i++) {
			System.out.println("i = " + i + ", res= " + res[i]);
		}

		String msg18 = "010-7979-9999";
		String res4 = msg18.substring(4);
		String res5 = msg18.substring(4, 8);
		String res6 = msg18.substring(msg18.indexOf('-') + 1, msg18.lastIndexOf('-'));

		String msg19 = "770707";
		String res7 = msg19.substring(0, 2);

//		����
//		010-7777-9999  �߰��ڸ����ڸ� x�� ġȯ 

		String msg20 = "�ڹ� 8 java8 Java8 JAVA8";
		String res9 = msg20.toLowerCase();
		String res10 = msg20.toUpperCase();

		String msg21 = "java8 Java8 �ڹ�8";
		String res11 = msg21.toString();

		String msg22 = "      �ڹ� java JAVA   ";
		System.out.println(msg22);
		System.out.println(msg22.trim());
		System.out.println(msg22.length());
		System.out.println(msg22.trim().length());

		boolean p1 = true;
		char p2 = 'c';
		int p3 = 100;
		long p4 = 10L;
		float p5 = 100.0f;
		double p6 = 100.0;

		// System.out.println(p1 + 1); �����߻� ������ +���� �Ұ�.
		System.out.println(p2 + 1); // char + ������ ������ ���´�.
		System.out.println(p3 + 1); //
		System.out.println(p4 + 1);
		System.out.println(p5 + 1);
		System.out.println(p6 + 1);

		System.out.println(String.valueOf(p1) + 1); // ����� �Ȱ� �ƴ϶� �ڿ� �پ���.
		// L�̳� f�� �����ִ°� �ƴ϶� �ڷ����� ��Ÿ�� ���̴�.
		System.out.println(p1 + "1");// �� ���� ���� �����͸� ��ƸԱ���.

		// 21�� �ݴ밳�� (���� �ڷ��� ����� ���ڿ��� ���� �ڷ������� ����)���� ����� ���ڿ��� ���ڷ� ����.

		msg = "true";
//			��¥ �Ҹ����� �ƴϱ� ������ �����߻�.
//		if(msg) {
//			break;
//		}
		boolean a1 = Boolean.parseBoolean(msg);
		if (a1) {
			System.out.println("���漺��");
		} else {
			System.out.println("���漺��2");
		}

		msg = "c";
		char a4 = msg.charAt(0);
		System.out.println(msg + 1);
		System.out.println(a4 + 1);
		System.out.println((char) (a4 + 1));

		// �ֹι�ȣ ���ڸ��� �޾Ҵ�? ���̸� ������.

		String jumin = "941210";
		String gender = "1";

		String year = jumin.substring(0, 2);
		int y_year = Integer.parseInt(year);

		if (gender.equals("1") || gender.equals("2")) {
			y_year = y_year + 1900;
		} else if (gender.equals("3") || gender.equals("4")) {
			y_year = y_year + 2000;
		}
	}

}
