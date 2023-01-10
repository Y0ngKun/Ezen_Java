package com.Kwon.ch09Project;

public class Ex09_01 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		//v1과 v2는 참조변수(주소)가 다르다
		//하지만 객체의 저장된 값은 int 10으로 똑같다
		
		//equals 메소드는 Object의 메서드 이므로 주소를 비교한다
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같다.");
		}
		else {System.out.println("v1과 v2는 다르다.");}
	
	}//main method;
}//main class;

class Value {// 상속한 것이없으므로 extends Object가 생략된 상태
	int value;
	Value() {super();/*super는 Object 생성자*/}
	//생성자
	Value(int value){this.value = value;}
}//class Value;
