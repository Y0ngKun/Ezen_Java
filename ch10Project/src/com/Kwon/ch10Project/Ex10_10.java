package com.Kwon.ch10Project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10_10 {

	public static void main(String[] args) {
		
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("��¥�� " + pattern + "�� ���·� �Է����ּ���"+ "(�Է� ��: 2019/12//31)" );
		
		
		//Scanner.hasNextLine()�� �� ó���� ��� ������ ����
		while (s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine());//�Է´��
				//���� ���� ���� (String pattern = "yyyy/MM/dd")�� �ƴϸ� Date��ü�� ��ȯ �Ұ�
				
				break;
				//���� �߻��ϸ� catch�� ���� �ƴϸ� break;
			}
			catch(Exception e) {
//				e.printStackTrace();
				System.out.println("��¥�� " + pattern + "�� ���·� �ٽ� �Է����ּ���" + "(�Է� �� : 2019/12/31");
				
			}
		}//while
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis())/(60*60*1000);
		System.out.println("�Է��Ͻ� ��¥�� �����" + day +" �ð����̰� �ֽ��ϴ�");

	}

}
