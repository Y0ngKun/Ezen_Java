package com.Kwon.ch14Project;

public class Prac230214 {
	public static void main(String[] args) {
		
		Student s = new Student("ȫ�浿", 1, 1, 100, 60, 76);
		
		String str = s.info();
		
		System.out.println("str = "+str);
		
		Student s1 = new Student();
		s1.name ="ȫ�浿";
		s1.ban = 1;
		s1.no = 1;
		s1.kor = 100;
		s1.eng = 60;
		s1.math = 76;
		
		System.out.println("�̸� : " + s1.name);
		System.out.println("���� : " + s1.getTotal());
		System.out.println("��� : " + s1.getAverage());
		

	}//main method;
}//main class;

class Student{
	String name; //�л� �̸�
	int ban; //��
	int no; //��ȣ
	int kor; //��������
	int eng; //��������
	int math; //��������
	
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


