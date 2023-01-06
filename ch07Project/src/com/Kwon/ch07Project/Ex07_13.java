package com.Kwon.ch07Project;

public class Ex07_13 {

	int outerV = 100;

	class InstanceInner {
	}

	static class StaticInner {
	}

	InstanceInner iv = new InstanceInner();
	// Ex07_13 class의 멤버변수인데 내부클래스의 객체로 사용 가능
	// 인스턴스형 멤버변수 iv는 InstanceInner를 바로 사용

	StaticInner cv = new StaticInner();
	// 클래스형 멤버변수 cv는 클래스형 내부 클래스를 바로 사용

	// Ex07_13클래스의 클래스형 멤버 메서드
	static void staticMethod() {
		// static메서드는 인스턴스멤버에 직접 접근할 수 있다(인스턴스멤버객체를 만들어 접근)
		// InstanceInner obj1 = new InstanceInner(); 접근불가

		// static 메서드 안에서 static 내부 클래스는 바로 접근
		StaticInner obj2 = new StaticInner();

		// 인스턴스 내부에 클래스에 접근하려면 부모 (Ex07_13)객체를 만들어 접근
		Ex07_13 outer = new Ex07_13();

		InstanceInner obj3 = outer.new InstanceInner();
		// 일반클래스의 static method안에서 자기 클래스의 인스턴스멤버 접근시는 자기클래스 객체를 만들어 접근
	}

	void instanceMethod() {
		// 일반클래스의 인스턴스메서드에서 자기클래스의 인스턴스멤버나 클래스멤버 접근시는 객체를만들거나
		// 자기 클래스 이름없이 바로 접근하는 원칙 사용
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		// Local 클래스는 밖에서 사용못함(로컬변수와 마찬가지 취급)
//		LocalInner lv = new LocalInner();
	}

	void myMethod() {
		class LocalClass {
		}
		LocalClass lc = new LocalClass();
	}

	public static void main(String[] args) {
		staticMethod(); // 메인메소드는 static이므로 같은 클래스 내인 static멤버인 staticMethod()는 바로 사용가능

		Ex07_13 winter = new Ex07_13();
		winter.instanceMethod();
		// static메서드 안에서 자기 클래스의 인스턴스멤버 접근시는 자기 클래스 객체만들어 접근

		Ex07_13 outer = new Ex07_13();
		InstanceInner iin = outer.new InstanceInner();

	}

}
