package com.Kwon.ch07Project;

public class Point3D extends Point {
	int z;
	public Point3D(int x,int y,int z) {
		super(x,y);
		//���� Ŭ������ �⺻�����ڰ� �⺻���� �ƴϸ� ��������� ����Ŭ���� �����ڸ� ȣ��
		//Point�� �⺻�� �����ڰ� �����Ƿ� �ڵ� ȣ��Ǵ� super()�� �Ⱦ��� ����
		this.z = z;
		
	}

}
