package com.Kwon.ch11Project;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_04 {
	
	static Queue q = new LinkedList(); 
	//클래스형 멤버변수(메서드를 모두 사용 가능)
	//Queue는 인터페이스이므로 직접 객체를 생성하지 못하므로
	//자기를 구현한 구현한 클래스(LinkedList())로 생성
	static final int MAX_SIZE = 5; //최근 5개
	
	public static void main(String[] args) {
		
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다");
		
		while (true) {
			System.out.println(">>");
	
			try {
				//콘솔창에서 입력 받기
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				//trim()은 문자열 앞뒤 공백을 제거
				if ("".equals(input)) {
					continue;
				}
				if (input.equalsIgnoreCase("q")) {
					System.exit(0);
				}
				else if (input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를" + MAX_SIZE +"개 보여줍니다.") ;
				}
				else if(input.equalsIgnoreCase("history")){
					int i = 0; //i는 요소 개수
					save(input);
					LinkedList tmp = (LinkedList)q;
					//Queue q는 LinkedList가 구현을 함,인터페이스 참조 변수를
					//자기를 구현한 하위 클래스 객체로 변환 할 때는 형변환이 필수!
					//LinkedList에 있는 요소에 접근을 하려면 ListIterator 객체가 필요함.
					//ListIterator객체는 LinkedList의  listIterator()메서드를 이용한다.
					ListIterator it = tmp.listIterator();
				
					while (it.hasNext()) {
						System.out.println(++i + "." + it.next());
						//남아있는 것 중에 처음 것을 반환
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
		//Queue에 저장
		if (!("".equals(input))) {
			q.offer(input);//queue에 저장시는 offer();
			
		}
		if (q.size() > MAX_SIZE) {
			q.remove();
			//queue는 FIFO(맨 처음 입력한 것이 가장 먼저 출력) 이므로
			//첫번째로 저장한 요소가 삭제
			//
		}
	}
}//main class;
