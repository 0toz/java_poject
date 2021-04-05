package com.ict02.array;

import java.util.Iterator;

public class Ex09 {
	public static void main(String[] args) {
		int[][] persons = new int[5][];
		
		
		int[] person0 = {1,270 , 90, 'a',1};
		int[] person1 = {1,270 , 90, 'a',1};
		int[] person2 = {1,270 , 90, 'a',1};
		int[] person3 = {1,270 , 90, 'a',1};
		int[] person4 = {1,270 , 90, 'a',1};
		
		persons[1][] = person0;
		
		
		
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons.length; j++) {
				if(persons[i][1]) < persons[j][1]) {
					persons[i][4]++;
				}
			}
		}
		
		
		int[] tmp = new int[5];
		for(int i = 0; i <tmp.length-1; i++) {
			for (int j = i+1; j < tmp.length; j++) {
				if(persons[i][4] > persons[j][4]) {
					tmp = persons[i];
					persons[i]	= persons[j];
					persons[j]=	tmp;
				}
			}
		}
		
	
		
//		Ãâ·Â
		for (int j = 0; j < persons.length; j++) {
			for (int j2 = 0; j2 < persons.length; j2++) {
				if(j2==3) {
					System.out.println((char) (persons[j][j2])+ " ");
				}
				else {
					System.out.println();
				}
			}
		}
	}
		
		
		
		
		
}

