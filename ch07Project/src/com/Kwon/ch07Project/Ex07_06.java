package com.Kwon.ch07Project;

import static java.lang.System.out;//System클래스의 클래스 멥버변수인 out 사용시 System 생략하고 out으로 바로 사용가능
import static java.lang.Math.*; //*은 모든 클래스형 멤버변수와 멤버메서드를 선택한다.(단 하위 패키지의 클래스는 선택못한다)

public class Ex07_06 {
	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(random());
		System.out.println(Math.PI);
	}

}
