package com.Kwon.ch11Project;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {
	public static void main(String[] args) {
		//TreeSet
		Set set = new TreeSet();
		
		for (int i = 0; set.size() < 6; i++) {
			//중복되지않는 값(Set) 6개를 set에 넣어줌
			int num = (int)((Math.random()*45)+1);
			set.add(num);
		}
		//Treeset은 정렬되어 처리되므로 sort하지 않아도 오름차순으로 정렬되어있다
		System.out.println(set);
		
	}//main method;
}//main class;
