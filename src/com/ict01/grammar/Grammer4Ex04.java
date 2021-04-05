package com.ict01.grammar;
class Grammer4Ex04
{
 
	public static void main(String[] args) 
	{
		int n = 0;
		while (n < 16)
		{
			System.out.println(n);
			n++;
		}
		int couple = 0;
		int solo =0;
		n= 0;
		
		while ( n < 11)
		{
			if(n%2 == 1){
				System.out.print(n + " ");
				solo += n;
			}
			
			n++;
		}
		System.out.println();

		n= 1;
		while ( n < 11)
		{
			if(n%2 == 0){
				System.out.print(n + " ");
				couple += n;
			}
			
			n++;
		}	
		System.out.println();
	
		n= 0;
		while ( n < 50)
		{
			if(n % 7 == 0){
				System.out.print(n + "  ");
			}
			
			n++;
		}

		System.out.println();

		n= 0;
		while ( n < 10)
		{
			
			System.out.println(5 + " * " + n + " = " +(5 * n));
			
			
			n++;
		}

		n = 0;
		
		while ( n < 4)
		{
			int a = 0;
			while(a < 4){
				System.out.print('0'+ " ");
				a++;
			}
			System.out.println();
			n++;
		}
		n= 10;
		int sum = 0;
		while(true){
			sum += n;
			n--;
			if(n<1) break;
		}
		System.out.println(sum);


		System.out.println("È¦¼ö ÇÕ : " + solo + " Â¦¼ö ÇÕ : " + couple);

	}

}