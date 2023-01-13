package com.Kwon.ch10Project;

import java.text.DecimalFormat;

public class Ex10_06 {
	
	public static void main(String[] args) {
		
		double number = 1234567.89;
		
		String[] pattern = { 
				//패턴 기호 모음 배열
				//패턴은 패턴기호를 이용해서 원하는 형식을 작성
				"0", //10진수로 표시 (소수점 없음, 자리수 제한 없음)
				"#", //10진수로 표시 (소수점 없음, 자리수 제한 없음)
				"0.0", //소수점 1자리 표시
				"#.#", //소수점 1자리 표시
				"#,###.##", // 단위 구분자 , 3자리로 잘라서,붙이고 소수점 2자리 표시 
		};
		
		for (int i = 0; i < pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			//DecimalFormat은 숫자를 형식화해서 표시해주는 Class
			//format() 메서드는 숫자값을 정해진 패턴 형식으로 변환한 문자열을 반환
			System.out.println("pattern값 : "+ pattern[i] + " / 변환값 : " + df.format(number));
		}
		
	}//main method
}//main class
