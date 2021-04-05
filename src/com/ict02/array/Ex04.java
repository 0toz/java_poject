package com.ict02.array;

public class Ex04 {
	public static void main(String[] args) {
		//순위 구하기.
		// 모든사람의 순위를 1등으로 초기화한다.
		// 모든사람들과 비교해야한다. 단 자기자신은 비교할 필요가 없다.(i=j)
		// 나보다 클때마다 ++
		
		int[] su = {270, 265, 285, 290, 285};
		int[] rank = {1, 1, 1, 1, 1};
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(su[i] == su[j]) continue;
				if(su[i] < su[j]) {
					rank[i]++;
				}
			}
		}
		
		for (int i = 0; i < rank.length; i++) {
			System.out.println(rank[i]);
		}
		
		
		
	}
}
