package com.Kwon.ch07Project;

//ĸ��ȭ�� ���� Ŭ����
public class TimeDTO {
	//ĸ��ȭ�� ���ؼ��� �ٸ� ��������� �ٷ� ������ �Ұ����� private
	//������� ������ getter�� setter�޼��带 ���ؼ� ��
	//private ���������ڴ� �ڱ� Ŭ������������ ����
	private int hour;
	private int minute;
	private int second;
	
	
	//��Ŭ���� ���� getter, setter, ������ ������ֱ� Ȱ��
	//��� Ŭ������ �̸��� �����ؼ� ��Ŭ���ϰ�
	
	
	//source->generate constructor using superclass
	//�⺻ ������
	public TimeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//source->generate constructor using fields
	//��� ��������� ����ϴ� ������
	public TimeDTO(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//source->generate getters and setters
	//�� ��������� ���� get�޼����, set�޼���
	//get�޼���� ��������� ��ȯ
	//set�޼���� ��������� ����
	//�̸��� get���������,set���������(��������� ù�ڸ� �빮�ڷ� ���)
	//get�޼���� ���ϰ��� �ش� ����������� ��ȯ(�������� ��������� ��������)
	//set�޼���� return���������� void,�Ķ���ʹ� ������ ����������� ���)
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
}
