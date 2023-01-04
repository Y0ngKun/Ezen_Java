package com.Kwon.ch07Project;

public class Ex07GetSet {
	public static void main(String[] args) {
		
		TimeDTO dto = new TimeDTO(12,35,40);
		
		//int hour = dto.getHour(); TimeDTO 멤버변수들은 모두 접근제어자가 private이므로 접근이 불가
		//접근은 접근제어자가 public인 메서드를 통해서 접근
		//멤버변수값은 get메서드로 얻고 설정(변경)은 set메서드로 해준다
		System.out.println("hour = "+ dto.getHour());
		System.out.println("minute = " + dto.getMinute());
		System.out.println("second = " + dto.getSecond());
		
		//값을 변경시는 해당 멤버변수의 set메서드를 사용한다
		dto.setHour(10);
		dto.setMinute(55);
		dto.setSecond(59);
		System.out.println("hour = "+ dto.getHour());
		System.out.println("minute = " + dto.getMinute());
		System.out.println("second = " + dto.getSecond());
	}
	

}
