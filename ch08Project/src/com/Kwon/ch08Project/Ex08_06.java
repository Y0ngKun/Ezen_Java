package com.Kwon.ch08Project;

public class Ex08_06 {

	public static void main(String[] args) {
		
		try {
			//���Ƿ� �߻���ų ���� ��ü ����
			Exception e = new Exception("���� �߻� ����");
			//���� ��ü ������ �޼����� �־(String) ��ü�� ����
			throw e;//���� ��ü�� catch������� �����ش�,���� ������ ���� catch��� ����
		}
		catch(Exception e) {
			System.out.println("���� �޼��� : " +e.getMessage());
			e.printStackTrace();
		}
		System.out.println("try-catch��");
	}

}
