package com.Kwon.ch14Project;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Stream�� reduce(), ����������
public class Ex14_10 {

	public static void main(String[] args) {
		
		String[] strArr = {"Inheritance","Java","Lambda","stream",
				"OptionalDouble","IntStream","count","sum"};
		
		Stream.of(strArr).forEach(System.out::println);
		//���ڿ� �迭 strArr�� Stream��ü�� ����� ���
		
		boolean noEmptyStr = Stream.of(strArr)
				.noneMatch(s->s.length()==0);
		//noneMatch()�� "���" ��Ұ� ���ǿ� ���� ������ true
		System.out.println("noEmptyStr = " + noEmptyStr);
		
		Optional<String> sWord = Stream.of(strArr)
				.filter(s->s.charAt(0)=='s')
				.findFirst();
		//���ڿ� �迭�� ����� 0��° ���ι�ȣ�� 's'�� �� �߿�
		//ù��°�� ���õ� ��Ұ��� ��ȯ
		System.out.println("sWord = " + sWord.get());
		
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b)-> a + 1); //count() ��Ȱ�� �Ѵ�.
		//reduce(�ʱⰪ,BinaryOperator��ü)�޼���� �ʱⰪ�� 
		//BinaryOperator ��ü�� ù ��° �Ķ���ͷ� ���
		//�������� ���ϰ��� �ʱⰪ���� �Ͽ� �ݺ�
		
		int sum = intStream2.reduce(0,(a,b) -> a + b); //sum();
		
		OptionalInt max = intStream3.reduce(Integer::max);
		//�� ����� ���ڿ� �� ���� �� ���ڿ��� ���ڼ�
		OptionalInt min = intStream4.reduce(Integer::min);
		//�� ����� ���ڿ� �� ���� ���� ���ڿ��� ���� ��
		System.out.println("count = " + count);
		System.out.println("sum = " + sum);
		System.out.println("max = " + max.getAsInt());
		System.out.println("min = " + min.getAsInt());
		//OptionalInt ��ü�ô� get()�� �ƴϰ� getAsInt();
		
	}//main method;
}
