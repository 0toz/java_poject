package com.ict01.grammar;
import java.util.Scanner;

class  Grammer4Ex05
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("반복 횟수 : ");
		
		
		
		int n = 0 ;
		do
		{
			System.out.println(n);
			n++;
		
		}
		while (n < su);


		
		int i =  2;
		while ( i < 10)
		{
			System.out.println(i + "단");
			int j = 1;
			while (j <10)
			{
				System.out.println(i + "* " + j + " =" + (i * j) + " ");
					j++;
			}
			i++;
		}

*/

			
			System.out.print("반복횟수 = ");
		int loopT = sc.nextInt();
		int n = 0;
		String msg = "";
		do
		{
			System.out.print("판별 수 = ");
			int num  = sc.nextInt();			
			if( num % 2 == 0 )
				msg = "짝수 ";
			else
				msg = "홀수 ";

			System.out.println("입력한 수 " + num +"는 "  + msg + " 입니다.");
			
			n++;
		}
		while (n < loopT);


	}
}
