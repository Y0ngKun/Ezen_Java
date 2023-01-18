package com.Kwon.ch11Project;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex11_17 {
	public static void main(String[] args) {
		//Map �޼��� ���
		HashMap map = new HashMap();
		
		//put(Ű,��)
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 100); //���� ����
		map.put("���ڹ�", 100);
		map.put("���ڹ�", 80);
		map.put("���ڹ�", 90);
		
		//Map Collection �������̽��� ������� �ʾ� ���ҿ� �����ϴ� iterator()�� ������
		//Set���� ��ȯ�� Set���� Iterator�� ����.
		
		
		Set set = map.entrySet(); //map.keySet()�� Set��ȯ
		System.out.println("entrySet() ��ȯ " + set);
		Set set1 = map.keySet();
		System.out.println("keySet() ��ȯ " + set1);
		
		Iterator it =set.iterator();
		
		while (it.hasNext()) {
			//key�� value�� ��������� ������ �ִ� Ŭ������ HashMap�� ����Ŭ������ Entry��
			//Map��ü�� iterator�� Entry��ü�� ��ȯ (��������� key�� value�� ó��)
			HashMap.Entry e = (HashMap.Entry)it.next();
			System.out.println("�̸� (key) : " + e.getKey());
			System.out.println("���� (value) : " + e.getValue());	
		}//while;
		
//		for (Object str : set) {
//			String key = (String)str;
//			System.out.println(key);
//			System.out.println(map.get(key));//key�� value�� ���� �� get(key)��� 
//		}//������ �ڵ�
		
		set = map.keySet();
		System.out.println("������ ��� " + set);
		
		Collection values = map.values();
		//Collection.values()�� map�� ���Ե� value�� Collection���� ��ȯ
		//�� map���� ���� ������ �ÿ��� map.values()�޼���� Collection ��ü�� ��� ���
		
		
		it = values.iterator();
		
		int total = 0;
		
		while (it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}//while;
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));
		
		
		
		
		
	}//main method;
}//main class;
