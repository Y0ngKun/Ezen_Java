package com.Kwon.ch14Project;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex14_05 {
	public static void main(String[] args) {
		
		//�迭�̳� Collection�� �����͵��� ���� ó���ϱ� ���� Stream�� ���
		String[] strArr = new String[3];
		strArr[0] = "aaa";
		strArr[1] = "bbb";
		strArr[2] = "ccc";
		
		List<String> strList = Arrays.asList(strArr);
		
		//Collection���� stream���� ��ȯ���ִ� stream()�� ����
		
		Stream<String> strStream1 = strList.stream();
		//<List>�� Stream ��ü�� �����ϴ¹�
		//Interface Stream<T>
		
		Stream<String> strStream2 = Arrays.stream(strArr);
		//<�迭>�� Stream ��ü�� �����ϴ¹�
		//�迭�� Stream���� ��ȯ�ô� Arrays�� static �޼����� stream(�迭)�� ���
		
		//Stream���� �����ϴ� �޼��带 �̿�
		strStream1.sorted().forEach(System.out::println);
		strStream2.sorted().forEach(System.out::println);
		
	}//main method;
}//main class;
