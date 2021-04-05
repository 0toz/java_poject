package com;

import java.util.Random;
import java.util.Scanner;

public class baseBall {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

//		int[] a = {0,1,2,3,4,5,6,7,8,9};
		int i = 0;
		int[] game = { 0, 0, 0 };

		while (true) {
			game[i] = r.nextInt(9);
			i++;
			if (i >= 1 && game[i] == game[i - 1]) {
				i--;
			}
			if (i == 2)	break;
		}

		int[] answer = { 0, 0, 0 };
		int ball = 0;
		int strike = 0;
		int out = 0;
		int count = 0;
		while (true) {
			System.out.println("숫자 3개 입력");
			for (int j = 0; j < 3; j++) {
				answer[j] = sc.nextInt();
			}
			for (int k = 0; k < 3; k++) {
				if (game[k] == answer[k]) {
					strike++;
				} else if (game[k] == answer[(k + 1) % 3] || game[k] == answer[(k + 2) % 3]) {// j 이외의 수
					ball++;
				} else {
					out++;
				}
			}
			
			System.out.println("스트라이크 : "+ strike + "회");
			System.out.println("볼 : "+ ball + "회");
			System.out.println("아웃 : "+ out + "회");
			count = count +3;
			
		
			if(out == 3) {
				System.out.println("삼진아웃으로 게임에서 패배하셨습니다.");
				break;
			}
			if(count == 9) {
				System.out.println("당신이 이겼습니다.");
				break;
			}
			
		}

	}
}
