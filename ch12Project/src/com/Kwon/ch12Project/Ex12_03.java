package com.Kwon.ch12Project;

import java.util.ArrayList;

class Fruit implements Eatable{public String toString() {return "Fruit";} }

class Apple extends Fruit{@Override public String toString() {return "Apple";}}
class Grape extends Fruit{@Override public String toString() {return "Grape";}}
class Toy {@Override public String toString() {return "Toy";}}

interface Eatable{}

public class Ex12_03 {
	public static void main(String[] args) {
		
		//FruitBox�� ���׸��� <T extends Fruit & Eatable>�� ���ǵ�
		//Fruit���� ���� Ŭ�����̸� �������̽� Eatable�� ������ Ŭ������ Ÿ�Ժ����� ��밡��
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>(); //Fruit �ļ��̹Ƿ� ����
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>();  //���� Ÿ�� ����ġ
//		FruitBox<Toy> toyBox = new FruitBox<Toy>(); // ����
		
		//����Ÿ�� ���ҿ� ���� �߰��ô� ��Ӱ��迡 �ִ� ���� ����
		//Box<T>�� add�޼��� ����Ͽ� Fruit�� ����� ��ü�� �����Ͽ� ArrayList�� ����
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); //���� Grape�� Apple�� �ڼ��� �ƴ�
		grapeBox.add(new Grape());
		
		
		System.out.println("fruitBox"+fruitBox);
		System.out.println("appleBox"+appleBox);
		System.out.println("grapeBox"+grapeBox);
		
		
	}//main method;
}//main class;

class FruitBox <T extends Fruit & Eatable> extends Box<T> {}
	//���׸��� ��Ӱ���� �������踦 �̿��Ͽ� ���� �� �� ����
	//�� �� extendsŰ����� ���� (�ڽ� ���� ���� Ŭ����)
	//Box <T> �� ����Ͽ� Box�� �޼��� ��� ����

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}//�ν��Ͻ� �޼ҵ��� �޶��Ÿ�� ��� 
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}



