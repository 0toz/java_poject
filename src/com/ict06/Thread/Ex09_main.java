package com.ict06.Thread;

public class Ex09_main {
	public static void main(String[] args) {
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();

	//Runnable 인터페이스는 run()만 가지고 있다. start()메소드가 없다.
		
		//t1.start();
		//기본생성자를 쓰면 실행할 run 메소드를 가진 클래스가 어딘지 모르니 타겟을 가진 생성자를 써야한다.
		Thread thread1 = new Thread(t1); // 스레드 이름이 있으므로 다시호출가능
		thread1.start();
		//다른 방식.
		new Thread(t2).start(); // 스레드 이름 없이 호출했으므로 다시 호출불가능.
		
		Thread thread3 = new Thread(t3); // 스레드 이름이 있으므로 다시호출가능
		thread3.start();
	
		
		//안드로이드에서 많이 쓰는 방법. (익명내부클래스.)
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + " : " + "mmmmm");
				}
			}
		}).start();; 
	}
}
