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
			System.out.print("숫자입력 : ");
			int k = sc.nextInt();
			String msg = "";
			if(k%2 ==0){
				msg = "짝수";
			}else{
				msg = "홀수";
			}
			System.out.println(k + "는 " + msg + " 입니다.");
			
			while(true){
				System.out.println("계속할까요? (1.yes , 2.no) ");
				int k2 = sc.nextInt();
				if(k2 == 1){
					continue esc;
					//break; 해도됨.빠져나가도 다음 실행문 없으니 돌아가니까.
				
				} 
				else if (k2 == 2)
				{
					break esc;
				}else{
					System.out.println("다시 입력해주세요");
					continue;

				}

			}

		}
	}
}
