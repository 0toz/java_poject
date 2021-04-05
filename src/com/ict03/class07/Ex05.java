package com.ict03.class07;

public class Ex05 {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		System.out.println();
		
		Car car = new Taxi();
		car.run();
		Car car2 = new Car() {
			
			@Override
			void run() {
				System.out.println("������ �޸���.");
			}
		}; // �����ݷ� �ִ°���.
		car2.run();
	}
}

abstract class Car{
	abstract void run();
	
}
class Bus extends Car{
	@Override
	void run() {
		System.out.println("80���� �޸���.");
	}
}

class Taxi extends Car{
	@Override
	void run() {
		System.out.println("160���� �޸���.");
		
	}
}
	


