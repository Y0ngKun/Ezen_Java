package com.kwon.project;

public class Ex05_06 {

	public static void main(String[] args) {
		//String 배열의 초기화
		String[] names = {"kim","park","lee"};
		
		for(int i=0; i < names.length; i++) {
			System.out.println("names[" + i +"]:"+names[i]);
		}
		
		String tmp = names[2];//배열 요소에 색인번호로 접근
		System.out.println("tmp :" + tmp);
		
		names[0] = "Yu"; //첫번째 배열값을 Yu로 변경
//		names[1] = new String("ko");
		
		//기본 for문은 초기화부,조건식,증감식으로 처리
		//배열이나 데이터처리컬렉션에서는 개선된 for(enhanced for)를 사용
		for(String str: names) {
			//첫번째 파라메터는 요소의 데이터형의 변수, 두번째 파타메터는 배열이름
			System.out.println(str);
			
		}
		
	}//main

}
