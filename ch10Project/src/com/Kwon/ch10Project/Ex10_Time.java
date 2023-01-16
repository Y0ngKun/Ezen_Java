package com.Kwon.ch10Project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Ex10_Time {
	public static void main(String[] args) {
		//�ڹ� 1.8���� �߰��� time��Ű���� Ŭ������
		LocalDate myObj = LocalDate.now();
		//���� ��¥(��,��,��)�� ��Ÿ���� ��ü
		
		System.out.println(myObj); //2023-01-16
		//LocalDateŬ������ Object���� ����� 
		//toString()�� yyyy-MM-dd�� �������� ������ �س���.
		//toString()�� ������ ���� ���ٸ� �ּҰ��� ������ ��
		
		LocalTime myObj1 = LocalTime.now(); 
		//���� �ð��� ��Ÿ���� ��ü����
		
		System.out.println(myObj1);
		//LocalTImeŬ������ Object���� ����� 
		//toString()�� (HH-mm-ss-ns) 10����� 1�ʱ��� �������� ������ �س���.
		//toString()�� ������ ���� ���ٸ� �ּҰ��� ������ ��
		
		LocalDateTime myDateObj = LocalDateTime.now();
		//��¥ + �ð� ǥ�� ��ü
		
		System.out.println("Before fomatting"+myDateObj);
		//LocalDateTimeŬ������ Object���� ����� 
		//toString()�� (2023-01-16T09:42:25.296488300) 
		//(yyyy-MM-dd) + T + (HH-mm-ss-ns) 10����� 1�ʱ��� �������� ������ �س���.
		//toString()�� ������ ���� ���ٸ� �ּҰ��� ������ ��
		
		DateTimeFormatter myFomatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println();
		String formattedDate = myDateObj.format(myFomatObj);
		System.out.println(myDateObj);
		
		
		
		
		
		
	}//main method;
}//main class;
