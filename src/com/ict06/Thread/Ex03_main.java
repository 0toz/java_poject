package com.ict06.Thread;

public class Ex03_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex03 t1 = new Ex03();
		t1.go();
		System.out.println("수고하셨습니다.");
		System.out.println("============");
		
		// 스레드 처리하기위해서 start()를 실했했지만 => start() 메소드를 호출했다.
		//run() 으로 가야 스레드 처리가 된다.
		//Ex03 에 있는 start() 를 주서거리한다.
		//start() => run()로 가게된다.
		// 이것을 스레드 처리했다고 한다.
		System.out.println(Thread.currentThread().getName());
		t1.start(); // 같은 이름부터 찾아감.
		System.out.println("수고하셨습니다.");
		System.out.println("============");
		// start에서 run()으로 갔는데?... 
		// 자바에서 끝냈는데 run()이 돌았다.
//		같은이름으로 간것은 메소드 호출이지만 스타트에서 런으로간것은 스레드 처리
		
	}
}
