package com.Kwon.ch07Project;

public class Point3D2 extends Point2 {
	int z;
	
	public Point3D2(int x,int y,int z) {
		//����Ŭ������ ��������� �⺻ �������� Point2()�� �����Ƿ�
		//�ڵ����� ȣ��Ǵ� super()�� ȣ��Ǿ ���� �߻� ����
		super();

		this.x = x;
		this.y = y;
		this.z = z;
	}

}
