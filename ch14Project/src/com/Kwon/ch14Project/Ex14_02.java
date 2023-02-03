package com.Kwon.ch14Project;

import java.util.*;
import java.util.function.*;

public class Ex14_02 {
	public static void main(String[] args) {
		
		Supplier<Integer> s;
		//�Լ��� �������̽� Supplier<T>�� 
		//�Ķ��Ÿ�� ���� ��ȯ�� <T>������ �ϴ� �߻�޼��� T get()�� ���´�.
		//�Լ��� �������̽� ��ü�� �߻�޼��带 �����ϴ� ���ٽ����� ����
		//	���ٷ� =	Supplier<Integer> s = () -> (int)(Math.random()*100)+1;
		s = () -> (int)(Math.random()*100)+1;

		Consumer c;
		//�Լ��� �������̽� Consumer�� �Ķ��Ÿ�� 1���̰� ���ϰ��� ���� �߻�޼���
		//public abstract void accept(T t)�� ���� �ִ�.
		//�Լ��� �������̽� ��ü�� �߻�޼��带 �����ϴ� ���ٽ����� ����
		c = i -> System.out.println(i + "");
		
		Predicate<Integer> p = i -> i%2 == 0;
		Predicate<Integer> s0 = (x) -> x%3==0;
		//�Լ��� �������̽� Predicate <T>�� �Ķ��Ÿ�� �ϳ��� ������ boolean�� �ϴ�
		//�߻�޼��� boolean test(T t)�� ���´�.
		
		Function <Integer, Integer> f;
		//�Լ��� �������̽� Function�� �Ķ��Ÿ�� 1���̰� ����Ÿ���� �ִ� �߻�޼���
		//R apply(T t)�� ���´�
		f = i /*�Ķ��Ÿ*/ -> i/10 * 10/*��� ����*/ ;
	

		List<Integer> list = new ArrayList<Integer>();
		makeRandom(s, list);
		System.out.println(list);
		
	}//main method;
	
	static<T> void makeRandom(Supplier<T>s, List<T> list) {
		for (int i = 0; i < 10; i++) {
			//list ��ü�� ���ٽ����� ������ get�޼��带 ȣ���Ͽ� ��ȯ�Ǵ� ����
			//.add�޼��带 ���� list ���� �ִ´�
			list.add(s.get());
		}
	}
	
}//main class;

