package com.Kwon.ch12Project;

enum Direction {EAST, SOUTH, WEST, NORTH}
//enum은 상수들의 집합이므로 이름을 모두 대문자로 작성
//값은 자동으로 0부터 1씩 증가하여 각각 상수에 주어짐

public class Ex12_05 {

	public static void main(String[] args) {
		
		//enum형 참조변수 선언은 클래스처럼 해줌, enum명 참조변수 이름
		//enum형 값은 enum이름.상수 이름으로 표시(클래스형 변수처럼 접근)
		Direction d1 = Direction.EAST; //값은 0
		Direction d2 = Direction.valueOf("WEST"); //값은 2
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		//enum 객체는 상수명을 가짐
		System.out.println("d1 : "+d1);
		System.out.println("d2 : "+d1);
		System.out.println("d3 : "+d1);
		
		//enum객체 비교는 동일 비교는 == ,compareTo()사용
		//다른 비교 연산자는 사용 불가 >,<,>=,<= 등등
		System.out.println("d1 == d2 ? : " + (d1==d2));
		System.out.println("d1 == d3 ? : " + (d1==d3));
		//equal()도 사용 가능
		System.out.println("d1.equals(d3) : " + d1.equals(d3));
//		System.out.println("d2 < d3 ? : " + d2<d3); //에러 
		
		//compareTo 사용 가능 앞객체-뒷객체(0,-,+)
		//compareTo는 enum상수의 값을 비교
		//enum객체는 Enum객체임 (상속관계)
		System.out.println("d1.compareTo(d3) ? : "+ d1.compareTo(d3));
		System.out.println("d1.compareTo(d2) ? : "+ d1.compareTo(d2));
		
		
		switch(d1){//switch case 문에 사용시는 상수 이름만 사용(enum이름.상수 사용불가)
		case EAST : System.out.println("The direction is EAST"); break;
		case SOUTH : System.out.println("The direction is SOUTH"); break;
		case WEST : System.out.println("The direction is EAST"); break;
		case NORTH : System.out.println("The direction is EAST"); break;
		default : System.out.println("Invalid direction");
		}//switch;
		
		
		Direction[] dArr = Direction.values();
		//values()는 enum명으로 접근(static형),enum배열로 반환(enum형 Enum객체)
		//values와 valueOf는 static처럼 enum이름으로 접근
		for(Direction d : dArr) {
			//name()과 ordinal()메서드는 최상위 클래스 Enum이 제공하는 메서드
			//ordinal()은 숫자값(상수값)반환
			System.out.printf("%s=%d%n",d.name(), d.ordinal());
			//enum 객체.name()은 상수명, enum 객체.ordinal()은 요소번호(!!)
		}//for;

	}//main method;
}//main class;
