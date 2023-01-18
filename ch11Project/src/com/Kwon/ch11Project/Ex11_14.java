package com.Kwon.ch11Project;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ex11_14 {

	public static void main(String[] args) {
		
		//TreeSet 메서드
		TreeSet set = new TreeSet();
		
		String from ="b";
		String to = "d";
		
		set.add("Car");
		set.add("abc");
		set.add("alien");
		set.add("car");
		set.add("bat");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println("set의 원소수" + set.size());
		System.out.println(set);//Set은 toString()이 재정의 됨
		System.out.println("범위 검색 : from "+ from + "to" + to);
		
		SortedSet ss = set.subSet(from, to);
		System.out.println(ss);
		//public SortedSet<E> subSet(E fromElement, E toElement)
		//subSet메서드는 SortedSet을 반환
		//from 부터 to 앞 까지
		//TreeSet은 인터페이스 SortedSet을 구현함
		//정렬 순서는 숫자,대문자,소문자 순

		SortedSet ss1 = set.subSet(from, to+"zzz");//b부터 dzzz
		System.out.println(ss1);
		
		
	}//main method;
}//main class;
