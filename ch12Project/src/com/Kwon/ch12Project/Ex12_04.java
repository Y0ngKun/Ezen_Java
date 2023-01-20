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
	//파라메터로 제네릭으로된 객체를 사용시에도 다형성 가능
	//static메서드에는 타입문자 T,E등은 사용 못하나
	//실제 값이 대입된 제네릭 타입변수는 사용가능
	static Juice makeJuice (FruitBox2 < ? extends Fruit2> box) {
		//Fruit2를 포함한 모든 자손 객체값을 사용 가능,즉 메서드의 타입변수는 다형성이 성립된다.
		String tmp = "";
		
		for(Fruit2 f : box.getList())
			tmp += f + " ";
			return new Juice(tmp);
		
	}//makeJuice;
	
}//class Juicer;



public class Ex12_04 {
	public static void main(String[] args) {
		
		//FruitBox2의 제네릭 <T extends Fruit2>
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		//Fruit2의 자손인 Apple2를 제네릭으로 사용
		

	    //상위 제네릭 변수인 Fruit2를 사용한 fruitBox는 하위 객체를 사용할 수 있음
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
	     //하위클래스인 Apple2를 제네릭으로 사용하면 상위와 다른 객체는 사용할 수 없음
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
	ArrayList<T> list = new ArrayList<T>(); //list 생성시 <T> 사용
	void add(T item) {list.add(item);}//인스턴스 메소드의 메라메타로 사용 
	T get(int i) {return list.get(i);}
	ArrayList<T> getList(){return list;}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}//class Box2;



