package com.Kwon.ch11Project;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Ex11_08 {
	public static void main(String[] args) {
		
		Integer[] arr = {30,50,10,40,20};
		//기본형을 자신의 wrapper클래스인 Integer로 변환은 오토박싱으로 자동 처리
		
		Arrays.sort(arr);
		//sort시에는 wrapper클래스인 Integer클래스가 구현한 comparable의 compareTo에 의해 정렬
		//값에 의해 오름차순으로 정렬
		System.out.println(Arrays.toString(arr));
		
		//역정렬(내림차순)(큰수부터 작은 수 순서로)
		Arrays.sort(arr, Collections.reverseOrder());
		//Collections클래스 안에 reverseOrder()메소드 사용 (내림차순)
		//혹은 예제 11_07과 같이 Descending클래스를 만들어서 사용해야 한다.
		
		System.out.println(Arrays.toString(arr));
	
		
		
		
		
	}//main method;
}//main class;
