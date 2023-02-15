package com.Kwon.ch14Project;

public class Prac230214 {
	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		
		System.out.println("str = "+str);
		
		Student s1 = new Student();
		s1.name ="홍길동";
		s1.ban = 1;
		s1.no = 1;
		s1.kor = 100;
		s1.eng = 60;
		s1.math = 76;
		
		System.out.println("이름 : " + s1.name);
		System.out.println("총점 : " + s1.getTotal());
		System.out.println("평균 : " + s1.getAverage());
		

	}//main method;
}//main class;

class Student{
	String name; //학생 이름
	int ban; //반
	int no; //번호
	int kor; //국어점수
	int eng; //영어점수
	int math; //수학점수
	
	Student(){}
	
	Student(String name,int ban,int no,int kor,int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info(){
		return (name+",") + (ban+",") + (no+",") +(kor+eng+math+",")+((kor+eng+math)/3);
	}
	
	int getTotal(){
		int total = kor+eng+math;
		return total;
	}
	float getAverage() {
		float avg = (float)(((kor+eng+math)/3));
		return avg;
	}
	
}//class Student


