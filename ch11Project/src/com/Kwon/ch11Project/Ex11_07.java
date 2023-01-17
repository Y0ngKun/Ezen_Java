package com.Kwon.ch11Project;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex11_07 {
	public static void main(String[] args) {
		
		String[] strArr = new String [5];
		strArr[0] = "cat";
		strArr[1] = "dog";
		strArr[2] = "lion";
		strArr[3] = "tiger";
		strArr[4] = "02";
		
		Arrays.sort(strArr);
		//문자열 배열을 정렬하므로 String클래스가 구현한 Comparable
		//인터페이스의 compareTo()메서드를 따라서 정렬
		System.out.println("Arrays.toString(strArr) = "+Arrays.toString(strArr));
		//String은 올림차순 정렬(코드번호를 기준으로 번호가 작은것부터 큰것으로)
		//대문자가 소문자보다 빠르고 숫자가 대문자보다 빠름
		Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);
		//CASE_INSENSITIVE_ORDER는 Comparator객체값으로 추가적인 정렬 기준 (대소문자 안가림,소문자 ? 못씀)
		System.out.println("CASE_INSENSITIVE_ORDER = "+Arrays.toString(strArr));
	 	
		Arrays.sort(strArr, new Descending());
		//class Descending에서 역정렬 (내림차순) , (번호가 큰것 부터 작은 것으로) 정의 했음
		System.out.println("Descending 클래스 정의 = "+Arrays.toString(strArr));
		
		Arrays.sort(strArr, Collections.reverseOrder());
		//내림차순(번호가 큰 것 부터 작은 것으로)은 Arrays.sort(strArr, Collections.reversOrder()) 사용해도 됨
		
		System.out.println("Collections.reverseOrder() = " + Arrays.toString(strArr));
		
		
	}//main method;
}//main class;

class Descending implements Comparator{
	//추가적인 정렬 기준 제공 클래스
	//Comparator -인터페이스가 가진 추상메서드를 구현
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			//Comparable을 구현한 객체이어야 비교가능
			Comparable c1 = (Comparable)o1; 
			Comparable c2 = (Comparable)o2; 
			
			//o1 과 o2는 String이고 String은 Comparable의 compareTo가 있음 
			return c1.compareTo(c2) * -1; //역정렬(내림차순)
			//c1.compareTo(c2)는 오름차순 정렬
		}//if;
		return -1;
	}//public int compare;
}//class Descending;