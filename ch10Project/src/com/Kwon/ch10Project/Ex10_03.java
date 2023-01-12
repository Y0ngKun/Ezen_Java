package com.Kwon.ch10Project;

import java.util.Calendar;
import java.util.Iterator;

public class Ex10_03 {

	public static void main(String[] args) {
		//Calendar�� �ð� ���� set �޼��� ����
		final int [] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"�ð� ","�� ","�� "};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		//set�޼��忡�� ����Ͻð����ʸ� �Բ� �Ķ��Ÿ�� ����ϴ� �޼���� ����
		//�ð� �� �ʸ� ó�����ִ� �޼���� ����
		time1.set(Calendar.HOUR_OF_DAY, 10);
		//24�ð� ���� �ð��� 10�÷� ����
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20);
		//24�ð� ���� 20�÷� ����
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1 : "+ time1.get(Calendar.HOUR_OF_DAY) + "�� " + time1.get(Calendar.MINUTE) + "�� "
				+time1.get(Calendar.SECOND)+"��");
		
		System.out.println("time2 : "+ time2.get(Calendar.HOUR_OF_DAY) + "�� " + time2.get(Calendar.MINUTE) + "�� "
				+time2.get(Calendar.SECOND)+"��");
		
		//�� �ð��� ����
		//getTimeInMillis()�� ��� �� ���ϵ� ��¥(1970.1.1 0�� ����)
		//�� �������� �ϱ⶧���� ���� ���� �߿��ϴ�
		long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis())/1000;
		System.out.println("time1�� time2�� ���̴� " + difference + "�� �Դϴ�.");
		//System.currentTimeMillis()�� getTimeInMillis()�� ���� posix��ȯ (���� �ð��� ó��)
		String tmp = "";
		for (int i = 0; i < TIME_UNIT_NAME.length; i++) {
			tmp += difference / TIME_UNIT[i] + TIME_UNIT_NAME[i];
			//difference�� i�� 0�Ͻ� 3600���� difference������ �ð�(����)�� ������ �ڿ��� �ð��� ����
			difference %= TIME_UNIT[i];
			//3600���� ���� ������(�� �ð��� ���Ե��� �ʴ� ��)
		}
		
		System.out.println("�ú��ʷ� ��ȯ�ϸ� " + tmp + "�Դϴ�.");
		

	}//main method;

}//main class;
