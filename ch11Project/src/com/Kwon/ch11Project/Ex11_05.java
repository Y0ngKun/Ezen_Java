package com.Kwon.ch11Project;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex11_05 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//ArrayList�� List�������̽��� �����߰�, List�������̽���
		//Collection �������̽��� ���
		//generic<���׸�>�� �̿��Ͽ� ��ü�� �����Ѵ�
		//generic�� ArrayList�� �����͵��� ���������� ���� 
		//list ��ü�� ���Ǵ� ��� ���Ҵ� String�̾�߸� �Ѵٰ� ������ ��
		list.add("1");
//		list.add(2); //���ڿ��� �ƴ� �������� �Է½� ����;
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//list�� ��ҿ� �����ϱ� ���� Iterator�� ���
//		Interface Interface<E>�� ���� �Ǿ� ���׸��� �������̽�
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		//��������� ������ Iterator
		//Interface ListIterator<E> ���׸� �������̽� List�迭������ ���
		ListIterator<String> lit = list.listIterator();
		while (it.hasNext()) {
			String str = lit.next();
			System.out.println(str);
		}
		
	}//main method;
}//main class;
