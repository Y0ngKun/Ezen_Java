package com.Kwon.ch09Project;

public class Ex09_12 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("01");
		//생성자중 문자열을 파라메터로 갖는 생성자(문자열 + 16개 문자 수용 char 배열 만들어 처리)
		//new StringBuffer(); 이때는 초기화 문자열 없이 크기가 16(char 배열 개수)인 char배열을 만들어 처리
		//new StringBuffer(int length)는 초기화 문자열은 없이 char 배열 크기만 지정
		System.out.println(sb);
		StringBuffer sb2 = sb.append(23);
		System.out.println(sb);
		sb.append('4').append(56);
		//append는 파라메터로 모든 데이터형을 사용 할 수 있는 오버로딩된 메서드이고 자기 자신을 리턴한다
		//sb2와 sb는 주소가 같은 객체
		//sb의 값이 변경되면 sb2도 똑같이 값 변경된다 , 주소가 똑같기 때문에;
		//append는 chaining방식(메서드를 계속 연결 사용)
		System.out.println(sb);
		StringBuffer sb3 = sb.append(56);
		sb.append(9.0);
		System.out.println(sb);
		
		System.out.println("sb = " + sb);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb3 = " + sb3);
		
		System.out.println("sb = " + sb.deleteCharAt(0));
		//색인번호 n번에 있는 문자 하나를 삭제하고 리턴
		System.out.println("sb = " + sb.delete(3,6));
		//색인번호 (n번,n번)에 있는 문자들을 삭제하고 리턴
		System.out.println("sb = " + sb.insert(0,"9"));
		//색인번호 0번에 9를 삽입한다
		System.out.println("sb = " + sb.replace(1, sb.length(), "END"));
		//색인번호 1번부터 크기-1(마지막 색인번호)까지 END로 교체
		System.out.println("sb.capacity = " + sb.capacity());
		//버퍼의 크기
		System.out.println("sb.length = " + sb.length());
		//문자의 개수
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		//boolean값의 문자열 true,false는 boolean으로 변환
		boolean b1 = Boolean.getBoolean("true");
		//true여도 false나온다 / ???????????
		System.out.println(b1);
		
		
		System.out.println(sb.reverse());
		//문자열의 순서를 거꾸로 출력

		
	}

}
