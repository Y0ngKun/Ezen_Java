package com.Kwon.ch12Project;

@TestInfo(
		count = 3,testedBy="kwon",testTools= {"JUnit","AutoTester"},testType=TestType.FIRST,
				testDate = @DateTime(yymmdd="160101",hhmmss="230125")
	)
public class Ex12_makeAnnotation {
	public static void main(String[] args) {
		
		System.out.println("������̼� Ȱ��");
		
		
	}//main method;
}//main class;

@interface TestInfo{//@interface�� ������̼� ����
	//�߻�޼��� �������� ������̼ǿ��� ����� ��Ҹ� �����
	//��, �Ķ��Ÿ�� �������
	int count() default 1;
	String testedBy();
	String[] testTools();
	TestType testType();//enum ���, enum TestType{FIRST,SECOND}
	DateTime testDate();//testDate�� �ٸ� ��������̼�
}

enum TestType{
	FIRST,SECOND
}

@interface DateTime{
	//�������̽� ������Ҵ� �߻�޼��� ����
	String yymmdd();
	String hhmmss();
}