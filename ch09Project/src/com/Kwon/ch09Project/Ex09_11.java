package com.Kwon.ch09Project;

public class Ex09_11 {

	public static void main(String[] args) {
		
		//StringBuffer�� Java.lang�� �ִ� �⺻ Ŭ�����̴�.
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		//�������߿� �Ķ���ͷ� ���ڿ��� ����ϴ� ������(���ڿ� + 16���� ���밡�� char[]�迭 ����]
		//StringBuffer sb1 = "abc"; �Ұ��ϴ� StringBuffer�� ���ͷ��� ��ü ���� �Ұ�
		
		//==�� ������������ �ּ� ��
		
		System.out.println("sb == sb2 ? " + (sb==sb2));
		System.out.println("sb.equals(sb2) ? "+sb.equals(sb2));
		
		//StringBuffer�� ������ String���� ��ȯ�Ͽ� equals()�� ��.
		//toString()�� equals()�� �����ǰ� �Ǿ� �־ ���ڿ��� ���, equals()�� �񱳰���
		
		String s = sb.toString();
		String s2 = sb2.toString();
		
		System.out.println("sb == sb2 ? " + (s==s2));//�ּҰ� �񱳰� �Ǽ� false ����
		System.out.println("s.equals(s2) ? "+s.equals(s2));
		
		
		
		StringBuffer k = new StringBuffer(1232132132);
		
		
	}

}
