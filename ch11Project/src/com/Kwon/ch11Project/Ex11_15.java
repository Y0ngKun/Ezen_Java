package com.Kwon.ch11Project;

import java.util.TreeSet;

public class Ex11_15 {

	public static void main(String[] args) {
		//TreeSet�޼���
		TreeSet set = new TreeSet();
		
		int[] score = {80,95,50,35,45,65,10,100};
		
		for(int i = 0; i < score.length; i++) {
			set.add(score[i]); //�ߺ� �� ���� ������ �ϳ��� �߰�
		}
		
		System.out.println("set : "+set);
		
		System.out.println("50���� ���� �� : " + set.headSet(50));
		//headSet(���ذ�)���� ���ذ����� �������� ���� (�⺻�� �������Ѵ�)
		//public SortedSet<E> headSet(E toElement) ��ȯ�� SortedSet�̹Ƿ� TreeSet��ȯ
		//�⺻���� �Ķ���ͷ� ����ϸ� autoboxing�� ���� �⺻���� wrapperŬ������ ����
		
		System.out.println("50���� ū �� : " + set.tailSet(50));
		//public SortedSet<E> tailSet (E fromElement)
		//tailSet�� �⺻���� �����ؼ� �����Ѵ�

		
		
	}//main method;
}//main class;
