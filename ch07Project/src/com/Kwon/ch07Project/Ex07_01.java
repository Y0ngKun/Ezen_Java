package com.Kwon.ch07Project;

public class Ex07_01 {
	public static void main(String[] args) {
	
	SmartTv stv = new SmartTv();
	
	stv.channel = 10; //channel�� Tv Ŭ�����κ��� ��ӹ��� �������
	stv.channelUp(); //��ӹ��� �޼���
	stv.channelDown();
	stv.channelDown();
	stv.channelUp();
	stv.channelUp();
	
	System.out.println(stv.channel);
	stv.displayCaption("Hello, World"); //�ڽ�(�ڽ� Ŭ����)�� ���� �޼��� ������ Tv Ŭ�������� ����
	stv.caption = true;//�ڽ�(�ڽ� Ŭ����)�� ���� �޼��� ������ Tv Ŭ�������� ����
	stv.displayCaption("Hello, World");
	
	
	}//main method;
}//main class;
