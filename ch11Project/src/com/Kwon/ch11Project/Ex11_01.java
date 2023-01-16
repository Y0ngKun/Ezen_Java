package com.Kwon.ch11Project;

import java.util.*;

public class Ex11_01 {
	public static void main(String[] args) {
		//ArrayList��ü�� �����ڸ� �̿�
//		ArrayList list1 = new ArrayList(10);
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		//10�� �ʱ� �뷮
		//ArrayListŬ������ ���׸� Ŭ������ ��� ���ϸ� ���� Ÿ��
		//ArrayList<Integer> = new ArrayList<Integer>(10)�� ���� 
		//List�������̽� �迭�� �迭 ������� ���� ����, �ߺ� ���, ���� �޸𸮰� ���ӵǾ� ���
		//ArrayList��ü�� ��� ���� �߰��ÿ��� .add()�� ����
		list1.add(5); // 5�� �⺻���̳� �ڵ� �ڽ̿� ���� Integer�� ��ȯ	
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		list1.add(5); // �ߺ��� ���
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 4));
		//List<Integer> subList(int fromIndex, int toIndex)�޼����
		//List��ü�� ���ι�ȣ fromIndex���� toIndex-1�� ������ List��ü ��ȯ
		//�������� ��Ÿ���ͷ� Collection ��ü�� ��� ����
	
		
		Collections.sort(list1);
		Collections.sort(list2);
		//Collections�� Ŭ������, �������̽��� Collection�ʹ� ������ ����
		//public class Collections extends Object�� Collection�� ���� ����
		//CollectionsŬ������ Collection���� Ŭ���� ó���� ������ �޼������ ����
		//List��ü�� ���� ����
		
		print(list1,list2);
		
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		
		list2.add(6);
		list2.add(7);
		//add(��)�� ������ ��� �ڿ��ٰ� �߰�

		list2.add(2,8);
		//add(���ι�ȣ,��)�� �ش� ���� ��ȣ�� ���� ����(����)
		//���� �� �ش� ���� ��ȣ���� ���� ���� ��ȣ�� ��ĭ�� �ڷ� �и�
		
		print(list1,list2);
		
		list2.set(3, 44);
		//.set�� �ش� ���� ��ȣ(3)�� ���� �Է��� ��(44)���� �ƿ� �����ع���
		print(list1,list2);
		
		//list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�(retainAll�޼���)
		//��ȯ�� boolean
		System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2));
		print(list1,list2);
		
		//list2���� list1�� ���Ե� ��ü���� �����Ѵ�.
		for (int i = list2.size()-1; i >=0 ; i--) {
			//size() �޼���� list�� ���� ����
			if (list1.contains(list2.get(i))) {
				//.get(���ι�ȣ)�� ���� ��ȣ�� ����� ���Ұ�
				//.contains(��)�� ���� ���� ���� ����
				list2.remove(i);
				//.remove(���ι�ȣ)�� ���ι�ȣ�� ���Ұ� ����
				//���ų� �߰��ÿ� �� ������ �ϴ� ���� �ٷ� ó���� �ȴ�
				//������ �� ó���̳� �߰������� ó���� ���ο� �迭�� ����� ó��(ó���ӵ��� �ʾ���)
				//���� for�������� �� ������ ���Һ��� ó�� 
			}
		}
//		System.out.println("list2.retainAll(list1) : "+list2.retainAll(list1));
		print(list1,list2);
		
		Vector v = new Vector();
		v.add(5);
		v.add(6);
		
		
	}//main method;
	
	static void print(ArrayList list1, ArrayList list2) {
		//List�迭�� toString()�� ������ ǥ�õǵ��� Overriding �Ǿ��ִ�.
		System.out.println("list1" + list1);
		System.out.println("list2" + list2);
		System.out.println();
	}//print;
	
}//main class;
