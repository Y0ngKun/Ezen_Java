package com.Kwon.ch07Project;

public class Ex07GetSet {
	public static void main(String[] args) {
		
		TimeDTO dto = new TimeDTO(12,35,40);
		
		//int hour = dto.getHour(); TimeDTO ����������� ��� ���������ڰ� private�̹Ƿ� ������ �Ұ�
		//������ ���������ڰ� public�� �޼��带 ���ؼ� ����
		//����������� get�޼���� ��� ����(����)�� set�޼���� ���ش�
		System.out.println("hour = "+ dto.getHour());
		System.out.println("minute = " + dto.getMinute());
		System.out.println("second = " + dto.getSecond());
		
		//���� ����ô� �ش� ��������� set�޼��带 ����Ѵ�
		dto.setHour(10);
		dto.setMinute(55);
		dto.setSecond(59);
		System.out.println("hour = "+ dto.getHour());
		System.out.println("minute = " + dto.getMinute());
		System.out.println("second = " + dto.getSecond());
	}
	

}
