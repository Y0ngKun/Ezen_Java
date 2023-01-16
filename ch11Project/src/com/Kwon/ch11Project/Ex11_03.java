package com.Kwon.ch11Project;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class Ex11_03 {
	public static void main(String[] args) {
		
		if(args.length != 1 ) {
			System.out.println("사용방법 : ((2+3)*1)+3");
			//시작시 (로 시작하고 마지막에)을 사용
			System.exit(0);
		}
		
		Stack st = new Stack();
		String express = args[0];
		
		System.out.println("입력한 값 : " + express);
		
		try {
			
			for (int i = 0; i < express.length(); i++) {
				char ch = express.charAt(i);
				if (ch == '(') {
					st.push(ch + ""); //stack에 추가
				}//if;
				else if (ch == ')') {
					st.pop(); //stack의 맨위에서 꺼냄 (LIFO)
					//Object.pop()은 예외가 발생할 수 있음
					//예외는 Stack이 비었을 시 pop을 하면 예외
					
				}//else if;
			}//for;
			
			
			if (st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			}
			else{
				System.out.println("괄호가 일치하지 않습니다");
			}
			
		} catch (EmptyStackException e) {
			System.out.println(e.getMessage());
			System.out.println("괄호가 일치하지 않습니다");
		}

		
	}//main method;
}//main class;
