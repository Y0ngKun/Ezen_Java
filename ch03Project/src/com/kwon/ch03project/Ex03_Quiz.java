package com.kwon.ch03project;

import javax.management.remote.SubjectDelegationPermission;

public class Ex03_Quiz {

	public static void main(String[] args) {
		int x =10;
		int y =5;
		System.out.println(x==y);
		System.out.println(x!=y);
		String str1 ="abcde";
		System.out.println(str1==null);
		System.out.println(str1=="xyz");
		System.out.println(str1.equals("xyz"));
		
		String str2 = new String("abcde"); 
		/* str1�� str2�� ���� ������ �ּҰ��ٸ�
		 * ���������� String�� ���� ������ �ּҰ� ����ȴ�
		 * 
		 */
		System.out.println(str1==str2); //������ �񱳽� �ּҰ� �񱳵�
		System.out.println(str1.equals(str2));
		
		String str3 = "abcde";
		System.out.println(str1==str3);
		//���ͷ��� ���� String ��ü�� ���� ������ �ּҰ� ����
		//��ҹ��� �����ϰ� ���� �񱳴� equlsIgnorecase(str)
		
		
		
	
	}
}
