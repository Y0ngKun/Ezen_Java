package com.Kwon.ch09Project;

public class Ex09_06 {

	public static void main(String[] args) {
	
		String str1 = "abc";
		String str2 = "abc";
		//String ��ü�� ���ͷ��� ����� ���ͷ� ���� ���� Ŭ���� �޸𸮿� ����Ǿ�
		//���ͷ� ���� ��� �� �� ���� ���Ͽ� ���� ���� ������ ���� ���� ���(�ּҰ� ����)
		
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		//"String str1 = "abc";"�ε� "�ȿ� �ٸ� ����ǥ�� �ִ� ���� �����Ǿ�
		//escapee sequence���� \�� �տ� �ٿ� ���
		
		System.out.println("str1 == str2 ? " + (str1 == str2));
		//==�����ڴ� �ּ� ��
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		//String�� equals�� �ڹٿ��� �̹� ���� ���ϵ��� ������
		System.out.println();
			
		String str3 = new String("abc");
		String str4 = new String("abc");
		//new�����ڷ� String�� ���� �����ϸ� ������ ���ο� �ν��Ͻ��� ���� ��
		//���� �����ϱ⿡ ��������(�ּ�)�� �� �ٸ���
		
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		
		System.out.println("str3 == str4 ? " + (str3 == str4));
		
		
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
		//String�� ���� ���ϵ��� �̸� ���ǵ� equals() ���
		

	}

}
