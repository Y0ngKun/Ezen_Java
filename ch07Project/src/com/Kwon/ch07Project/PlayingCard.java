package com.Kwon.ch07Project;

public interface PlayingCard {
	//�������̽��� ����� �߻�޼���θ� ���� �� �ִ�
	public static final int SPADE = 4;
	//�������̽� �ȿ� ����� public static final�� �����ϰų� �Ϻ� ���������ϴ�
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;
	
	//�������̽����� �߻�޼���� ���������ڰ� public�̾���� (�߻�class�� �ƴϾ ��)
	//�߻�޼���� {}������ �����ؾ���
	public abstract String getCardNumber();
	//�������̽� �ȿ����� public abstract�� ������ �����ϴ�
	String getCardKind();
	
}
