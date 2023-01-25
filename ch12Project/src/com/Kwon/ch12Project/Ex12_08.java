package com.Kwon.ch12Project;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Deprecated
@SuppressWarnings("all")  
//@SuppressWarnings("all") //value��� �ϳ��̹Ƿ� value�� ���� ���� 1111 ��ȿ���� ���� ������̼��� ���õȴ�. 
@TestInfo1(testedBy="Kwon",testDate= @DateTime1(yymmdd="170101",hhmmss="123456"))
//������ ��ҵ�(count(),testTools(),testType())�� default���� �ֱ⶧���� ���� �����ϴ�(default�� �����) 

public class Ex12_08 {//@Deprecated�� ����ؼ� deprecated ó����) 
	public static void main(String[] args) {
		
		Class<Ex12_08> cls = Ex12_08.class;
		//��� Ŭ����(Class<Ex12_08>)�� ��ü(cls)�� �ڹ������� �������� Ŭ���� ������ ��
		TestInfo1 anno = cls.getAnnotation(TestInfo1.class);
		//������̼��� ����ϴ� Ŭ������ ���Ե� ������̼� ��ü�� getAnnotation(TestInfo1.class)�� ��´�.  
		//������̼ǿ� ������ ��ҵ� ���� �˾Ƴ��� ������̼ǰ�ü.������̼� ���(�޼��� ����)
		//������̼��� ����ϴ� ��ü�� �����
		System.out.println("anno.testedBy() = "+anno.testedBy());
		System.out.println("anno.testDate().yymmdd() = "+ anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss() = "+ anno.testDate().hhmmss());
		
		for(String str : anno.testTools()) {
			System.out.println("anno.testTools() = " + str);
		}
		
		System.out.println();
		
		//getAnnotations()�� Ŭ�������Ͽ� ����ϴ� ��� ������̼��� �迭�� ��ȯ
		//��ȿ���� ���� SuppressWarnings�� �����ϰ� ��ȯ
		Annotation [] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr) {
			System.out.println(a);
		}
		
	}//main method;
}//main class;

@Retention(RetentionPolicy.RUNTIME) //����ÿ� ����(Retention���� CLASS,RUMTIME,SOURCE 3�� ����)

@interface TestInfo1{ //������̼��� ���鶧 �׳� interface�� �ƴϰ� @interface�� �Ѵ�(!!)
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit"; // �迭�ε� ���� �ϳ��̹Ƿ� {}��������
	TestType1 testType() default TestType1.FIRST;//enum ���, enum TestType{FIRST,SECOND}
	DateTime1 testDate();//testDate�� �ٸ� ��������̼�
}

@Retention(RetentionPolicy.RUNTIME) //����ÿ� ����(Retention���� CLASS,RUMTIME,SOURCE 3�� ����)
@interface DateTime1{
	String yymmdd();
	String hhmmss();
}

enum TestType1{FIRST,SECOND}