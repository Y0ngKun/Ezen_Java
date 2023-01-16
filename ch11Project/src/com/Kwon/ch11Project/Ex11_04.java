package com.Kwon.ch11Project;
import java.util.*;

public class Ex11_04 {
	
	static Queue q = new LinkedList(); 
	//Ŭ������ �������(�޼��带 ��� ��� ����)
	//Queue�� �������̽��̹Ƿ� ���� ��ü�� �������� ���ϹǷ�
	//�ڱ⸦ ������ ������ Ŭ����(LinkedList())�� ����
	static final int MAX_SIZE = 5; //�ֱ� 5��
	
	public static void main(String[] args) {
		
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�");
		
		while (true) {
			System.out.println(">>");
	
			try {
				//�ܼ�â���� �Է� �ޱ�
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				//trim()�� ���ڿ� �յ� ������ ����
				if ("".equals(input)) {
					continue;
				}
				if (input.equalsIgnoreCase("q")) {
					System.exit(0);
				}
				else if (input.equalsIgnoreCase("help")) {
					System.out.println("help - ������ �����ݴϴ�.");
					System.out.println("q �Ǵ� Q - ���α׷��� �����մϴ�.");
					System.out.println("history - �ֱٿ� �Է��� ��ɾ" + MAX_SIZE +"�� �����ݴϴ�.") ;
					
				}
			}//try;
			
			catch (Exception e) {
				e.printStackTrace();
			}//catch;
			
		}//while;
		

	}//main method;
}//main class;
