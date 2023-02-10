package com.Kwon.ch14Project;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Stream ��ü �����ϱ�

public class Ex14_StreamMaking {
	public static void main(String[] args) {
		/*Collection �������̽��� stream()�޼��尡 �����ϹǷ� 
		  Collection ���� Ŭ������ List,Set���� Stream()�޼��带 ��� �޾� �����ִ�.
		  Stream<E> stream(); 
		  stream() �޼���� Stream��ü�� ��ȯ�Ѵ�.
		*/
		
		//List�� �� ��ü�� Stream���� �� ��ü�� ��ȯ�غ���
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();
		//��Ʈ�� ��ü�� �̿��Ͽ� ��Ʈ�� �޼��� Ȱ��
		//forEach�� list�� ���� stream�� �����͸� ���� �ݺ��� ���ؼ� ���ٽ����� ó��
		intStream.forEach(System.out::println);
		
		//���� ���ڸ� ����Ͽ� Stream �����
		Stream<String> strStream1 = Stream.of("a","b","c");
		//Interface Stream <T>�� of �޼ҵ� ���
		
		
		//Stream()�� �迭 �����
		Stream<String> strStream2 = Stream.of(new String[] {"a","b","c"});
		//Stream.of �޼ҵ带 �̿��� �Ķ��Ÿ�� String[]�� �����ϴ� ��
		Stream<String> strStream3 = Arrays.stream(new String[] {"a","b","c"});
		//Arrays.stream �޼ҵ�� String [] �����ϴ� ��
	
		Stream<String> strStream4 = Arrays.stream(new String[] {"a","b","c"},0,3);
		//{}�ڿ� 0�� ���ι�ȣ 0�̸�, 3�� ���ι�ȣ 3-1���� ����
		
		
		//�⺻�� Int Stream�����
		IntStream intStream1 = IntStream.of(1,2,3);
		//�Ķ��Ÿ�� �迭 ���
		IntStream intStream2 = IntStream.of(new int[] {1,2,3});
		IntStream intStream3 = Arrays.stream(new int[] {1,2,3});
		IntStream intStream4 = Arrays.stream(new int[] {1,2,3},0,3);
	
		intStream4.forEach(System.out::println);
		
		
		//RandomŬ������ �̿��� ������ �� �⺻�� ��Ʈ�� �����
		IntStream intStream5 = new Random().ints(5);
		//ints()�� �Ķ��Ÿ �� ���Է½� ���Ѱ��� ������ ���� intStream5�� ����� ������ 
		//���Ѱ��� ������ ���� ��� ������ �Ķ��Ÿ�� ����� �����������
		intStream5.forEach(System.out::println);
		
		DoubleStream doubleStream1 = new Random().doubles(5);
		doubleStream1.forEach(System.out::println);
		
	}//main method;
}//main class;
