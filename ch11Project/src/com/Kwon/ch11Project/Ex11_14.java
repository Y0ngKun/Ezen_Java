package com.Kwon.ch11Project;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ex11_14 {

	public static void main(String[] args) {
		
		//TreeSet �޼���
		TreeSet set = new TreeSet();
		
		String from ="b";
		String to = "d";
		
		set.add("Car");
		set.add("abc");
		set.add("alien");
		set.add("car");
		set.add("bat");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println("set�� ���Ҽ�" + set.size());
		System.out.println(set);//Set�� toString()�� ������ ��
		System.out.println("���� �˻� : from "+ from + "to" + to);
		
		SortedSet ss = set.subSet(from, to);
		System.out.println(ss);
		//public SortedSet<E> subSet(E fromElement, E toElement)
		//subSet�޼���� SortedSet�� ��ȯ
		//from ���� to �� ����
		//TreeSet�� �������̽� SortedSet�� ������
		//���� ������ ����,�빮��,�ҹ��� ��

		SortedSet ss1 = set.subSet(from, to+"zzz");//b���� dzzz
		System.out.println(ss1);
		
		
	}//main method;
}//main class;
