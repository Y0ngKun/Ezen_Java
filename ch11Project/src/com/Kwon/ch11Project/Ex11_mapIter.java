package com.Kwon.ch11Project;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_mapIter {
	public static void main(String[] args) {
		//Map�� Collection�������̽��� �������� ���� �����ͱ׷� ó�� �������̽�
		//Map��ü�� iterator()�޼��尡 ���� �ٷ� ��� �� �� ����.
		//Collection�������̽��� ����� Set�迭�� ��ȯ�ϴ� �޼��带 �̿��ؼ� ��ȯ �� ���
		
		Map map = new HashMap();
		
		map.put("age", 50);
		map.put("name", "kim");
	
		Set kset = map.keySet();
		Set vset = map.entrySet();
		
		Iterator it = vset.iterator();
		Iterator it2 = kset.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
	}//main method;
}//main class;
