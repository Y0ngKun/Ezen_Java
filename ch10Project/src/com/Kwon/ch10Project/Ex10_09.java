package com.Kwon.ch10Project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_09 {

	public static void main(String[] args) {
		//SimpleDateFormat�� format�� parse �޼��� ���
		//format�� date��ü�� ���� ������ ���ڿ��� ��ȯ, parse ���� ������ ���ڿ��� Date�� ǥ��
		DateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		//DateFormat�� �߻�Ŭ������ SimpleDateFormat�� �θ� Ŭ�����̴�.
		
		Date d =null;
		
		try {
			d = df.parse("2019�� 11�� 23��");
			//���� ����("yyyy�� MM�� dd��")�� ���ڿ� ���� Date ��ü�� ��ȯ
			//���ϰ� �ٸ� ���ڿ��� �ָ� ���� �߻�
			//���Ͽ��� ������ ó��		
			System.out.println(df2.format(d));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//���� ������ ���ڿ��� ��ȯ
		String ds = df2.format(d);
		System.out.println(ds);
		
		System.out.println(d);//���� Date������ ���
		
		
		
	}//main method;
}//main class;
