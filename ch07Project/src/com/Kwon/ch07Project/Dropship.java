package com.Kwon.ch07Project;

public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Dropship[x="+x+",y"+"]");
	}
	void load() {
		//���߿� �ۼ��Ͻÿ�
		//�� �����ε� �ϼ��� �޼���� ����
	}
	void unload() {
		System.out.println("ȭ���� �����ϴ�");
	} 
	
}


