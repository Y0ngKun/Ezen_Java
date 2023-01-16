package com.Kwon.ch11Project;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Ex11_02 {
	public static void main(String[] args) {
		
		Stack st = new Stack(); 
		//Stack은 Vector(List 계열)를 상속한 클래스
		//LIFO로 마지막에 넣은 것을 첫번 째로 꺼냄
		
		st.push("0"); //push()는 stack에 값을 추가
		st.push("1");
		st.push("2");
		//public E push(E item) 객체형 E를 파라메타로 사용, 객체형 E를 반환
		
		System.out.println("= stack =");
		
		while(!st.empty()) /*empty()메서드는 Stack에 저장된 원소가 없으면 true*/{
			System.out.println(st.pop());
			//LIFO로 반환
		}

		
		
		
		
		System.out.println("= Queue =");
		
		Queue q = new LinkedList();
		//Queue는 인터페이스이므로 이를 구현한 LinkedList()로 만듦;
		//FIFO로 처음에 넣은 것을 첫번 째로 꺼냄
		
		q.offer("0"); // offer()는 Queue에 값을 추가
		q.offer("1");
		q.offer("2");
		//boolean offer(E e)는 객체형 E를 파라메타로 사용하여 추가하고 반환은 boolean
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
			//FIFO로 반환
		}
		
		
		
	}//main method;
}//main class;
