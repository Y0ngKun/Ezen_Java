package com.Kwon.ch14Project;

public class Ex14_Lambda {
	public static void main(String[] args) {
		
//		(int a, int b) {return a > b ? a : b;}

//		(int a, int b) a > b ? a : b
		//한줄 일 경우 {} 생략 가능
		//return없이 사용 시에는 문장이 아니고 수식이므로 ;(세미콜론) 사용안함.
		//단 return 사용시에는 ;(세미콜론) 생략 불가
		
//		(a,b) -> a > b ? a : b
		//파라메타의 데이터형 생략 가능		
		
//		(String name, int i) -> {System.out.println(name + "=" + i);}
//		(name, i) -> {System.out.println(name + "=" + i);}
		//파라메타의 데이터형 생략
//		(name, i) -> System.out.println(name + "=" + i)
		//(파라메타의 데이터형 생략) + ({블록} 생략) + (; 생략)
		
		
//		(int x) -> {return x * x;}
//		(int x) -> x * x
		//({블록} 생략) + (return생략) +(; 생략)
//		(x) - > x * x
		//(파라메타의 데이터형 생략) + ({블록} 생략) + (return 생략) + (; 생략)
//		x -> x * x
		//파라메타 매개변수가 하나 일 시는 파라메타() 생략 가능
		//단 데이터형이 있을시는 불가 
		//(파라메타 매개변수 생략) + (파라메타의 데이터형 생략) + ({블록} 생략) + (return 생략) + (; 생략)
		
//		() -> {return (int)(Math.random()*6);} 
		//return시에는 한줄이라도 {} 사용해야함
//		() -> (int)(Math.random()*6)
		//한줄이고이고 return 생략 {} 생략 ; 생략
		
		
//		(int[] arr) ->{
//			int sum = 0;
//			for (int i : arr) {
//				sum += i;
//			}
//			return sum;
//		}
		
		
	}//main method;
	
	int max(int a, int b) {
		return a > b ? a : b;
	}
	
	void printVar (String name, int i) {
		System.out.println(name + "=" + i);
	}
	
	int square (int x) {
		return x * x;
	}
	
	int roll (){
		return (int)(Math.random()*6);
	}
	
	int sumArr(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	
}//main class;

