package com.Kwon.ch10Project;

import java.text.DecimalFormat;

public class Ex10_06 {
	
	public static void main(String[] args) {
		
		double number = 1234567.89;
		
		String[] pattern = { 
				//���� ��ȣ ���� �迭
				//������ ���ϱ�ȣ�� �̿��ؼ� ���ϴ� ������ �ۼ�
				"0", //10������ ǥ�� (�Ҽ��� ����, �ڸ��� ���� ����)
				"#", //10������ ǥ�� (�Ҽ��� ����, �ڸ��� ���� ����)
				"0.0", //�Ҽ��� 1�ڸ� ǥ��
				"#.#", //�Ҽ��� 1�ڸ� ǥ��
				"#,###.##", // ���� ������ , 3�ڸ��� �߶�,���̰� �Ҽ��� 2�ڸ� ǥ�� 
		};
		
		for (int i = 0; i < pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			//DecimalFormat�� ���ڸ� ����ȭ�ؼ� ǥ�����ִ� Class
			//format() �޼���� ���ڰ��� ������ ���� �������� ��ȯ�� ���ڿ��� ��ȯ
			System.out.println("pattern�� : "+ pattern[i] + " / ��ȯ�� : " + df.format(number));
		}
		
	}//main method
}//main class
