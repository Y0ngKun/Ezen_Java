package com.Kwon.ch12Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex12Quiz {
	public static void main(String[] args) {
		
		Level myVar = Level.MEDIUM;
		
		System.out.println(myVar);
		
		switch (myVar) {
		case LOW : //case���� ��� �̸��� ��� ���� 
			System.out.println("LOW");
		break;
		case MEDIUM: 
			System.out.println("MEDIUM");
		break;
		case HIGH : 
			System.out.println("HIGH");
		break;
		
		default:
			break;
		}
		
		Level[] s = Level.values();
		
		for(Level ss : s) {
			System.out.println(ss.ordinal());
		}

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("k1");
		cars.add("k2");
		
		LinkedList<String> cars1 = new LinkedList<String>();
		cars1.add("k3");
		cars1.add("k4");
		cars1.addFirst("sonata");
		cars1.addLast("santafe");
		System.out.println("cars1�� ù��°�� ������ ��� : "+cars1.getFirst()+", "+cars1.getLast());
		
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		people.put("na", 99);
		people.put("me", 100);
		
		for(String aa : people.keySet()) {
			System.out.println("people : " + aa +" value : " + people.get(aa) );
		}
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(4);
		numbers.add(7);
		
	
		for(int i = 1; i <= 10; i++) {
			if(numbers.contains(i))  {
				System.out.println("*������ �ִ� ��: "+ i);
			}
			else {
				System.out.println("������ ���� ��: " + i);
			}
		}//10��;
		
		Iterator<String> it = cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}//main method;
	
}//main class;
enum Level {LOW,MEDIUM,HIGH}

/* 1.������ level�� ����� ���� ����� LOW,MEDIUM,HIGH�� �Ѵ�
 * 2.main�޼��� �ȿ��� level��ü myVar�� ����� ���� MEDIUM�� �����Ѵ�
 * 3.myVar��ü�� ����Ʈ �Ѵ�
 * 4.myVar��ü�� �Ķ���ͷ� �ϴ� switch���� �����
 *   �� case���� LOW,MEDIUM,HIGH�� ���
 * 5.enhanced for���� �̿��Ͽ� enum Level�� �� ��� ���� ����غ���
 * 6.����Ÿ�� �Ķ��Ÿ�� String�� ArrayList��ü cars�� ���� ���� 2�� ���� �߰��غ���.
 * 7.���� �Ķ��Ÿ�� String�� LinkedList��ü cars1�� ���� ���� 2�� ���� �߰��غ���.
 *   cars1�� ù��° ��ҷ� sonata�� �߰��� �� ������ ��ҷ� santafe�� �߰��Ѵ�
 *   cars1�� ù��°�� ������ ��Ҹ� ���غ���
 * 8.����Ÿ�� �Ķ��Ÿ�� String�� Integer�� HashMap��ü people�� ����� 2�� ���� �߰��غ���(�̸�,����)
 * 9.enhanced for���� �̿��� key�� Set�� ���� ���� key�� ���� ���ؼ� ��� �غ���.
 *10.����Ÿ�� �Ķ��Ÿ�� Integer�� HashSet��ü numbers�� ����� 2�� ���� �߰��Ѵ�(4�� 7)
 *   for���� �ݺ��� i�� 1���� 10���� �ݺ��ϸ鼭 numbers�� i���� ������ ������ ������ ���� + i�� ����ϰ�
 *   ������ �Ȱ����� ���� + i�� ���
 *11. 6���� cars��ü�� �̿��� Interator��ü it�� ����� ����Ÿ�Ժ����� �̿��Ͽ� �����
 *    it�� �̿��� cars�� ��ҵ��� ��� �غ���
 */

