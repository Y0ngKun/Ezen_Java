package com.kwon.project;

import java.util.Arrays;

public class controlQuiz {

	public static void main(String[] args) {
		
		int x = 50;// 1번
		   int y = 50;// 2번

		   if (x == y) {
		      System.out.println("x==y : " + (x == y) + " 1 ");
		   }
		   if (x > y) {
		      System.out.println("x>y : " + (x > y));
		   } else {
		      System.out.println("x>y : " + (x > y)+ " 2 ");
		   }
		   if (x < y) {
		      System.out.println("x<y : " + (x < y));
		   } else {
		      System.out.println("x<y : " + (x < y)+" 3 ");
		   } // 3번
		   
		   
		   if(x == y) {
			   System.out.println(1);
		   }
			   
		    else if (x > y) {
		    	System.out.println(2);
		    }
		    else {
		    	System.out.println(3);
		    }//3번 선생님 답
		   

		   int time = 20;
		   String noon = "good day";
		   String evening = "good evening";
		   var result = (time < 18) ? noon : evening;
		   System.out.println(result); 
		   // 4번
		   
		   String result1 = (time < 18) ? "Good day" : "Good morning";
		   System.out.println(result1);
		   
		   //4번 선생님 답

		   int day = 4;
		   switch (day) {
		   case 1:
		      System.out.println("case1");
		      break;
		   case 2:
		      System.out.println("case2");
		      break;
		   case 3:
		      System.out.println("case3");
		      break;
		   case 4:
		      System.out.println("case4");
		      break;
		   default:
		      System.out.println("기타");
		   }// 5번
		   
		   switch(day) {
		   	case 1: System.out.println(1);
		   	break;
		   	case 2: System.out.println(2);
		   	break;
		   	default: System.out.println("기타");
		   }
		   //5번 선생님 답

		   int i = 1;

		   while (i < 6) {
		      System.out.print(i);
		      i++;
		   } // 6번

		   System.out.println();
		   i = 1; //int i 한번 선언하고 밑에 값 바꿀 땐 i만 쓰고 = 바꿈..
		   do {
		      System.out.print(i);
		      i++;
		   } 
		   while (i < 6);// 7번

		   System.out.println();
		   for (i = 0; i <= 5; i++) {
		      System.out.print("Yes ");
		   } // 8번
		   
		   System.out.println();
		   for(int c = 0; c<=5; c++) {
			   System.out.print("Yes ");
		   }//8번 선생님 답

		   System.out.println();
		   String[] cars = { "bmw", "volvo", "ford" };
		   for (String arr : cars) {
		      System.out.print(arr + " ");
		   } // 9번 
		   

		   System.out.println();
		   loop1: for (i = 0; i <= 10; i++) {
		      System.out.print(i);
		      if (i >= 5) {
		         break loop1;
		      }
		   } // 10번
		   
		   
		   System.out.println();
		   for(i = 0; i<10; i++) {
			   if(i == 5){
				  break; //break가 있는 가장 인접한 for문을 종료
			   }
			   System.out.print(i);
		   }//10번 선생님 답
		   
		   System.out.println();
		   for(i = 0; i<10; i++) {
			   if(i == 4){
				  continue; 
				  //현재 for문의 다음 반복을 실행 (다음 문장을 실행 안함)
			   }
			   System.out.print(i);
		   } //11번 선생님 답
		   
		   System.out.println();
		   int[] score = {100,100,90,90,88};
		   System.out.println(score.length);
		   System.out.println(Arrays.toString(score));
		   System.out.println(score[4]);
		   
		   char[] ch3 = {'a','b','d'};
		   String[] ch4 = {"ab","bd"};
		   String[] ch5 = new String[5];
		   ch5[0] = "kim";
		   ch5[1] = "lee";
		   System.out.println(ch3);
		   System.out.println(ch4);
		   System.out.println(ch4.length);
		   System.out.println(Arrays.toString(ch4));
		   System.out.println(ch5.length);
		   System.out.println(Arrays.toString(ch5));
		   
		   
		

/*1. int변수 x를 선언하고 초기값 50
 *2. int 변수 y를 선언하고 초기값 50
 *3. 조건문 if를 이용하여 x,y를 동등비교, 크다 비교와 기타로 비교(if ~else if ~else)
 *   각문의 블록 내용은 "1","2","3" 출력
 *4. int 변수 time은 20
 *   조건연산자 (삼항연산자)를 이용하여 time이 18보다 작으면 good day를, 아니면 good evening을 선택하여 result 변수에 저장하고 result를 출력
 *5. int day = 4;
 *	 day를 조건식으로 하는 switch문을 만들고
 *   case문은 1과 2를 만들고 각각 case일시 출력은 case값을 출력하고 switch문 종료
 *   기타는 기타라 출력
 *6. int i = 1;
 *	 i가 6보다 적을시만 반복하는 while문을 만듦(반복시 출력은 i값 출력)
 *	 무한 루프 되지않도록 i값을 조작하여 반복처리
 *7. i변수를 다시 1로 변경, 6번을 do while로 변경
 *8. 기본 for문으로 yes를 5번 출력하시오
 *9. "volvo","bmw","ford"를 요소로 갖는 배열 cars를 만듦
 *   enhandced for문을 이용하여 cars의 원소를 출력
 *10.반복 변수 i는 0부터 시작하여 1씩 증가하며 10회 반복하다가 i가 5가 되면 for문을 중단, 출력은 i값을 출력
 *11.10번과 동일 하되 i가 4가 되면 패스하고 다시 for문 실행
 *  */

	}

}
