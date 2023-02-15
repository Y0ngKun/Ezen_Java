package com.Kwon.ch14Project;

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_06 {
	public static void main(String[] args) {
		Stream<StudentEx14> StudentEx14Stream = Stream.of(
				new StudentEx14("���ڹ�",3,300),
				new StudentEx14("���ڹ�",1,200),
				new StudentEx14("���ڹ�",2,100),
				new StudentEx14("���ڹ�",2,150),
				new StudentEx14("���ڹ�",1,200),
				new StudentEx14("���ڹ�",3,290),
				new StudentEx14("���ڹ�",3,180)
				);
		//Comparator�� �޼��带 �̿��ؼ� Ư�� ���� �� ���Ľô� Comparable �������̽���
		//������ Ŭ������ ���ؼ��� �Ķ���Ͱ� �ϳ��� comparing()�� ���
		StudentEx14Stream.sorted(Comparator.comparing(StudentEx14::getBan).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
		//comparing()�� Ư�� ���� �̿�
		//Comparator.naturalOrder()�� Comparable�� ������ Student���� ������
		//compareTo() ���� ������ �������� ���� ��� ���
	
	
	}//main method;
}//main class;
