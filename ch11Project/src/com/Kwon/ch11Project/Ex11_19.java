package com.Kwon.ch11Project;

import java.util.*;
import static java.util.Collections.*;
//static ������ �ٷ� ���� �Ұ�
//CollectionŬ������ ��� static ����� Collections.���� ���

public class Ex11_19 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("List ��ü list ���� : "+list);
		
		addAll(list,1,2,3,4,5);
		//import static�� ���༭ collection ���� ����
		//<Integer>boolean addAll(Collection<> super Integer> c, Integer... elements)
		//addAll �޼���� ��ȯ�� �Ҹ����̰� c �÷��ǰ�ü(��Ұ� Integer�� ���� Ŭ������ ���� Collection)
		//���� Integer�� �Ķ���ͷ� ����
		
		System.out.println("addAll list : "+list);
		
		rotate(list, 2);
		//list�� ������Ҹ� �ڷ� 2ĭ�� �о ȸ��, -2����
		System.out.println("rotate list : "+list);
		
		swap(list, 0, 2);
		//���ι�ȣ 0���� 2���� ��ġ�� ���� �ٲ۴�
		System.out.println("swap list : "+list);
		
		shuffle(list); 
		//����� ����� ��ġ�� ���Ƿ� ����
		System.out.println("shuffle list : "+list);
		
		sort(list);
		//�������� ����
		System.out.println("sort(list) : "+list);
		
		sort(list, reverseOrder());
		//���� ���� (���� ����) , reverse(list)�� �����ϴ�
		System.out.println("sort (list.reverseOrder) : "+list);
		
		int idx = binarySearch(list, 3);
		//3�� ����� ��ġ (index)�� ��ȯ, ���� �� ����ؾ���
		System.out.println("index of 3, by binarySearch : "+idx);
		
		System.out.println("max(list) : "+ max(list));
		//Collections.max(list)
		System.out.println("min(list) : "+ min(list));
		//Collections.min(list)
		System.out.println("min(list), (max �� reverseOrder()) : "+ max(list, reverseOrder()));
		
		fill(list, 9);
		//list�� 9�� ä���
		System.out.println("fill (list,9) : " + list);
		
		List newList = nCopies(list.size(), 2);
		//nCopies ���� Collections�� �ִ� �޼ҵ��̴�.
		System.out.println("newList = nCopies(list.size(), 2) : "+ newList);
		
		System.out.println("disjoint (list , newList) : "+disjoint(list, newList));
		//disjoint (�񱳴��, �񱳴��)�� ����� ��Ұ� �ϳ��� ������ true, ������ false;
		
		copy(list, newList);
		//newList(����)���� List(����)�� �����ؼ� �����
		System.out.println("copy(list, newList) �� newList : "+newList);
		System.out.println("copy(list, newList) �� list : "+ list);
		
		replaceAll(list, 2, 1);
		//list���� 2�� 1�� ��ü�Ѵ�
		System.out.println("replaceAll(list, 2, 1) : " + list);
		
		Enumeration e = enumeration(list);
		//Enumeration�� iterator�� ������
		//list��ü�� �ݺ� ���� ������ Enumeration���� ��ȯ
		ArrayList list2 = list(e);
		System.out.println("Enumeration��ü ���� �� ArrayList list2 = list(e) "+list2);

	}//main method;
	
}//main class;
