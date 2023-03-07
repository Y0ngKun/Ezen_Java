package com.Kwon.ch15Project;

public class DKEJE {
	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		System.out.println((x>3)&&(x<10));
		System.out.println((x>3)||(x<4));
		System.out.println((x>3)&&(x<10));
		System.out.println(((x>3)&&(x<10)) != ((x>3)&&(x<10)));
		System.out.println(x=x%2);
		
		String str1 = "kook";
		String str2 = new String("kook");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		int a = 11;
		int b = 22;
		String result = ( (a>b)?"a가 큼":"a가 작음" );
		System.out.println(result);
		
		
		
	}
}
