package com.ict01.grammar;
class  Grammer4Ex02
{
	public static void main(String[] args) 
	{
		for (int i = 1; i < 11 ; i++ )
		{
			System.out.println("¾È³çÇÏ¼¼¿ä"+ i);
		}

		for (int i = 1; i<16 ; i++ )
		{
			System.out.print(i + "  ");
		}
		System.out.println();
	
		for (int i = 1 ; i< 11 ; i++)
		{
			if(i % 2 == 0)
			System.out.print(i + " " );
		}
		
		System.out.println();
		for (int i = 1; i < 11 ; i++ )
		{
			if(i % 2 == 1)
			System.out.print(i + " " );
		}

		System.out.println();
		for ( int i = 0; i< 51 ; i++)
		{
			if(i % 7 == 0)
				System.out.print(i + " ");
		}
	
			System.out.println();

		for( int i = 1; i < 5 ; i ++){
			for(int j = 1;  j  < 5; j++){
				System.out.print(5 * ((4 * ( i - 1 )) + j) + " ");

			// 5 10 15 20
			// 25 30 35 40
			}
			System.out.println();
		}

		int sum = 0;
		for(int i = 1 ; i < 11 ; i++){
				
				sum += i;
				System.out.print(sum + "  ");
		}
		System.out.println();

		sum = 0;
		for(int i = 1 ; i< 11 ; i += 2){
			
			sum += i;
			System.out.print(sum + "  ");
		}
		System.out.println();

		sum = 0;
		for(int i = 2 ; i< 11 ; i += 2){
			
			sum += i;
			System.out.print(sum + "  ");
		}

		System.out.println();
		
		int fac = 1;
		for (int i = 7; i > 0 ; i-- )
		{
			fac = i * fac;
		}
		System.out.print(fac);
	
	}
}
