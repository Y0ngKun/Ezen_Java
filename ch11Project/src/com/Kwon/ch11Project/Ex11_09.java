package com.Kwon.ch11Project;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_09 {
	public static void main(String[] args) {
		Integer i1 = 1;
		Object[] objArr = {"1",i1,"2","2","3","3","4","4","4"};
		//���ڿ����� Integer��ü�� ���ҷ� ���ǹǷ� ���������� Object
		Set set = new HashSet();
		for (int i = 0; i < objArr.length; i++) {
			set.add((objArr)[i]);
			//1�� Integer i1 = 1�� �ٸ� �ɷ� ó��
		}
		System.out.println(set);
		//Set�� Object�� toString�� �������̵� ��
		
		//HashSet�� ����� ��ҵ��� �����(Interator���)
		
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
}
