package com.Kwon.ch14Project;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

//���ٽ��� ���(������)�� �ϳ��� �޼��常 ���ÿ��� �޼��������� ������ ���ٽ� ��ü 
public class Ex14_RefMethod {
	

	public static void main(String[] args) {
		
	Function<String, Integer> f = (s) -> Integer.parseInt(s); //f��� ��ü ����
	//�Լ��� �������̽� Function�� �߻�޼���� R apply(T t);�� �����ϴ� ���ٽ��� ���
		
	Function<String, Integer> f1 = Integer::parseInt;
	//��Ͼȿ� �ϳ��� �޼��常 ����ϹǷ� �޼��� ���������� ��밡��, (�Ķ��Ÿ) ->�� �ʿ������,
	//�޼��� ȣ�⵵ static�޼���� Ŭ�����̸�::�޼ҵ��̸�;
	//�ν��Ͻ��� �޼��带 �ѹ��� ȣ��ÿ��� Ŭ�����̸�::�޼����̸����� ȣ��
	//�ν��Ͻ��� ��ü�� ���� �޾Ƽ� ó��
	
	//BiFunction ���� �� �Ҹ��� 1�� ���� ����;;;;;;;;;
	BiFunction<Object, String, String> bf = (Object obj, String s) -> obj.toString();
	//BiFunction<Object, String, String> bf1 = Object::toString();
	//�ܺ� ��ü�� �޼��� ȣ��ô� �ܺΰ�ü��::�ν��Ͻ��޼���

	//��Ϻκ��� new ������ �϶��� �޼��������� �̿� ����
	
	BiFunction <Object, String, Integer> bf2 = (Object obj, String s) -> Integer.parseInt(s);
	//������ ����� ���� �� ����
	BiFunction<Object, String, Integer> bf3 = Example::process;
	//chatGPT�� ���� �Լ��� �������̽� BiFunction�� �޼��� ������ Ȱ���
	
	Supplier <String> sp = () -> new String ("abc");
	Supplier <String> sp1 = String::new;
	//Supplier�� �߻�޼��尡 T get();
	//�޼��� ������ ������ Ȱ��ô� Ŭ�����̸�::new;
	
	}//main method;
}//main class;

class Example {
	static Integer process(Object o, String s) {
		// do something with o and s
		return 0;
	}
}