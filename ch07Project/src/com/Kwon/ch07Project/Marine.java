package com.Kwon.ch07Project;

//��Ŭ���� SuperClass�� �߻�Ŭ������ ����¡�ؼ� ����� �ڵ����� ��Ͼ��� �ڵ尡 ���� �߻�޼��尡 ������ 
public class Marine extends Unit {
	//�߻�Ŭ������ ����� Ŭ������ �߻�Ŭ������ ��� �߻�޼��带 ����(������)�ؾ��Ѵ�.
	//���� �ϳ��� ���ϸ� �����̰� �߻�Ŭ������ ����ؾ���
	//������ ���� �߻�޼��� ������ �����Ȱ����� ó��

	@Override//���� Ŭ������ ������ ������
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y = "+ y + "]");
	}
	void stimPack() {System.out.println("������ ���");}

	
}
