package com.kwon.ch03project;

public class Ex03_17 {
	public static void main(String[] args) {
		
		int  x,y,z;
		int  absX ,absY, absZ;
		char signX,signY,signZ;
		
		//���� �ʱ�ȭ
		 x = 10;
		 y = -5;
		 z = 0;
		 
		 /*���� �����ڴ� ���� �����ڶ� �ϱ⵵ �ϰ�
		  * ���ǽ� 
		  * ? true �� �� �� 
		  * : false �� �� ��
		  */
		 
		 absX = x >= 0 ? x : -x; //���밪 ���ϱ�
		 absY = y >= 0 ? y : -y;
		 absZ = z >= 0 ? z : -z;
		 //���� �����ڴ� ���ο� ���׿����ڸ� ����� �� �ִ�(��ø ���)
		 
		 signX = x > 0 ? '+' : (x==0 ? ' ' : '-');
		 //��ȣ ���ϱ�� 0���� ũ�� '+', 
		 //�ι�°�� �ٽ� �� �� ���׿����ڸ� �̿��Ͽ� 0�� ���� ������ ���� �и� 
		 signY = x > 0 ? '+' : (y==0 ? ' ' : '-');
		 signZ = x > 0 ? '+' : (z==0 ? ' ' : '-');
		 
		 System.out.printf("x=%c%d%n", signX, absX);
		 System.out.printf("y=%c%d%n", signY, absY);
		 System.out.printf("z=%c%d%n", signZ, absZ);
		 
		 //���� �����ڴ� if  ~ else������ �����Ͽ� ���� ����Ѵ�.
		 if (x >= 0) {
			 absX = x;
		 }
		 else {
			 absX = -x;
		 }
		 
		 
		 
		
	}

}
