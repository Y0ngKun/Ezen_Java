package com.Kwon.ch14Project;

import java.io.File;
import java.util.stream.Stream;

//map �߰� ���� �޼���
public class Ex14_07 {
	
	public static void main(String[] args) {
		//<R> Stream<R> map ( Function <? super T, ? extends R> mapper )
		//�տ� <R>ǥ�ð� �־ ���׸� �޼�����
		//�Ķ��Ÿ�� T�� �޾Ƽ� R�� ��ȯ�ϴ� �Լ��� �������̽� Function���
		
		File[] fileArr = {
				new File("Ex1.java"),
				new File("Ex1.bak"),
				new File("Ex2.bak"),
				new File("Ex1"),
				new File("Ex1.txt")
		}; 
	//File(String pathName)�����ڴ� �Ķ��Ÿ�� ������ ��θ��� �̿��Ͽ� ���� ��ü�� ����
	
		Stream<File> fileStream = Stream.of(fileArr);
		//map()���� Stream<File>�� Steam<String>���� ��ȯ
		
		Stream<String> fileNameStream = fileStream.map(File::getName);
		//������ Ÿ���� File�� ��ü�� �޾Ƽ� ������ Ÿ���� String���� ��ȯ
		fileNameStream.forEach(System.out::println);
		//forEach�� ���� �����̹Ƿ� Stream�� �Ҹ���ѹ�����.
		
		System.out.println("=============================");
		
		fileStream = Stream.of(fileArr);
		//Stream ��ü �����
		
		fileStream.map(File::getName)/*String Stream*/
		.filter( s -> s.indexOf('.') != -1  )/*indexOf �޼���� ���� '.'�� ã�Ƽ� �ش� ������ ���ι�ȣ�� -1�� �ƴϸ� true, �� ���� .�� ���ԵǾ������� ���� �Ѵ�*/
		.peek(s->System.out.printf("fileName = %s%n",s)) /*�߰����굵 ������ �����Ϳ�ҿ� ���� ����ó�� �ϸ鼭 �ݺ�*/
		.map(s -> s.substring(s.indexOf('.')+1))/* .������ Ȯ���� ���ڿ��� ���� */
		.peek(s->System.out.printf("extension = %s%n",s))
		.map(String::toUpperCase) /*�빮�ڷ� ��ȯ*/
		.distinct() /*�ߺ�����*/
		.forEach(System.out::println);
		//map�� �߰� �����̹Ƿ� ������ ���� ����
		
	}//main method;
}//main class;
