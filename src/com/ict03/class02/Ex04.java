package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		// 컴퓨터와 가위바위보 하기.
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		esc:
		while (true) {

			int com = (int) (Math.random() * 3);
			System.out.println("컴퓨터와 가위바위보를 시작합니다.");
			System.out.print("0.가위 1.바위  2.보 하나를 입력하시오. : ");
			int me = sc.nextInt();
			if(me == 1 || me == 2 || me == 0) {
			}else continue;

			int[][] result = { { 1, 0, 2 }, { 2, 1, 0 }, { 0, 2, 1 } };

			// 이기면 +1

			int i = me;
			int j = com;
			int winCount =0;
			int drawCount = 0;
			int loseCount = 0;
			
			
			if (result[i][j] == 1) {
				System.out.println("비겼습니다.");
				drawCount++;
			} else if (result[i][j] == 2) {
				System.out.println("당신이 이겼습니다.");
				winCount++;
				System.out.println();
			} else if (result[i][j] == 0) {
				System.out.println("컴퓨터가 이겼습니다.");
				loseCount++;
				System.out.println();
			
			} else
				System.out.println("오류");

			// 가위0 바위1 보2
			// 가위0 비김 짐 이김
			// 바위1 이김 비김 짐
			// 보2 짐 이김 비김

			System.out.print("계속할까요? y/n >> ");
			String msg = sc.next();
			if(msg.equalsIgnoreCase("y")) {
				continue esc;
			}
			else if(msg.equalsIgnoreCase("n")) {
				System.out.println("당신이 이긴횟수 : "+ winCount);
				System.out.println( "승률  :" + (winCount / (winCount + loseCount + drawCount)));
				break esc;
			}else {
				continue;
			}
			
			
			// 20번안에 숫자맞추기. 야구.
			// 2 3 5 하나도 안맞으면 삼진 아웃. 종료.
			// 1차배열 크기 3 숫자 0-9까지 맞추기. 순서도 맞아야함. 맞으면 스트라이크 틀리면 아웃 20번안에 올 스트라이크 나오면 승리.

		}

		
	}
}
