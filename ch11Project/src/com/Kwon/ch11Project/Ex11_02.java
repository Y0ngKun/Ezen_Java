package com.Kwon.ch11Project;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Ex11_02 {
	public static void main(String[] args) {
		
		Stack st = new Stack(); 
		//Stack�� Vector(List �迭)�� ����� Ŭ����
		//LIFO�� �������� ���� ���� ù�� °�� ����
		
		st.push("0"); //push()�� stack�� ���� �߰�
		st.push("1");
		st.push("2");
		//public E push(E item) ��ü�� E�� �Ķ��Ÿ�� ���, ��ü�� E�� ��ȯ
		
		System.out.println("= stack =");
		
		while(!st.empty()) /*empty()�޼���� Stack�� ����� ���Ұ� ������ true*/{
			System.out.println(st.pop());
			//LIFO�� ��ȯ
		}

		
		
		
		
		System.out.println("= Queue =");
		
		Queue q = new LinkedList();
		//Queue�� �������̽��̹Ƿ� �̸� ������ LinkedList()�� ����;
		//FIFO�� ó���� ���� ���� ù�� °�� ����
		
		q.offer("0"); // offer()�� Queue�� ���� �߰�
		q.offer("1");
		q.offer("2");
		//boolean offer(E e)�� ��ü�� E�� �Ķ��Ÿ�� ����Ͽ� �߰��ϰ� ��ȯ�� boolean
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
			//FIFO�� ��ȯ
		}
		
		
		
	}//main method;
}//main class;
