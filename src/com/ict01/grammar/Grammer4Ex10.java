package com.ict01.grammar;
import java.util.Scanner;

class  Grammer4Ex10
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		esc:
		while (true)
		{
			System.out.print("�����Է� : ");
			int k = sc.nextInt();
			String msg = "";
			if(k%2 ==0){
				msg = "¦��";
			}else{
				msg = "Ȧ��";
			}
			System.out.println(k + "�� " + msg + " �Դϴ�.");
			
			while(true){
				System.out.println("����ұ��? (1.yes , 2.no) ");
				int k2 = sc.nextInt();
				if(k2 == 1){
					continue esc;
					//break; �ص���.���������� ���� ���๮ ������ ���ư��ϱ�.
				
				} 
				else if (k2 == 2)
				{
					break esc;
				}else{
					System.out.println("�ٽ� �Է����ּ���");
					continue;

				}

			}

		}
	}
}
