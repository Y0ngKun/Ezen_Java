package com.Kwon.ch12Project;

import java.util.ArrayList;
import java.util.List;

public class Ex12_01 {
	public static void main(String[] args) {
		
		ArrayList<Product> productList = new ArrayList</*<Product> �ڹ� 8���� �����ڿ��� ���׸� ���� ����,�� <> �� �⺻���� ���� �Ұ�*/>();
		//�������� ���׸����� �ڹ�8���� �������� ���� ����, �� <>�� �����Ұ�
		//���׸��� ���� ���������� ������ ���������̾�߸� �Ѵ�(�⺻���� �Ұ�)
		//Class ArrayList<E>�� ���ǵ�
		
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		//���׸����� ���Ǵ� Ÿ�Ժ����� �������� ���� �ȵ�.
//		ArrayList<Product> tvList1 = new ArrayList<Tv>; = ����, ���׸� �������� ���ƾ��Ѵ�(!!)
		//Product�� Tv�� ��� �����̳� ���׸� Ÿ�ԸŰ������� ���Ǵ� ��Ӱ��Կ� �־ ����
		
		List<Tv> tvList1 = new ArrayList<Tv>();	
		//List�� ArrayList�� �ٸ� Ŭ�����ε�
		//���׸��� ������ Ŭ�������� �������� ����
		
		productList.add(new Tv());
		productList.add(new Audio());
		//���׸� ��ü�� ��� �߰��� ���� ��ü�� �߰� �� �� ����
		
		printAll(productList);
		
		
	}//main method;
	
	static void printAll(ArrayList<Product> productList) {
	    //���׸���ü�� �߰��ϸ� ���׸� ���� ��ü�� ����� �� ����
		for(Product p : productList)  {
			System.out.println(p);
		}
	}
	
	
	
}//main class;


class Product{}

class Tv extends Product{}

class Audio extends Product{}