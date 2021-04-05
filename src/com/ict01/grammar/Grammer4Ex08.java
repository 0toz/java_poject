package com.ict01.grammar;
class  Grammer4Ex08
{
	public static void main(String[] args) 
	{
		// break label 레이블이 지정한 블록을 탈출 한다.
			//	단순 for문일때는 break와 break레이블이 같다.
		// continue 레이블이 지정한 블록의 증감식으로 이동.
		// 단순 for 문 일때는 continue 와 continue label이 같은 효과를 낸다.
// 레이블 만드는 법 원하는 반복문 앞에 '레이블명 :' 을 입력.



		for (int i = 1;i<11 ;i++ )
		{
			if(i==5) break;
			System.out.print(i + " " );
		}

		esc1:
		for (int i = 1;i<11 ;i++ )
		{
			if(i==5) break esc1;
			System.out.print(i + " " );
		}

		esc2:
		for (int i = 1;i<11 ;i++ )
		{
			for(int j =1; j < 6; j++){
				if(j==3) break esc2;
				System.out.println("i = "+ i + " j = " + j );
			}
		}

		System.out.println("======================");

		for (int i = 1;i<11 ;i++ )
		{
			if(i==5) continue;
			System.out.print(i + " " );
		}

		esc1:
		for (int i = 1;i<11 ;i++ )
		{
			if(i==5) continue esc1;
			System.out.print(i + " " );
		}

		esc2:
		for (int i = 1;i<11 ;i++ )
		{
			for(int j =1; j < 6; j++){
				if(j==3) continue esc2;
				System.out.println("i = "+ i + " j = " + j );
			}
		}



	}
}
