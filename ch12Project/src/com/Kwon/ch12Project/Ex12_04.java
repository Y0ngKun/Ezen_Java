package com.Kwon.ch12Project;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Fruit2                {public String toString() {return "Fruit";}}
class Apple2 extends Fruit2 {public String toString() {return "Apple";}}
class Grape2 extends Fruit2 {public String toString() {return "Grape";}}

class Juice{
	String name;
	
	Juice(String name){this.name = name + "Juice";}
	public String toString() {return name;}
	
}//class Juice;

class Juicer{
	//�Ķ���ͷ� ���׸����ε� ��ü�� ���ÿ��� ������ ����
	//static�޼��忡�� Ÿ�Թ��� T,E���� ��� ���ϳ�
	//���� ���� ���Ե� ���׸� Ÿ�Ժ����� ��밡��
	static Juice makeJuice (FruitBox2 < ? extends Fruit2> box) {
		//Fruit2�� ������ ��� �ڼ� ��ü���� ��� ����,�� �޼����� Ÿ�Ժ����� �������� �����ȴ�.
		String tmp = "";
		
		for(Fruit2 f : box.getList())
			tmp += f + " ";
			return new Juice(tmp);
		
	}//makeJuice;
	
}//class Juicer;



public class Ex12_04 {
	public static void main(String[] args) {
		
		//FruitBox2�� ���׸� <T extends Fruit2>
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		//Fruit2�� �ڼ��� Apple2�� ���׸����� ���
		

	    //���� ���׸� ������ Fruit2�� ����� fruitBox�� ���� ��ü�� ����� �� ����
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
	     //����Ŭ������ Apple2�� ���׸����� ����ϸ� ������ �ٸ� ��ü�� ����� �� ����
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		Juicer.makeJuice(fruitBox);
		Juicer.makeJuice(appleBox);
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
		
		
	}//main method;
}//main class;

class FruitBox2 <T extends Fruit2> extends Box2<T> {}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>(); //list ������ <T> ���
	void add(T item) {list.add(item);}//�ν��Ͻ� �޼ҵ��� �޶��Ÿ�� ��� 
	T get(int i) {return list.get(i);}
	ArrayList<T> getList(){return list;}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}//class Box2;



