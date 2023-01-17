package com.Kwon.ch11Project;

import java.util.Arrays;

public class Ex11_06 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5}; //1차원 배열
		int [] [] arr2D = {{11,12,13},{21,22,23}}; //2차원 배열
		
		System.out.println("1차원 배열 arr = " + Arrays.toString(arr));
		//Arrays.toString(배열명) = 1차원 배열 요소값출력
		System.out.println("2차원 배열 arr2D = " + Arrays.deepToString(arr2D));
		//Arrays.deepToString(arr2D) = 2차원 배열 요소값 출력
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		//arr전체 복사여 arr2에 복사
		int[] arr3 = Arrays.copyOf(arr, 3);
		//arr에서 앞에서 3개를 복사하여 arr3에 복사
		int[] arr4 = Arrays.copyOf(arr, 7);
		//arr이 뒤에 복사할 숫자보다 적으면 나머지는 기본값으로 채움
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		//배열 원소의 범위를 지정시는 copyOfRange(대상배열,시작색인번호,종료 색인번호)
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		//대상배열 범위 이상은 기본값으로 채움
		
		System.out.println("arr2 = "+Arrays.toString(arr2));
		System.out.println("arr3 = "+Arrays.toString(arr3));
		System.out.println("arr4 = "+Arrays.toString(arr4));
		System.out.println("arr5 = "+Arrays.toString(arr5));
		System.out.println("arr6 = "+Arrays.toString(arr6));
		
		
		
		int [] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		//arr7배열을 모두 9로 채움
		
		System.out.println("arr7을 .fill로 9로 채움 = " + Arrays.toString(arr7));
		
		//seatAll(배열명,람다식 또는 함수형 인터페이스 구현 객체)
		Arrays.setAll(arr7, (i) -> (int)(Math.random()*6)+1);
		//람다식은 화살표 함수라고도 한다.
		//-> 이게 파라메타
		
		System.out.println("arr7 요소를 Math.random()*6+1로 채움 = " + Arrays.toString(arr7));
		
		for (int i : arr7) {
			char [] graph = new char[i];
			Arrays.fill(graph, '*');			
			System.out.println("graph = " + new String(graph)+ i);
		}
	
		String [][] str2D = new String [][] {{"aaa","bbb"},{"AAA","BBB"}};
		String [][] str2D2 = new String [][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println("Arrays.equals(str2D, str2D2) = "+Arrays.equals(str2D, str2D2));
		//1차원 배열 비교  false; Arrays.equals(str2D, str2D2)
		System.out.println("Arrays.deepEquals(str2D, str2D2) = "+Arrays.deepEquals(str2D, str2D2));
		//2차원 배열 비교 true; Arrays.deepEquals(str2D, str2D2)
		
		
		
		String [] str1d = new String [] {"a,b,c"};
		String [] str1d2 = new String [] {"a,b,c"};
		
		System.out.println("Arrays.equals(str1d, str1d2) = "+Arrays.equals(str1d, str1d2));
		System.out.println("Arrays.deepEquals(str1d, str1d2) = "+Arrays.deepEquals(str1d, str1d2));
		
		
		char[] chArr = {'A','D','C','B','E'};
		System.out.println("chArr = " + Arrays.toString(chArr));
		//toString(모든 기본형 배열, 참조형 배열)
		//binarySearch(chArr, 'B')는 chArr배열에서 2진 검색법으로 B를 찾아 색인번호 반환
		//정렬 후에 사용해야 함
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
		System.out.println("= After sorting =");
		
		Arrays.sort(chArr);
		//정렬은 오름차순 A가 먼저 출력
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch( chArr, 'B'));
	}//main method;
}//main class;
