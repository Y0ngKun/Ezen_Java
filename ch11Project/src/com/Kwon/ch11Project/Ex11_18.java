package com.Kwon.ch11Project;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11_18 {
	public static void main(String[] args) {
		
		//key�� ����� �迭
		//�ߺ� ���� ���� key�� value�� 1�� �ߺ��Ǹ� value�� 1����
		String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};
		
		HashMap map = new HashMap();
		
		for (int i = 0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				int value = (int)map.get(data[i]);
				map.put(data[i], value + 1);
			}//if;
			else {map.put(data[i], 1);}//else;
		}//for;
		
		Iterator it = map.entrySet().iterator();
		//map.entrySet()��  Set�� ��ȯ�ϰ� Set�� iterator()�� it����
		
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int)entry.getValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}//while;
		
	}//main method;
	
	public static String printBar(char ch, int value) {
	
		char[] bar = new char[value];
		
		for (int i = 0; i < bar.length; i++) 
			bar[i] = ch;
			
		return new String(bar); //String (char[] chArr)
	}//printBar;
	
}//main class;
