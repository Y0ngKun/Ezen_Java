package com.Kwon.ch06Project;



public class Ex06_10  {
	
	public static void main(String[] args) {
		
		MyMath3 mm = new MyMath3();
		System.out.println();
		System.out.print(mm.add(3,3));
		System.out.println();
		System.out.print(mm.add(3,3L));
		System.out.println();
		System.out.print(mm.add(3L,3));
		System.out.println();
		System.out.print(mm.add(3L,3L));
		System.out.println();
		
		int[] a = {1,2,3};
		System.out.print(mm.add(a));
		System.out.println("요소 개수 : " + mm.add(a));

	}//main;

}//Ex06_10 class;

class MyMath3{
	int add(int a, int b) {return a+b;}
	long add(int a, long b) {return a+b;}
	long add(long a, int b) {return a+b;}
	long add(long a, long b) {return a+b;}
	int add(int[] a) {
	for(int x : a) {
		System.out.println(x);
		} 
	return a.length;
	}
}//MyMath3;
