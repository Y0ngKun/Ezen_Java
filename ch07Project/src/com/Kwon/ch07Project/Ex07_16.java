package com.Kwon.ch07Project;

public class Ex07_16 {

	public static void main(String[] args) {
		OuterEx0716 out = new OuterEx0716();
		OuterEx0716.Inner Inner = out.new Inner();
		// �ܺ�Ŭ������ ����Ŭ���� ���������� �ܺ�Ŭ������.����Ŭ������
		Inner.method();

	}

}

class OuterEx0716 {

	// ���� �̸����� �����ÿ� this
	int value = 10;

	class Inner {
		int value = 11;

		void method() {
			int value = 12; // ���� Ŭ���� Inner�� ���ú���
			System.out.println("value " + value);
			// method()���� ���ú��� value ->12�� ����
			System.out.println("tis.value" + this.value);
			// this�� �ڽ��� Ŭ������ ��ü(�޼��忡 ���� ����� ��Į��ü->11�� ����)
			System.out.println("OuterEx0716.this.value : " + OuterEx0716.this.value);
			// OuterEx0716�� value ->10�� ����
		}
	}
}
