package com.ict01.grammar;
class  Grammer4Ex08
{
	public static void main(String[] args) 
	{
		// break label ���̺��� ������ ����� Ż�� �Ѵ�.
			//	�ܼ� for���϶��� break�� break���̺��� ����.
		// continue ���̺��� ������ ����� ���������� �̵�.
		// �ܼ� for �� �϶��� continue �� continue label�� ���� ȿ���� ����.
// ���̺� ����� �� ���ϴ� �ݺ��� �տ� '���̺�� :' �� �Է�.



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
