package com.ict02.array;

import java.util.Arrays;
import java.util.Collections;

public class Ex03 {
	public static void main(String[] args) {
		int[] su = {3,4,9,5,6,1,7,2,10,8,};
		int tmp = 0;
		for(int i = 0; i < su.length ; i++) {
			for (int j = i+1; j < su.length; j++) {
				if(su[i] > su[j]) {
					tmp = su[j];
					su[j] = su[i];
					su[i] = tmp;
				}
			}
		}
		for (int j2 = 0; j2 < su.length; j2++) {
			
		 System.out.println( su [j2]);	
		}	
	
	
		System.out.println("===================");
	

		
		int[] su2 = {3,4,9,5,6,1,7,2,10,8,};
		Arrays.sort(su2);
		
		System.out.println("===================");
	//클래스를 자료형 배열로 사용.
		Integer[] su3 = {3,4,9,5,6,1,7,2,10,8,};
		Arrays.sort(su3, Collections.reverseOrder());
		
		for (int j2 = 0; j2 < su.length; j2++) {
			
			 System.out.println( su3[j2]);	
			}	
	
	
	}
		

}
