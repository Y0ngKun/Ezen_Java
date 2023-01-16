package com.Kwon.ch11Project;
import java.util.*;

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
			}//try;
			
			catch (Exception e) {
				e.printStackTrace();
			}//catch;
			
		}//while;
		

	}//main method;
}//main class;
