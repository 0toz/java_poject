package com.ict03.class06;

enum Type2 {
//	������ ��Ű��.
//	1. �� ����
	WALK("��ŷȭ", 270), RUN("����ȭ", 275), TRACK("Ʈ��ŷȭ", 265), HIK("����ŷ ȭ", 260);

	final private String name;
	final private int size;

	Type2(String name, int size) {
		this.name = name;
		this.size = size;
	}

	
	
	// ����� �ٲ��� �ʴ´�.
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
// ������ for �� : foreach =  forin
//	for(�ڷ��� ���ο�������Һ���  : �迭 ) {
//		':' �� �ǹ̰� �迭�� ������ �ִ� ó������ ������ ���ʴ��
//		���ο��� ����� ������ �����Ű�� ����.
//		��ü������ �����ϰڴٴ� �Ǵµ� ���� ������ �ȵ�.
//		
//	}
//		
	String[] msg = {"java", "jsp", "spring", "android"};
	for (String k : msg) {
		System.out.println(k);
	}
			
			
			
			
			
			
			
			
			
			
	}
}
