package com.Kwon.ch07Project;

public class SmartTv extends Tv {
	//Tv Ŭ������ ���
	//Tv Ŭ������ ��������� ����޼��带 ���(�����ڳ� �ʱ�ȭ ����� ��� �� ��)
	//������� power,channel�� ����޼��� power(),channelUp(),channelDown()�� ���
	//��ӵ� �� �ܿ� �߰� �� �͸� �ۼ�
	boolean caption;
	void displayCaption(String text) {
		if (caption) { //caption ���°� on(true)�� ���� text�� �����ش�.
			System.out.println(text);
		}
	}

}
