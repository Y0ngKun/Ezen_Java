package com.kwon.ch16Project;

import java.net.InetAddress;

public class Ex16_01 {

	public static void main(String[] args) {
		
		try {
			InetAddress ip = null;
			InetAddress[] ipArr = null;
			ip = InetAddress.getByName("www.google.com");
			//host이름(도메인 이름)으로 InetAddress객체를 반환한다 
			
			System.out.println("getHostName() = "+ip.getHostName());
			//host이름 (도메인 이름 www.google.com)
			System.out.println("getHostAddress() = "+ip.getHostAddress());
			//해당 InetAddress객체의 숫자 주소 (172.217.161.196)
			System.out.println("toString() = "+ip.toString());
			//InetAddress클래스에 toString()메서드를 정의 해놨다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
