package com.kwon.ch16Project;

import java.net.InetAddress;

public class Ex16_01 {

	public static void main(String[] args) {
		
		try {
			InetAddress ip = null;
			InetAddress[] ipArr = null;
			ip = InetAddress.getByName("www.google.com");
			//host�̸�(������ �̸�)���� InetAddress��ü�� ��ȯ�Ѵ� 
			
			System.out.println("getHostName() = "+ip.getHostName());
			//host�̸� (������ �̸� www.google.com)
			System.out.println("getHostAddress() = "+ip.getHostAddress());
			//�ش� InetAddress��ü�� ���� �ּ� (172.217.161.196)
			System.out.println("toString() = "+ip.toString());
			//InetAddressŬ������ toString()�޼��带 ���� �س���.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
