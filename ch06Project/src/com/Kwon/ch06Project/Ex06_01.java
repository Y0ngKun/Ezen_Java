package com.Kwon.ch06Project;

public class Ex06_01 {

	public static void main(String[] args) {
		
		//Ŭ����(����� �ν���Ʈ���� ���� ��)�� ����Ϸ��� ��ü�� ����������
		Tv t = 	null; //method ���� ���� �̹Ƿ� ���ú����̰� �⺻���� ����
		System.out.println(t); //t���� �������̹Ƿ� �ּҰ���.
		t = new Tv();//��ü���� (�ν���Ʈ),t�� �ּҰ� �־���	

		Tv t1 = new Tv();//t1 ��ü �����ϰ� �ּҰ� �־���
		System.out.println(t1);
		
		t.channel = 6;
		t1.channel = 7;
		
		
		t.channelDown();
		t.channelUp();
		
		System.out.println(t.channel);
		System.out.println(t1.channel);
		
		
	}

}//public Class

class Tv{
	//class�� ��� ������ ��� method�� �����ȴ� (Ư�� method�� �����ڸ� ����)
	//����� �ν��Ͻ����� static��(Ŭ������)���� ���еȴ�.
	//�ν��Ͻ����� ��ü�� �����ؼ� ����ϰ� 
	//class ���� ��ü�� �������ϰ� class �̸����� ���
	//�ν��Ͻ����� String str; str.charAt(3);
	//class���� Math.random()
	
	//��� ������ ��� ��������(�⺻��,������ ���)
	//��������� ���� ����
	//��� ������ ���ú����� �޸� �⺻���� ���´�.
	
	//�⺻��---
	//������ �⺻���� 0, 0.0;
	//char�� ' '; (����);
	//boolean�� false;
	
	//������---
	//�������� null
	
	String color;
	boolean power;
	int channel;
	
	//��� method
	void power() {
		power = !power; // ! = ������������, �ݴ밪���� ����
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		++channel;
	}
	/*Ư���޼����� �����ڴ� ��������� ������ �ڹ������Ϸ��� ���� �����ڸ� �߰�
	 * public tv(){
	    super();
	 */
}