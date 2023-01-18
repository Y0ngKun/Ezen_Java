package com.Kwon.ch11Project;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {

	public static void main(String[] args) {
		
		HashSet setA = new HashSet(); //�⺻����1
		HashSet setB = new HashSet(); //�⺻����2
		HashSet setHab = new HashSet(); // ������
		HashSet setKyo = new HashSet(); // ������
		HashSet setCha = new HashSet(); // ������
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		
		System.out.println("A = " + setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		
		System.out.println("B = "+setB);
		
		
		//set�� ��Ҹ� �ϳ��� ���ϱ� ���� Iterator��ü ����
		Iterator it = setB.iterator();
		//������ ���ϱ�
		while (it.hasNext()) { //hasNext�� ������ ��Ұ� �ֳ� ���� �Ǵ� �� ������ true ����
			Object tmp = it.next();
			if (setA.contains(tmp)) {
				//.contains(x) x�� ���ԵǾ��ִ��� Ȯ���ϴ� �޼���
				setKyo.add(tmp);	
			}//if;
		}//while;
		
		
		//������ ���ϱ�
		it = setA.iterator();
		while (it.hasNext()) { //hasNext�� ������ ��Ұ� �ֳ� ���� �Ǵ� �� ������ true ����
			Object tmp = it.next();
			if (!setB.contains(tmp)) {
				//.contains(x) x�� ���ԵǾ��ִ��� Ȯ���ϴ� �޼���
				setCha.add(tmp);
			}//if;
		}//while;
		
		
		//������ ���ϱ� A
		it = setA.iterator();
		while (it.hasNext()) { //hasNext�� ������ ��Ұ� �ֳ� ���� �Ǵ� �� ������ true ����
			setHab.add(it.next());
		}//while;
		
		//������ ���ϱ� B
		it = setB.iterator();
		while (it.hasNext()) { //hasNext�� ������ ��Ұ� �ֳ� ���� �Ǵ� �� ������ true ����
			setHab.add(it.next());
		}//while;
		
		
		System.out.println("==���м�==");
		
		
		System.out.println("setA = "+setA);
		System.out.println("setB = "+setB);
		System.out.println("setA �� setB = "+ setKyo);
		//��� ������ Ư�����ڴ� �ѱ� ���� ģ �� ���ڸ� Ŭ���Ͽ� ����
		System.out.println("setA �� SetB= "+setHab);
		System.out.println("setA - SetB= "+setCha);
		
		
		

		
		
		
	}//main method;
}//main class;
