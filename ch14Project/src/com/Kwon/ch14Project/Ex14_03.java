package com.Kwon.ch14Project;

import java.util.function.*;
//Predicate ��ü�� �����Ͽ� ����ϴ� �޼���
public class Ex14_03 {
	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> i < 100; //i�� 100���ϸ� true
		Predicate<Integer> q = i -> i < 200; //i�� 200���ϸ� true
		Predicate<Integer> r = i -> i%2 == 0; //i�� ¦���� true
		
		Predicate<Integer> notP = p.negate(); // i >= 100 (p�� !����)
		Predicate<Integer> all = notP.and(q.or(r)); 
		//q��ü�� r��ü�� || ���� �� �Ŀ� notP��ü�� &&���� ����
		//( i >= 100 ) && ( i <= 200 || i%2 ==0 )
		//������ ����� test()�� ��
		
		System.out.println(all.test(202));
	
	}//main method;
}//main class;
