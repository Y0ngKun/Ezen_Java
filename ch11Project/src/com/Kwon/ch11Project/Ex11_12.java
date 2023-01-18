package com.Kwon.ch11Project;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {

	public static void main(String[] args) {
		
		HashSet setA = new HashSet(); //기본집합1
		HashSet setB = new HashSet(); //기본집합2
		HashSet setHab = new HashSet(); // 합집합
		HashSet setKyo = new HashSet(); // 교집합
		HashSet setCha = new HashSet(); // 차집합
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		
		System.out.println("A = " + setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		
		System.out.println("B = "+setB);
		
		
		//set의 요소를 하나씩 비교하기 위해 Iterator객체 생성
		Iterator it = setB.iterator();
		//교집합 구하기
		while (it.hasNext()) { //hasNext는 접근할 요소가 있냐 없냐 판단 후 있으면 true 리턴
			Object tmp = it.next();
			if (setA.contains(tmp)) {
				//.contains(x) x가 포함되어있는지 확인하는 메서드
				setKyo.add(tmp);	
			}//if;
		}//while;
		
		
		//차집합 구하기
		it = setA.iterator();
		while (it.hasNext()) { //hasNext는 접근할 요소가 있냐 없냐 판단 후 있으면 true 리턴
			Object tmp = it.next();
			if (!setB.contains(tmp)) {
				//.contains(x) x가 포함되어있는지 확인하는 메서드
				setCha.add(tmp);
			}//if;
		}//while;
		
		
		//합집합 구하기 A
		it = setA.iterator();
		while (it.hasNext()) { //hasNext는 접근할 요소가 있냐 없냐 판단 후 있으면 true 리턴
			setHab.add(it.next());
		}//while;
		
		//합집합 구하기 B
		it = setB.iterator();
		while (it.hasNext()) { //hasNext는 접근할 요소가 있냐 없냐 판단 후 있으면 true 리턴
			setHab.add(it.next());
		}//while;
		
		
		System.out.println("==구분선==");
		
		
		System.out.println("setA = "+setA);
		System.out.println("setB = "+setB);
		System.out.println("setA ∩ setB = "+ setKyo);
		//사용 가능한 특수문자는 한글 ㄷ을 친 후 한자를 클릭하여 선택
		System.out.println("setA ∪ SetB= "+setHab);
		System.out.println("setA - SetB= "+setCha);
		
		
		

		
		
		
	}//main method;
}//main class;
