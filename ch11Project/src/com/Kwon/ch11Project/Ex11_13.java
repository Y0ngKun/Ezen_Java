package com.Kwon.ch11Project;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {
	public static void main(String[] args) {
		//TreeSet
		Set set = new TreeSet();
		
		for (int i = 0; set.size() < 6; i++) {
			//�ߺ������ʴ� ��(Set) 6���� set�� �־���
			int num = (int)((Math.random()*45)+1);
			set.add(num);
		}
		//Treeset�� ���ĵǾ� ó���ǹǷ� sort���� �ʾƵ� ������������ ���ĵǾ��ִ�
		System.out.println(set);
		
	}//main method;
}//main class;
