package com.Kwon.ch07Project;

//캡슐화를 위한 클래스
public class TimeDTO {
	//캡슐화를 위해서는 다른 멤버변수를 바로 접근이 불가능한 private
	//멤버변수 접근은 getter와 setter메서드를 통해서 함
	//private 접근제어자는 자기 클래스내에서만 접근
	private int hour;
	private int minute;
	private int second;
	
	
	//이클립스 제공 getter, setter, 생성자 만들어주기 활용
	//대상 클래스에 이름을 선택해서 우클릭하고
	
	
	//source->generate constructor using superclass
	//기본 생성자
	public TimeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//source->generate constructor using fields
	//모든 멤버변수를 사용하는 생성자
	public TimeDTO(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//source->generate getters and setters
	//각 멤버변수에 대한 get메서드와, set메서드
	//get메서드는 멤버변수를 반환
	//set메서드는 멤버변수를 변경
	//이름은 get멤버변수명,set멤버변수명(멤버변수의 첫자를 대문자로 사용)
	//get메서드는 리턴값이 해당 멤버변수값을 반환(리턴형을 멤버변수의 데이터형)
	//set메서드는 return데이터형은 void,파라메터는 설정할 멤버변수형을 사용)
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
}
