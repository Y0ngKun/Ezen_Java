package com.Kwon.ch11Project;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

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
				else if(input.equalsIgnoreCase("history")){
					int i = 0; //i�� ��� ����
					save(input);
					LinkedList tmp = (LinkedList)q;
					//Queue q�� LinkedList�� ������ ��,�������̽� ���� ������
					//�ڱ⸦ ������ ���� Ŭ���� ��ü�� ��ȯ �� ���� ����ȯ�� �ʼ�!
					//LinkedList�� �ִ� ��ҿ� ������ �Ϸ��� ListIterator ��ü�� �ʿ���.
					//ListIterator��ü�� LinkedList��  listIterator()�޼��带 �̿��Ѵ�.
					ListIterator it = tmp.listIterator();
				
					while (it.hasNext()) {
						System.out.println(++i + "." + it.next());
						//�����ִ� �� �߿� ó�� ���� ��ȯ
					}
				}
				else {
					save(input);
					System.out.println(input);
				}
			}//try;
			
			catch (Exception e) {
				e.printStackTrace();
				
			}//catch;
			
		}//while;
		

	}//main method;
	static void save(String input) {
		//Queue�� ����
		if (!("".equals(input))) {
			q.offer(input);//queue�� ����ô� offer();
			
		}
		if (q.size() > MAX_SIZE) {
			q.remove();
			//queue�� FIFO(�� ó�� �Է��� ���� ���� ���� ���) �̹Ƿ�
			//ù��°�� ������ ��Ұ� ����
			//
		}
	}
}//main class;
