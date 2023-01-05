package com.Kwon.ch07Project;

public class Ex_Product_Prac {

	public static void main(String[] args) {
		
		
		
		Buyer1 b = new Buyer1();
		
		Television1 tv = new Television1();
		Computer1 com = new Computer1();
		Audio1 audio = new Audio1();
		
		Product1 p = new Product1();
		Product1 p1 = new Television1();
		Product1 p2 = new Computer1();
		Product1 p3 = new Audio1();
		
//		void buy (Product p) {
//			money -= p.price;
//			bonusPoint += p.bonusPoint;
//			
//		}
		
		
		
		

	}//main method;;

}// main class;;


class Product1{
	int price;
	int bonusPoint;
	
}

class Television1 extends Product1{}
class Computer1 extends Product1{}
class Audio1 extends Product1{}

class Buyer1{
	int money = 1000;
	int bonusPoint = 0;
}



