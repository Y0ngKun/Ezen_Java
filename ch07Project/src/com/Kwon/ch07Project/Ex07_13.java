package com.Kwon.ch07Project;

public class Ex07_13 {

	int outerV = 100;

	class InstanceInner {
	}

	static class StaticInner {
	}

	InstanceInner iv = new InstanceInner();
	// Ex07_13 class�� ��������ε� ����Ŭ������ ��ü�� ��� ����
	// �ν��Ͻ��� ������� iv�� InstanceInner�� �ٷ� ���

	StaticInner cv = new StaticInner();
	// Ŭ������ ������� cv�� Ŭ������ ���� Ŭ������ �ٷ� ���

	// Ex07_13Ŭ������ Ŭ������ ��� �޼���
	static void staticMethod() {
		// static�޼���� �ν��Ͻ������ ���� ������ �� �ִ�(�ν��Ͻ������ü�� ����� ����)
		// InstanceInner obj1 = new InstanceInner(); ���ٺҰ�

		// static �޼��� �ȿ��� static ���� Ŭ������ �ٷ� ����
		StaticInner obj2 = new StaticInner();

		// �ν��Ͻ� ���ο� Ŭ������ �����Ϸ��� �θ� (Ex07_13)��ü�� ����� ����
		Ex07_13 outer = new Ex07_13();

		InstanceInner obj3 = outer.new InstanceInner();
		// �Ϲ�Ŭ������ static method�ȿ��� �ڱ� Ŭ������ �ν��Ͻ���� ���ٽô� �ڱ�Ŭ���� ��ü�� ����� ����
	}

	void instanceMethod() {
		// �Ϲ�Ŭ������ �ν��Ͻ��޼��忡�� �ڱ�Ŭ������ �ν��Ͻ������ Ŭ������� ���ٽô� ��ü������ų�
		// �ڱ� Ŭ���� �̸����� �ٷ� �����ϴ� ��Ģ ���
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		// Local Ŭ������ �ۿ��� ������(���ú����� �������� ���)
//		LocalInner lv = new LocalInner();
	}

	void myMethod() {
		class LocalClass {
		}
		LocalClass lc = new LocalClass();
	}

	public static void main(String[] args) {
		staticMethod(); // ���θ޼ҵ�� static�̹Ƿ� ���� Ŭ���� ���� static����� staticMethod()�� �ٷ� ��밡��

		Ex07_13 winter = new Ex07_13();
		winter.instanceMethod();
		// static�޼��� �ȿ��� �ڱ� Ŭ������ �ν��Ͻ���� ���ٽô� �ڱ� Ŭ���� ��ü����� ����

		Ex07_13 outer = new Ex07_13();
		InstanceInner iin = outer.new InstanceInner();

	}

}
