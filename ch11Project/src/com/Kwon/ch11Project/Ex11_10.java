package com.Kwon.ch11Project;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {
	public static void main(String[] args) {
		
		//로또 당첨 번호 발행시 중복된 번호를 피하기 위해 Set 사용
		Set set = new HashSet();
		
		for (int i = 0; set.size() < 6 ; i++) {
			//반복 조건으로 set에 추가되는 원소 갯수를 사용
			//로또 복권 번호는 6개 이므로 i = 0부터 시작, set.size() < 6
		
			int num = (int)((Math.random())*45) + 1 ;
			//+1을 안하면 0~44까지 나오고
			//+1을 하면 1~45까지 나온다
			
			set.add(new Integer(num));
			
		}//for;
		
		List list = new LinkedList(set);
//		/LinkedList의 파라메타에는 Collection이면 모두 가능
		
		//배열이면 Arrays.sort(배열)로 정렬하나 Set은 배열이 아님
		Collections.sort(list);
		//sort(list 객체)만 허용
		
		System.out.println(list);
	
	
	
	
	
	}//main method;
}//main class;
