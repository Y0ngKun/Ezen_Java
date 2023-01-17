package com.Kwon.ch11Project;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {
	public static void main(String[] args) {
		
		//�ζ� ��÷ ��ȣ ����� �ߺ��� ��ȣ�� ���ϱ� ���� Set ���
		Set set = new HashSet();
		
		for (int i = 0; set.size() < 6 ; i++) {
			//�ݺ� �������� set�� �߰��Ǵ� ���� ������ ���
			//�ζ� ���� ��ȣ�� 6�� �̹Ƿ� i = 0���� ����, set.size() < 6
		
			int num = (int)((Math.random())*45) + 1 ;
			//+1�� ���ϸ� 0~44���� ������
			//+1�� �ϸ� 1~45���� ���´�
			
			set.add(new Integer(num));
			
		}//for;
		
		List list = new LinkedList(set);
//		/LinkedList�� �Ķ��Ÿ���� Collection�̸� ��� ����
		
		//�迭�̸� Arrays.sort(�迭)�� �����ϳ� Set�� �迭�� �ƴ�
		Collections.sort(list);
		//sort(list ��ü)�� ���
		
		System.out.println(list);
	
	
	
	
	
	}//main method;
}//main class;
