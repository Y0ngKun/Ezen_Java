package com.Kwon.ch06Project;

import java.util.Arrays;

public class ArrayQuiz {

	public static void main(String[] args) {
		
		String[] cars = {"Volvo","Bmw","Ford"}; //1번
	
		System.out.println(cars[2]);//2번
	
		cars[0] = "Opel";
		System.out.println(cars[0]);//3번
		
		System.out.println(cars.length);//4번
		
	
		for(int i=0;i<=cars.length;i++) {
			String sum = "";
			sum += cars[i];
			System.out.println(sum);
			String tmp = "";
			cars[i] = tmp;
			
		}
		
//		
////		for(String arr : cars) {
////			System.out.print(arr);
////			
////		}//5_2번 enhanced for 사용
////		
////		System.out.println();
////		int[][] myNumbers = {{1,2,3,4},{5,6,7}}; //6번
////		
//////		sum = "";
//////		for(int i=0;i<myNumbers.length;i++) {
//////			sum += myNumbers[i];
//////			System.out.println(Arrays.deepToString(myNumbers));
//////			
//////		}
//////		
//////		
		
		
		
	}//main method

}//public class

/*
 * 1.초기값 "Volvo","Bmw","Ford"를 갖는 배열 cars를 만듦
 * 2.cars 배열의 2번 째 값을 출력
 * 3.cars의 요소 Volvo를 Opel로 변경한 뒤 변경된 요소 값을 출력
 * 4.cars배열의 원소 갯수를 출력
 * 5.cars배열의 요소를 for문으로 출력 (기본 for문, enhanced for문)
 * 6.초기값 {{1,2,3,4},{5,6,7}}을 갖는 myNumbers배열 만들기
 * 7.myNumbers배열의 요소값을 for문을 이용하여 출력
 * 8.cars배열을 정렬
 * 9.car배열을 문자여로 변환하여 출력
 * 10.car클래스를 내부에다 만듦
     --멤버변수 : color,brand
   11.main method 안에 Car객체를 요소로 하는 배열 car1을 요소의 개수 5개로 만듦
     (리터럴 사용 안함)
     각 요소에 Car객체를 만들어 넣어줌
   
 */
