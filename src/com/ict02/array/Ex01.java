package com.ict02.array;


public class Ex01 {
	public static void main(String[] args) {
		System.out.println();
		int[] su;
		su = new int[5];
		su[0]= 12;
		su[1] = 'j';
//		su[2]= 3.14;
//		su[3]= true;
//		su[4]= "j";
		su[2]= 321;
		su[3]= 31;
		su[4]= 121;
		
		System.out.println(su);
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
	
	}
}
