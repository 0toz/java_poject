package com.ict01.grammar;
import java.util.Scanner;

class  Grammer4Ex05
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("�ݺ� Ƚ�� : ");
		
		
		
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
			System.out.println(i + "��");
			int j = 1;
			while (j <10)
			{
				System.out.println(i + "* " + j + " =" + (i * j) + " ");
					j++;
			}
			i++;
		}

*/

			
			System.out.print("�ݺ�Ƚ�� = ");
		int loopT = sc.nextInt();
		int n = 0;
		String msg = "";
		do
		{
			System.out.print("�Ǻ� �� = ");
			int num  = sc.nextInt();			
			if( num % 2 == 0 )
				msg = "¦�� ";
			else
				msg = "Ȧ�� ";

			System.out.println("�Է��� �� " + num +"�� "  + msg + " �Դϴ�.");
			
			n++;
		}
		while (n < loopT);


	}
}
