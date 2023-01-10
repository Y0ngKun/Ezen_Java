package com.Kwon.ch09Project;

public class Ex09_02 {

	public static void main(String[] args) {
		
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		//���� ������(�ּҰ�)�� �ٸ�
		//����� ��(8011081111222L)�� ����
		
		
		//equals()�޼���� PersonŬ�������� Object���� �޼���
		//������ ���� ���ؼ� ���� �����Ƿ� true�� ���´�.
		if (p1.equals(p2)) {
			System.out.println("p1�� p2�� ���� ����Դϴ�");
		}
		else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�");
		}
		
		p1.test("Kwon");
		p1.test1("Kwon");
		
		
	}//main method;

}//main class;

class Person{ //extends Object ������ ����
	long id;
	Person(){super();}
	Person(long id){super();this.id = id;}
	
	//����� Object�� equals()�޼��带 �������ؼ� ����Ѵ�
	@Override
	public boolean equals(Object obj)/*����� Object�� ����� ��!!�״�� ����ؾ� �Ѵ�*/ {
		if (obj instanceof Person) {
			//PersonŬ������ ���� ��ü�ÿ��� ��, �ٸ� Ŭ������ ���� ��ü�� ������ false
			return id == ((Person)obj).id; 
			//obj�� ���� Ŭ������ Object�� ��ü�̹Ƿ� ���� Ŭ������ Person�� ����� ����Ϸ���
			//���� Ŭ������ ������ ������ϸ� ��� �����ϴ� = ((Person)obj);
		}//if;
		return false;
		} //public boolean equals(Object obj);
	
	
	public void test(Object obj) {
		String str = (String)obj;//����Ŭ������ ���ڿ��� �޾Ƽ� ����Ŭ���� obj�� ���ڿ��� ��ȯ
		//obj�� ����Ŭ������ ��� �޼��峪 ��������� ���
		System.out.println("str�� : "+ str);
		//���� ���� obj�� String�̰� Stirng���� toString()�� ���� �Ǿ���
		System.out.println("obj " + obj);
	}
	
	public void test1(String str) {
		Object obj = str; //����Ŭ������ ����ϸ� Object�� ����� ��밡��
		//�Ķ���Ͱ� �ƴ� ���� ���� Ŭ������ �����ϸ� ���� ���Ե� ��ü�� ��� ���
		System.out.println("obj�� �� : " + obj);
	}

}//class Person;

