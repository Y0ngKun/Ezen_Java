package com.Kwon.ch07Project;

public class Point {
	int x,y;
	
	
	//�����ڴ� Ŭ�������̶� �Ȱ��� �ؾ��ϰ�,����Ÿ���� ����.
	//�����ڰ� �ϳ� ��������� ��������� �⺻�� �����ڴ� ������
	//public�� ���������ϳ� Ÿ Ŭ�������� ������ �����ؾ��ϹǷ� �ǰ�������� �ٿ��ش�.
	public Point (int x, int y){
		
		//����Ŭ������ Object�� ������ super();
		//super(); --> super()�� �����ص� �����Ͻ� �ڵ������Ѵ�.
		this.x = x;
		this.y = y;
		
	}
}
