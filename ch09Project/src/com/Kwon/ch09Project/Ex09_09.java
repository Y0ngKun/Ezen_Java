package com.Kwon.ch09Project;

import java.util.StringJoiner;

public class Ex09_09 {

	public static void main(String[] args) {
		//문자열의 변환
		String animals = "dog,cat,bear";
		
		//문자열을 배열로 변환
		String[] arr = animals.split(","); //.split = 문자열 중간 구분문자
		
		animals = String.join("-", arr);
		//join은 String의 static 메서드 join("구분문자",사용할배열)로 문자열을 반환
		System.out.println("animals : "+animals);
		
		
		//StringJoiner	객체를 만들어 add 메서드로
		//배열의 원소를 문자열로 변환시 생성시 설정한 구분자와 접두사,접미사를 첨가
		StringJoiner sj = new StringJoiner("/","[","]"); 
		//생성시에 구분문자 / , 맨처음 문자는[ , 마지막 문자는 ]을 이용
		for(String s : arr)
			sj.add(s);//StringJoiner객체를 반환(즉 자신을 반환)
		
		
		System.out.println(sj.toString());
		//StringJoiner에서 toString()을 Override 해놓음
		System.out.println(sj);
		//print문의 객체값 사용시에 자동으로 toString이 붙음
	}

}
