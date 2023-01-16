package com.Kwon.ch11Project;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class Ex11_03 {
	public static void main(String[] args) {
		
		if(args.length != 1 ) {
			System.out.println("����� : ((2+3)*1)+3");
			//���۽� (�� �����ϰ� ��������)�� ���
			System.exit(0);
		}
		
		Stack st = new Stack();
		String express = args[0];
		
		System.out.println("�Է��� �� : " + express);
		
		try {
			
			for (int i = 0; i < express.length(); i++) {
				char ch = express.charAt(i);
				if (ch == '(') {
					st.push(ch + ""); //stack�� �߰�
				}//if;
				else if (ch == ')') {
					st.pop(); //stack�� �������� ���� (LIFO)
					//Object.pop()�� ���ܰ� �߻��� �� ����
					//���ܴ� Stack�� ����� �� pop�� �ϸ� ����
					
				}//else if;
			}//for;
			
			
			if (st.isEmpty()) {
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			}
			else{
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�");
			}
			
		} catch (EmptyStackException e) {
			System.out.println(e.getMessage());
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�");
		}

		
	}//main method;
}//main class;
