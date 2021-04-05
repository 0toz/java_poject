package com.ict03.class07;

interface Remote {
	void on();
	void off();
}

public class Ex07 {
	public static void main(String[] args) {
		Radio radio = new Radio();
		radio.machineWork(new Remote() {
			@Override
			public void on() {
				System.out.println("radio ²ô±â");
			}
			@Override
			public void off() {
				// TODO Auto-generated method stub
				
			}
		});
	}

}

class Radio {
//	public void radioWork() {
//		Remote radio = new Remote() {
//			@Override
//			public void on() {
//			}
//		};
//		
//		radio.on();
//		
//	}
	public void machineWork(Remote remte) {
		remte.on();
		remte.off();
	}
}