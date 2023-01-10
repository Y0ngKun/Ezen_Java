package com.Kwon.ch09Project;

public class Ex09_02 {

	public static void main(String[] args) {
		
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		//참조 변수값(주소값)은 다름
		//저장된 값(8011081111222L)은 값음
		
		
		//equals()메서드는 Person클래스에서 Object것을 메서드
		//때문에 값을 비교해서 값이 같으므로 true가 나온다.
		if (p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다");
		}
		else {
			System.out.println("p1과 p2는 다른 사람입니다");
		}
		
		p1.test("Kwon");
		p1.test1("Kwon");
		
		
	}//main method;

}//main class;

class Person{ //extends Object 생략된 상태
	long id;
	Person(){super();}
	Person(long id){super();this.id = id;}
	
	//상속한 Object의 equals()메서드를 재정의해서 사용한다
	@Override
	public boolean equals(Object obj)/*헤더는 Object의 헤더를 꼭!!그대로 사용해야 한다*/ {
		if (obj instanceof Person) {
			//Person클래스로 만든 객체시에만 비교, 다른 클래스로 만든 객체는 무조건 false
			return id == ((Person)obj).id; 
			//obj는 상위 클래스인 Object의 객체이므로 하위 클래스인 Person의 멤버를 사용하려면
			//하위 클래스로 형변을 해줘야하만 사용 가능하다 = ((Person)obj);
		}//if;
		return false;
		} //public boolean equals(Object obj);
	
	
	public void test(Object obj) {
		String str = (String)obj;//하위클래스인 문자열을 받아서 상위클래스 obj를 문자열로 변환
		//obj는 하위클래스의 모든 메서드나 멤버변수를 사용
		System.out.println("str은 : "+ str);
		//실제 받은 obj는 String이고 Stirng에는 toString()이 정의 되었다
		System.out.println("obj " + obj);
	}
	
	public void test1(String str) {
		Object obj = str; //하위클래스를 사용하면 Object의 멤버만 사용가능
		//파라메터가 아닌 것을 상위 클래스에 대입하면 실제 대입된 객체의 멤버 사용
		System.out.println("obj의 값 : " + obj);
	}

}//class Person;

