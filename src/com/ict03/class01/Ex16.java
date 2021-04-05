package com.ict03.class01;

import java.util.Iterator;

public class Ex16 {
	int s1 = 100;
	static int s2 = 200;
	// 초기화 전 데이터는 초기화를 만나면 없어진다.
	static {
		s2 = 2000;
		s3 = 3000;
		s4 = 4000;
	}

	static int s3 = 300;
	static int s4;

//	초기화 이후에
//	선언해도 오류발생안함.

	public static void main(String[] args) {
		// System.out.println(s1);
		// 메인인데 스태틱메서드. 메인메서드도 스태틱이어서 전역변수가 인스탠스이면 사용할 수 없다.
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		// 인스턴스는 선언부터해야하지만 스태틱은선언을 후에 해도됨. 선언을 안하면 물론 오류.

		String msg;
		msg = "대한 i love you 123";

		char c1 = msg.charAt(7);
		System.out.println(c1);

		// 다음 문자들 중에 소문자를 대문자로 변경하시오.

		// 문자열의 길이를 구하자.

		System.out.println(msg.length());
		for (int i = 0; i < msg.length(); i++) { // 길이는 1부터 시작이다.
			char c2 = msg.charAt(i);
			if (c2 >= 'a' && c2 <= 'z') {
				c2 = (char) (c2 - 32);// 정수와 캐릭터가 계산되면 캐릭터로 나와야하니까.
			}
			System.out.print(c2);
		}

		String msg1 = "대한민국";

		String msg2 = "KOREA";
		String msg3 = msg1.concat(msg2);

		System.out.println(msg3);
		System.out.println(msg1 + msg2);

		// 스트링 버퍼,빌더 씀 스트링은 불변의 법칙이있다. 새로계속만들면 쌓인다. 새로만들어지기만할뿐 변하는게 아니다.
		// 대한민국이 만약에 msg1 에 연결되어있고 대한민국 korea를 추가하여 붙이면 대한민국이라는 값이 가비지로 남는다.

		// contains (CharSequence(이걸 스트링으로 본다) s) : boolean

		msg = "대한 i love you 123";
		boolean b1 = msg.contains("you");

		// 욕설 수정.

		System.out.println(b1);

		if (b1) {
			System.out.println("포함되어 있다");
		} else {
			System.out.println("포함되어 있다");
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
		System.out.println(s1 == s2); // 주소가 같냐?
		System.out.println(s1.equalsIgnoreCase(s2)); // 내용이 같냐?

		//
		String msg4 = "한국 ICT 인재 개발원";
		int s5 = 14;
		double s6 = 98.167;
		String msg5 = msg4.format("%s의 시작년도는 %d년 이고 평균점수는 %.2f이다.", msg4, s5, s6);

		System.out.println(msg5);

		String msg6 = "java";
		byte[] b = msg6.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println((char) (b[i]) + " : " + b[i]);
		}

		// 반대로 해당 바이트 배열을 문자열로 만들 수 있다. String 생성자 이용하면된다.
		String msg7 = new String(b);
		System.out.println(msg7);

		String msg8 = "자바 8 java8 大韓 123";
		char[] c = msg8.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.err.print(c[i]);
		}

//		반대로 캐릭터 배열을 문자로 만들 수 있다.

		String msg9 = new String(c);
		System.out.println(msg9);

		String msg10 = "BufferedReader";
		int k1 = msg10.indexOf('e'); // 4
		System.out.println(k1);

		// 두번째 'e'를 찾아라.
		// 첫번쨰 'e'가 4이므로 5부터 찾아야 된다.
//		int len = 0;
//		boolean b2;
//		for (int i = 0; i < msg10.length(); i++) {
//			b2 = msg10.contains("e");
//			if(b1 == true)
//				len++;
//		} 컨테인이 아니라 쪼개고 갯수를 체크한후...
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

		String msg13 = "대한민국";
		String msg14 = msg13.replace("대한민국", "korea");
		String msg15 = msg13.replace(msg13, "korea");
		String msg16 = msg13.replace('한', '韓');

		System.out.println(msg14);
		System.out.println(msg15);
		System.out.println(msg16);

		String msg17 = "사과, 딸기 , 망고, 오렌지 , 파인애플";
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

//		퀴즈
//		010-7777-9999  중간자리끝자리 x로 치환 

		String msg20 = "자바 8 java8 Java8 JAVA8";
		String res9 = msg20.toLowerCase();
		String res10 = msg20.toUpperCase();

		String msg21 = "java8 Java8 자바8";
		String res11 = msg21.toString();

		String msg22 = "      자바 java JAVA   ";
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

		// System.out.println(p1 + 1); 오류발생 논리형은 +연산 불가.
		System.out.println(p2 + 1); // char + 정수는 정수로 나온다.
		System.out.println(p3 + 1); //
		System.out.println(p4 + 1);
		System.out.println(p5 + 1);
		System.out.println(p6 + 1);

		System.out.println(String.valueOf(p1) + 1); // 계산이 된게 아니라 뒤에 붙었음.
		// L이나 f는 값이있는게 아니라 자료형을 나타낼 뿐이다.
		System.out.println(p1 + "1");// 과 같음 좀더 데이터를 잡아먹긴함.

		// 21의 반대개념 (각종 자료형 모양의 문자열을 각종 자료형으로 변경)숫자 모양의 문자열을 숫자로 변경.

		msg = "true";
//			진짜 불린형이 아니기 때문에 오류발생.
//		if(msg) {
//			break;
//		}
		boolean a1 = Boolean.parseBoolean(msg);
		if (a1) {
			System.out.println("변경성공");
		} else {
			System.out.println("변경성공2");
		}

		msg = "c";
		char a4 = msg.charAt(0);
		System.out.println(msg + 1);
		System.out.println(a4 + 1);
		System.out.println((char) (a4 + 1));

		// 주민번호 앞자리를 받았다? 나이를 구하자.

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
