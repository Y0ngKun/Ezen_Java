package com.Kwon.ch14Project;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MiddStreamOP {
	public static void main(String[] args) {
		
		IntStream intStream = IntStream.rangeClosed(1, 10);
		//1���� 10������ ���� ���� ��ȯ�ϴ� ��Ʈ�� ��ü ����
		
		intStream.skip(3).limit(5).forEach(System.out::println);
		//skip�� �߰� �������� �տ��� 3���� �����ϴ� �߰� ������ �Ͽ� stream���� �ٽ� ��ȯ
		//limit�� �߰� �������� ó������ n�������� ������ ���ο� stream�� ���� 
		//forEach�� ���� �������� limit�� ������ stream�� ������ ��Ҹ� �ݺ� ���� (���ٽ��� �Ķ��Ÿ�� ���)
		
		IntStream intStream01 = IntStream.of(1,2,2,3,3,3,4,5,5,6);
		intStream01.distinct().forEach(System.out::print);
		//distinct()�� �߰� �������� stream��ü ������ ����� �ߺ����� 1���� ó���Ͽ� stream���� ��ȯ
		
		
		IntStream intStream02 = IntStream.rangeClosed(1, 10);
		intStream02.filter(i->i%2==0).forEach(System.out::println);
		//filter(Predicate�� �Ķ��Ÿ)�� �Ķ��Ÿ������ boolean�� return����� �ϰ� �Ķ��Ÿ�� 1���� �޴´�,�� �� false�̸� ������ ��� �����ϰ� true�� �͸� ��ȯ
		//filter()�� stream�� �����͵鿡 ���� �ݺ� ó��
		
		intStream02 = IntStream.rangeClosed(1, 10);
		intStream02.filter(i->i%2!=0).filter(i->i%3!=0).forEach(System.out::println);
		//���� ������ ���� stream��ü�� �ٽ� ��� �� �� �����Ƿ� ���� �ٽ� ���� ����
		//.filter()�� ���޾Ƽ� �� �� �ִ�. 
		
		
		System.out.println("===== sorted() - �߰�ó�� �޼��� ���=====");
		
		
		/*sorted() - �߰�ó�� �޼��� ��� */
		Stream<String> strStream = Stream.of("dd","aaa","CC","cc","b");
		strStream.sorted().forEach(System.out::println);
		//sorted()�� Comparable�� ����ϴ� �⺻�� ����
		//���� ����� ������ ����, �빮�ڰ� �ҹ��ں��� ����
		
		System.out.println("========== String.CASE_INSENSITIVE_ORDER ��� ========");
		
		strStream = Stream.of("dd","aaa","CC","cc","b");
		//������ strStream�� forEach�� ��������Ǿ� �Ҹ�����Ƿ� �ٽ� ����
		strStream.sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);
		//���Ľ� comparable�� �⺻ ������ �ƴ϶� ���� ������ �ָ�
		//sorted(comparator c) ���·� ���
		//String.CASE_INSENSITIVE_ORDER�� ��ҹ��� �����ϰ� �����ϴ� ����
		//Comparator<String> CASE_INSENSITIVE_ORDER
	}//main method;
}//main class;
