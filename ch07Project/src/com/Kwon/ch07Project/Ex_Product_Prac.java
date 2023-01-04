package com.Kwon.ch07Project;

public class Ex_Product_Prac {

	public static void main(String[] args) {
		
		
		
		Buyer b = new Buyer();
		
		Television tv = new Television();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		Product p = new Product();
		Product p1 = new Television();
		Product p2 = new Computer();
		Product p3 = new Audio();
		
//		void buy (Product p) {
//			money -= p.price;
//			bonusPoint += p.bonusPoint;
//			
//		}
		
		
		
		

	}//main method;;

}// main class;;


class Product{
	int price;
	int bonusPoint;
	
}

class Television extends Product{}
class Computer extends Product{}
class Audio extends Product{}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
}



