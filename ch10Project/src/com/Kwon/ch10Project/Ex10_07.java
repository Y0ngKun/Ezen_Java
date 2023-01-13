package com.Kwon.ch10Project;

import java.text.DecimalFormat;

public class Ex10_07 {

	public static void main(String[] args) {
		
		//���ڿ��� ���ڷ� DecimalFormat���� ���� ���� �������� ��ȯ(parse �޼��� ���) 
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df.parse("1,234,567.89");//wrapperŬ������ ���� Ŭ�������� ����
			System.out.print("1,234,567.89" + " -> ");
			//double d = num.doubleValue(); // num�� �����������̹Ƿ� �⺻������ �ٲ�
			double d = (double)num;
			System.out.print(d + " -> ");
			System.out.println(df2.format(num));
		}
		catch(Exception e){e.getMessage();}
		
	}//main method;

}//main class;
