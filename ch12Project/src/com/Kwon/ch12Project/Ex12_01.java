package com.Kwon.ch12Project;

import java.util.ArrayList;
import java.util.List;

public class Ex12_01 {
	public static void main(String[] args) {
		
		ArrayList<Product> productList = new ArrayList</*<Product> 자바 8부터 생성자에는 제네릭 생략 가능,단 <> 이 기본형은 생략 불가*/>();
		//생성자의 제네릭에는 자바8부터 데이터형 생략 가능, 단 <>는 생략불가
		//제네릭에 들어가는 데이터형은 참조형 데이터형이어야만 한다(기본형은 불가)
		//Class ArrayList<E>로 정의됨
		
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		//지네릭으로 사용되는 타입변수는 다형성이 적용 안됨.
//		ArrayList<Product> tvList1 = new ArrayList<Tv>; = 에러, 지네릭 데이터형 같아야한다(!!)
		//Product와 Tv는 상속 관계이나 지네릭 타입매개변수로 사용되는 상속관게에 있어도 에러
		
		List<Tv> tvList1 = new ArrayList<Tv>();	
		//List와 ArrayList는 다른 클래스인데
		//지네릭이 동일한 클래스에는 다형성이 적용
		
		productList.add(new Tv());
		productList.add(new Audio());
		//지네릭 객체에 요소 추가시 하위 객체는 추가 할 수 있음
		
		printAll(productList);
		
		
	}//main method;
	
	static void printAll(ArrayList<Product> productList) {
	    //제네릭객체를 추가하면 제네릭 하위 객체를 사용할 수 있음
		for(Product p : productList)  {
			System.out.println(p);
		}
	}
	
	
	
}//main class;


class Product{}

class Tv extends Product{}

class Audio extends Product{}