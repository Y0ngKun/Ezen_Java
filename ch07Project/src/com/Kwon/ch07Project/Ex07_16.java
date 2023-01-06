package com.Kwon.ch07Project;

public class Ex07_16 {

	public static void main(String[] args) {
		OuterEx0716 out = new OuterEx0716();
		OuterEx0716.Inner Inner = out.new Inner();
		// 외부클래스의 내부클래스 데이터형은 외부클래스명.내부클래스명
		Inner.method();

	}

}

class OuterEx0716 {

	// 변수 이름들이 같을시에 this
	int value = 10;

	class Inner {
		int value = 11;

		void method() {
			int value = 12; // 내부 클래스 Inner의 로컬변수
			System.out.println("value " + value);
			// method()안의 로컬변수 value ->12가 나옴
			System.out.println("tis.value" + this.value);
			// this는 자신의 클래스의 객체(메서드에 자종 저장된 로칼객체->11이 나옴)
			System.out.println("OuterEx0716.this.value : " + OuterEx0716.this.value);
			// OuterEx0716의 value ->10이 나옴
		}
	}
}
