package com.Kwon.ch10Project;

import java.time.ZoneOffset;
import java.util.Calendar;

public class Ex10_01 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		//CalendarŬ������ �߻� Ŭ�����̱� ������ �ν��Ͻ��� ���� �� ����
		//������ Calendar��ü�� ���� �ð��� ��Ÿ���� ��ü
		//���� �ð��� �� ���� ����� ��,��,��,�ð� ���� ���� ��Ҵ� 
		//get(�ð� �����ϴ� ��� �����)
		System.out.println("�� ���� �⵵ : " + today.get(Calendar.YEAR));
		//public static final Calendar.YEAR = 1�� ���ǵ�
		System.out.println("�� ���� �⵵ : " + today.get(Calendar.MONTH));
		//���� 0�� ���� 11���� ��µȴ�
		System.out.println("������ �� ���� ��� ° �� �ΰ���? : "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("������ �̹� ���� ��� ° �� �ΰ���? : "+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("������ ��ĥ �ΰ���? "+today.get(Calendar.DATE));
		System.out.println("������ �̴��� ��ĥ�ΰ���? "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("������ ������ ��ĥ�ΰ���? "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("������ �̹��� ��� ���� ��ĥ°�ΰ���? "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("������ �����ΰ��� ���� �ΰ��� ? 0�� ����, 1�� �����Դϴ� : "+today.get(Calendar.AM_PM));
		System.out.println("�ð� (0~11) : "+today.get(Calendar.HOUR));
		System.out.println("�ð� (0~24) : "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("�� (0~59) : "+today.get(Calendar.MINUTE));
		System.out.println("�� (0~59) : "+today.get(Calendar.SECOND));
		System.out.println("�и������� 100���� 1�� (0~999) : "+today.get(Calendar.MILLISECOND));	
		
		
		System.out.println("TimeZone(-12~+12) : " + (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		//TimeZone�� ����ǥ�ؽ�(UTC)�� �������� �����ð��� ��ð� �ʳ� �����ĸ� ��Ÿ��
		//UTC���� ���̰� �и�������� ���ͼ� 
		//�ʷ� ȯ��� 1000���� ������
		//�ʴ� �ٽ� 1���� ȯ���ϱ� ���� 60���� ������
		//�ٽ� 1�ð��� 60���� ������ ���� 1000*60*60
		
		System.out.println("�� ���� ������ �� : " + today.getActualMaximum(Calendar.DATE));
		
		
		
	}//main method;

}//main class;
