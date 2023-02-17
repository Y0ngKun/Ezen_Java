package com.Kwon.ch14Project;

import java.util.Arrays;
import java.util.stream.Stream;

//�������̽� Stream�� flatMap() ���
//stream�� �����Ϳ�Ұ� Stringó�� �迭 ��� �� �� ������ ���ڿ� �����Ϳ�ҷ� ��ȯ
public class Ex14_08 {
	
	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String [] {"abc","def","jkl"},
				new String [] {"ABC","GHI","JKL"}
						);
		/* Stream�� ������ ������Ұ� String[]�̴�.
		 * �̶��� map()�޼��� ��� flatMap()�� ����ؾ� Stream<String>�� ��
		 * map�� ����ϸ� Stream<Stream<String>>�� �Ǵµ�, �����ϴ�. 
		 */
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		//Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::println)
		strStrm.map(String::toLowerCase) //�ҹ��ڷ� ��ȯ
		.distinct() //�ߺ�����
		.sorted() //�⺻����, ��������
		.forEach(System.out::println);
		
		System.out.println("======================");
	
		String[] lineArr = {
				"Believe or no It is true ",
				"Do or do not There is no try"		
		};
		
		Stream<String> lineArrStrm = Arrays.stream(lineArr);
		lineArrStrm.flatMap(line -> Stream.of(line.split(" +")))
		//�迭�� ���ڿ��� �޾Ƽ� Stream ��ü�� �����, split ���� �����ڸ� �̿��Ͽ� ���ڿ��� �迭�� ��ȯ
		//������ " +"�ε� +�� ���ԽĿ��� ����ϴ� �ϳ� �̻��� ���ڸ� ��Ÿ��
		//�� ������ �ϳ� �̻� (������) �̱� ������ ������ ��;
		//�迭�� 1��� 2���� String[]���� ��ȯ
		.map(String::toLowerCase)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
	}//main method;
}//main class;
