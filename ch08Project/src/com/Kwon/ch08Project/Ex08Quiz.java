package com.Kwon.ch08Project;

public class Ex08Quiz {
	public static void main(String[] args) {
		int[] myNumber = {1,2,3,4,5};
		System.out.println(myNumber[10]);

		try {
			System.out.println(myNumber[10]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외 : "+e.getMessage());
		} finally {
			System.out.println("try-catch문 종료");
		}

	}// main method;
	static void checkAge(int age){
		if (age < 18) {
			try {
				ArithmeticException ae = new ArithmeticException("예외발생 ae");
				throw ae;
			}
			catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println("ae예외" + e.getMessage());
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("ae예외" + e.getMessage());
			}
			finally {
				System.out.println("try-catch 종료");
			}
			checkAge(22);
		}
		else {System.out.println("18세 이상이므로 충분");}
		}

}// main class;

/*
 * 1. int배열 myNumber를 요소값 1,2,3,4,5 리터럴을 갖도록 생성한다. 2. myNumber의 색인번호 10번 요소를
 * 출력해라 3. 예외가 발생하면 예외처리를 하는데 printstackTrace();와 예외내용(예외내용반환 메서드 사용)을출력하라 4. 예외
 * 발생시나 미발생시에 실행블록을 만들고 내용은 try-catch문 종료 5. main메서드안에서 이름으로 바로 호출하는 checkAge는
 * 리턴타입은 void, 파라메타는 int age로 하며 구현 내용은 age가 18미만이면 ArithmeticException예외를
 * (예외내용) "예외 발생"으로 하여 생성하여 예외를 발생시키고 예외 처리를 해줌, 예외 처리 내용은 3번 처럼 해줌 6. age가
 * 18이상이면 18세 이상이므로 충분 출력
 */