package com.ict06.Thread;

public class Ex06_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex04 t1 = new Ex04();
		Ex05 t2 = new Ex05();
		Ex06 t3 = new Ex06();
		
//		try {// 슬립은 항상 트라이 캐치 하도록 되어있음.
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		// 스레드 처리는 병렬처리의 증거. 동시처리가 된다는 것. 순서패턴이없다.
//		t1.start();/ 메인스레드는 일꾼 보내고 그냥 자기할일 함. 순서는 스케쥴러에 의해서 알아서 실행.
//		t2.start();
//		t3.start();
		
		t1.run();// 여기서 걸려서 못빠져나옴. t2, t3런이 실행되지않음.
		t2.run();
		t3.run();
		
		
	}
}
