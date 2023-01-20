package com.Kwon.ch12Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex12_02 {

	public static void main(String[] args) {
		
		//List객체의 테이터 요소는 Student의 객체들이다.
		ArrayList<Student> list = new ArrayList<Student>(); 
		//ArrayList의 멤버(변수, 메서드)중 지네릭을 사용하는 모든 것들은 Student를 지네릭으로 사용
		//대표적인 메서드 public, boolean, add(E e)도 지네릭 E를 사용하므로 여기서는 Student사용
		
		list.add(new Student("자바왕", 1, 1));
		list.add(new Student("자바짱", 1, 2));
		list.add(new Student("홍길동", 2, 1));
		//list.add("Kook"); Student객체가 아닌 문자열을 사용하므로 에러
		
		Iterator<Student> it = list.iterator();
		//Iterator도 제네릭 인터페이스 이므로 이를 생성하는 list객체의 제네릭파라메터를 사용하여 선언
		//Interface Iterator<E>
		while (it.hasNext()) {
			Student s = it.next(); //제네릭사용자는 형변환 필요없음
			//E next()
			System.out.println(s.name); 
		}
		
		Map<String, Student> map = new HashMap<String, Student>();
		Student s0 = map.put("stu1", new Student("자바0", 1, 1));
		Student s1 = map.put("stu2", new Student("자바1", 1, 1));
		Student s2 = map.put("stu3", new Student("자바2", 1, 1));
	
		
	}//main method;
}//main class;


class Student{
	//멤버가 인스턴스형, 접근제어자는 default로 동일한 패키지에서는 어디서나 접근
	String name = "";
	int ban; //초기값 0
	int no; //초기값 0
	Student(String name, int ban, int no){
		super();
		this.name =name;
		this.ban =ban;
		this.no =no;
		
	}//Student method;
	
}//class Student;

