package com.ict01.grammar;
import java.util.Scanner;

class Grammer4Ex09 
{
	public static void main(String[] args) 
	{
		//���ѷ������� ���ڸ� �޾� ¦�� Ȧ�� �Ǻ�.


	// 1 - 10���� ¦���� ���. ��Ƽ�����.
		for(int i = 1; i< 11; i++){

			if(i%2 ==1) continue;
			System.out.println(i);
		}










		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("���ڸ� �Է��ϼ���  :");
			int k = sc.nextInt();
			String msg = "";
			if(k%2 ==0) {
				msg = "¦�� ";
			}else{
				msg = "Ȧ��";
			}

			System.out.println(k + "�� " + msg + "�Դϴ�.");

			System.out.println("��� �ұ��? ( 1. Yes , 2. No ) ");
			int k2  = sc.nextInt();
			if(k2 == 2)break;

//�߸� �Է��ϸ� �ٽ� �Է��ϰԲ��ؾ���.
		}


	}
}
