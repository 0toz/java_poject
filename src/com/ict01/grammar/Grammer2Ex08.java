package com.ict01.grammar;
class Grammer2Ex08{

	public static void main(String[] args){
	//아메리카노 2500 친구랑 둘이서 10000내고 주문.
//잔돈은? 부가세 10프로.
	
	int pay = 2500;
	double tax = 2500 / 10;

	int sum = (int)(10000 - pay * 2 - tax * 2);

	System.out.println("잔돈은 "+ sum);	



	}
}