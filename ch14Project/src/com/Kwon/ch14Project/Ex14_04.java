package com.Kwon.ch14Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex14_04 {
	public static void main(String[] args) {
		//Collection �����ӿ�ũ�� ���� �ִ�, �Լ��� �������̽� ��� �޼��� ����  
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		//list�� ��� ��Ҹ� ����ϴ� �޼���� ArrayList�� �ִ�
		//forEach() �޼��� ���
		//forEach()�� �Ķ��Ÿ�� Consumer �Լ��� �������̽� ��ü ���
		//void forEach(Consumer<? super Integer> action)
		
		//ArrayList ��� Ȯ���ϱ�
		list.forEach(i -> System.out.print(i + "  ")); System.out.println();
		//forEach�� �Ķ��Ÿ�� ���ٽ��� �ٷ� ���,
		//forEach�� �ڵ����� ���Ұ��� �ݺ� ó��
		//i�� list��ü�� ���Ұ��� ��Ÿ�� ( for (String i : ���) )
		
		//ArrayList ��� �����ϱ�
		list.removeIf(x -> x%2==0 || x%3==0);
		//boolean removeIf(Predicate<E> filter)�� �Լ��� �������̽�
		//Predicate ��ü�� �Ķ��Ÿ�� ���
		System.out.println(list);
		
		//Map Ȱ��
		Map <String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		System.out.println(map);
		
		//map�� void forEach(BiConsumer<K, V> action)
		map.forEach((K, V) -> System.out.print("(" + K + "�� value : " + V + ") ")); System.out.println();
		//map�� forEach���� BiConsumer�� �����ϴ� ���ٽ� ���, map�� ��ҵ��� �ݺ��Ͽ� ó�� 
		//BiConsumer�� �Ķ��Ÿ���� 2��
		
	}//main method;
	
}//main class;
