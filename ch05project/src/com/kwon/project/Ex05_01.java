package com.kwon.project;

import java.util.Arrays;

public class Ex05_01 {
	public static void main(String[] args) {

		int[] iArr1 = new int[10];
		// 메모리 확보 및 int 기본값인 0으로 요소가 채워짐
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100,95,80,70,60};
		int[] iArr3 = { 100, 95, 80, 70, 60 };
		// 선언시에 배열의 값(리터럴)로 초기화
		// 배열값을 표시하는 법은 {}안에 ,(콤마)로 구분된 값을 넣어줌
		// 리터럴 값으로 초기화 할 시는 선언시 바로 해주어야한다.
		// 만일 선언 따로 초기화 따로하면 에러 발생
		char[] chArr = { 'a', 'b', 'c', 'd' };

		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
		}

		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1;
		}

		for (int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[1] + ",");
		}

		System.out.println();

		System.out.println(Arrays.toString(iArr1));
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);

	}// main

}
