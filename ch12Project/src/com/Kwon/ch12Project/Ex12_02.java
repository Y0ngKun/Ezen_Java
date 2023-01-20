package com.Kwon.ch12Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex12_02 {

	public static void main(String[] args) {
		
		//List��ü�� ������ ��Ҵ� Student�� ��ü���̴�.
		ArrayList<Student> list = new ArrayList<Student>(); 
		//ArrayList�� ���(����, �޼���)�� ���׸��� ����ϴ� ��� �͵��� Student�� ���׸����� ���
		//��ǥ���� �޼��� public, boolean, add(E e)�� ���׸� E�� ����ϹǷ� ���⼭�� Student���
		
		list.add(new Student("�ڹٿ�", 1, 1));
		list.add(new Student("�ڹ�¯", 1, 2));
		list.add(new Student("ȫ�浿", 2, 1));
		//list.add("Kook"); Student��ü�� �ƴ� ���ڿ��� ����ϹǷ� ����
		
		Iterator<Student> it = list.iterator();
		//Iterator�� ���׸� �������̽� �̹Ƿ� �̸� �����ϴ� list��ü�� ���׸��Ķ���͸� ����Ͽ� ����
		//Interface Iterator<E>
		while (it.hasNext()) {
			Student s = it.next(); //���׸�����ڴ� ����ȯ �ʿ����
			//E next()
			System.out.println(s.name); 
		}
		
		Map<String, Student> map = new HashMap<String, Student>();
		Student s0 = map.put("stu1", new Student("�ڹ�0", 1, 1));
		Student s1 = map.put("stu2", new Student("�ڹ�1", 1, 1));
		Student s2 = map.put("stu3", new Student("�ڹ�2", 1, 1));
	
		
	}//main method;
}//main class;


class Student{
	//����� �ν��Ͻ���, ���������ڴ� default�� ������ ��Ű�������� ��𼭳� ����
	String name = "";
	int ban; //�ʱⰪ 0
	int no; //�ʱⰪ 0
	Student(String name, int ban, int no){
		super();
		this.name =name;
		this.ban =ban;
		this.no =no;
		
	}//Student method;
	
}//class Student;

