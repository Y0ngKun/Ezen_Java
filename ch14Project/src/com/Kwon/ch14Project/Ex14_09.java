package com.Kwon.ch14Project;

import java.util.Optional;
import java.util.OptionalInt;

//Optional Ŭ���� ���
//Optional<T>�� wrapper class�� ��� ��ü�� ���Ѵ�(���� �� �� �ִ�)
//Optional�� ����ϸ� nulló���� if���� ���� �ʰ� Optional�� �޼���� ������ ó�� �� �� �ִ�.
//Streamó�� ����
public class Ex14_09 {
	
	public static void main(String[] args) {
		
		Optional<String> optStr = Optional.of("abcde");
		Optional<Integer> optInt = optStr.map(String::length);
		
		//Optional�� ���� ���� get()���� ���ϳ� null üũ�� �������� �ʴ´�.
		System.out.println("optStr = " + optStr.get());
		System.out.println("optInt = " + optInt.get());
		
		Optional<String> optStr1 = null;
//		System.out.println("optStr1 = " + optStr1.get() );
		//optStr1�� null�̹Ƿ� get()���� NullPointerException ���� �߻�
		
		
		int result = Optional.of("123")
				.filter(x-> x.length() > 0)
				.map(Integer::parseInt)
				.get();
		System.out.println("result = " + result);
		
		OptionalInt optInt1 = OptionalInt.of(0);
		//Optional��ü�� OptionalInt�� 0�� ����
		OptionalInt optInt2 = OptionalInt.empty();
		//�� ��ü�� ����, -���� getAsInt()�� ��ȯ�� ���� �߻�
		System.out.println("optInt1 = "+optInt1.getAsInt()); //0
		//OptionalInt������ get()��� getAsInt()�� ����.

		//System.out.println("optInt2 = "+optInt2.getAsInt());
		//optInt2�� empty�� null�̹Ƿ� getAsInt()����  NoSuchElementException ���� �߻�
		
		System.out.println("optInt1 = " + optInt1);
		System.out.println("optInt2 = " + optInt2);
		System.out.println("optInt1.equals(optInt2) = " + optInt1.equals(optInt2));
		//0�� empty() ��, ����� false
		
	}//main method;
}
