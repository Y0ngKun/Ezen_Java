package com.Kwon.ch07Project;

public interface InterfaceInherit extends Moveable,Attackable {
	//Ŭ�������� ����� 1���� ���������� �������̽��� ���� ����� �����ϴ�
	//����� �߻� �޼��� 2���� ���� �������̽�
}

interface Moveable{
	//interface ���δϱ� 
	/*public abstract�� �����Ǿ�����*/void move(int x, int y);
	
	
}
interface Attackable{
	void attack();
}