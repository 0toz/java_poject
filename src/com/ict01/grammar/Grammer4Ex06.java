package com.ict01.grammar;
class Grammer4Ex06
{
	public static void main(String[] args) 
	{
		for (int i =1 ; i <11 ; i++ )
		{
			if( i ==4 ) break;
		System.out.print(i + " ");
		}
	
		System.out.println();

			for (int i =1 ; i <11 ; i++ )
		{
			if( i==4) continue;
		System.out.print(i + " ");
		}
	
		

		for(int i = 1 ; i <4 ; i++){

			for (int j = 1	; j <6 ; j++ )
			{
				System.out.println("i = " + i + " ,j =" + j);
			}
	
		}
	}
}
