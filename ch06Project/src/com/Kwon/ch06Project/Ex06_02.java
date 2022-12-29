package com.Kwon.ch06Project;

public class Ex06_02 {

	public static void main(String[] args) {
		
		//tv가 Ex06_01 Class.java 내부에 있어도 별도 클래스로 생성했고 현재 클래스와 동일 package내에 있으므로 접근 가능
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println(t1);
		System.out.println(t2);
		
		t1.channel = 7;
		
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		
		t2 = t1; 
		// t2의 값인 주소가 t1의 값인 주소로 대입
		//동일한 주소를 가진 두개의 객체가 만들어짐
		
		System.out.println(t1);
		System.out.println(t2);
                           
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		Tv[] tvArr = new Tv[] { new Tv(),new Tv(),new Tv()};
		                   
		
		
		

	}

}
