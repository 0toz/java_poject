package com.ict05.exception;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex04 {
	public static void main(String[] args) {
		//로또 : 1- 45(랜덤, 6자리 , 중복안됨)
		HashSet<Integer> lotto = new HashSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math.random()*45)+1;
			boolean b = lotto.add(k);
			if(!b) { // 중복되었을 떄.
				i--;
			}
		}
		System.out.println(lotto);
	
		TreeSet<Integer> lotto2 = new TreeSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math.random()*45)+1;
			boolean b = lotto2.add(k);
			if(!b) { // 중복되었을 떄.
				i--;
			}
		}
		System.out.println(lotto2);
		
	
	
	
	
	
	
	}
}
