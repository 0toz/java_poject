package com.ict08.network;

import java.net.InetAddress;

public class Ex01 {
	public static void main(String[] args) {
	
		try {
			InetAddress addr = InetAddress.getByName("www.naver.com");
			System.out.println("이름 : " + addr.getHostName() );
			System.out.println("주소 : " + addr.getHostAddress() );
			System.out.println("toString : " + addr.toString() );
			System.out.println("==================");

			//내컴퓨터에 관한 정보.
			addr = InetAddress.getLocalHost();
			System.out.println("이름 : " + addr.getHostName() );
			System.out.println("주소 : " + addr.getHostAddress() );
			System.out.println("toString : " + addr.toString() );
			System.out.println("==================");
			
			InetAddress[] addrs = InetAddress.getAllByName("m.daum.net");
			for (InetAddress k : addrs) {
				System.out.println("이름 : " + k.getHostName() );
				System.out.println("주소 : " + k.getHostAddress() );
				System.out.println("toString : " + k.toString() );
				System.out.println("==================");	
				}
			byte[] b = {125,(byte)209, (byte)222, (byte)137};
			addr = InetAddress.getByAddress(b);
			System.out.println("이름 : " + addr.getHostName() );
			System.out.println("주소 : " + addr.getHostAddress() );
			System.out.println("toString : " + addr.toString() );
			System.out.println("==================");

			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
