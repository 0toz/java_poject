package com.ict03.class06;

enum Type2 {
//	순서를 지키자.
//	1. 들어갈 정보
	WALK("워킹화", 270), RUN("러닝화", 275), TRACK("트래킹화", 265), HIK("하이킹 화", 260);

	final private String name;
	final private int size;

	Type2(String name, int size) {
		this.name = name;
		this.size = size;
	}

	
	
	// 상수라서 바뀌지 않는다.
	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

}

public class Ex03 {
	public static void main(String[] args) {
			Type2[] arr = Type2.values();
			for(int i = 0; i < arr.length; i++) {
				if(i == 2)continue;
				System.out.println(arr[i].name() + ", ");
			}
	System.out.println("======================");
	for(Type2 k : arr) {
		System.out.println(k.getName()+ " , " + k.getSize());
	}
// 개선된 for 문 : foreach =  forin
//	for(자료형 내부에서사용할변수  : 배열 ) {
//		':' 의 의미가 배열이 가지고 있는 처음부터 끝까지 차례대로
//		내부에서 사용할 변수에 저장시키는 역할.
//		전체적으로 무얼하겠다는 되는데 개별 적용은 안됨.
//		
//	}
//		
	String[] msg = {"java", "jsp", "spring", "android"};
	for (String k : msg) {
		System.out.println(k);
	}
			
			
			
			
			
			
			
			
			
			
	}
}
