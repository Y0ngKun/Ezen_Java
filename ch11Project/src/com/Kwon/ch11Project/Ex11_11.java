package com.Kwon.ch11Project;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {

	public static void main(String[] args) {
		 //HashSet에 클래스의 객체를 add시 객체의 특정 맴버변수의 중복된 값을 피하기 위한 방법
	      HashSet set = new HashSet(); 
	      
	      boolean res = set.add("abc");
	      boolean res1 = set.add("abc");
	      //요소가 abc로 값이 같으므로 중복되어 나온것은 add실패
	      System.out.println(res);
	      System.out.println(res1);
	      System.out.println(set);
	      
	      //여러개의 멤버 변수를 갖는 클래스의 객체를 add시 그 객체의 특정 멤버 변수를 기준으로 중복 체크를 하기 위해서는
	      //Object의 equals와 hashCode메서드를 재정의 하여 비교
	      //add시 equals 와 hashCode메서드를 자바에서 호출하여 체크
	      //Person 객체를 add함
	      //new 로 생성하는 객체는 주소가 다른 객체
	      //equals와 hashCode 를 재정의 않고 Object것을 사용하면 무조건 맴버 변수의 값이 같더라도 저장
	      //맴버변수 값으로 비교하려면 equals와 hashCode를 Person클래스에서 재정의
	      set.add(new Person("David",10));
	      set.add(new Person("David",10));
	      System.out.println(set);
	   }

	}
	class Person {
	   String name;
	   int age;
	   Person(){
	    super();   
	   }
	   Person(String name,int age){
	      super();   
	      this.name=name;
	      this.age=age;
	   }
	   
	   @Override
	   public String toString() {
	      return name + ":" + age;
	   }
	   @Override
	   public boolean equals(Object obj) {
	      if (!(obj instanceof Person)) {
	         return false;
	      }
	      Person p = (Person)obj;
	      return name.equals(p.name) && age == p.age;
	   }
	   @Override
	   public int hashCode() {
	      return Objects.hash(name,age);
	      //Objects 는 java.util에 있는 Object를 편하게 처리하는 클래스
	      //hash(Object ...values)는 values를 이용하여 hashCode를 만든다
	      
	   }//main method;
	}//main class;
