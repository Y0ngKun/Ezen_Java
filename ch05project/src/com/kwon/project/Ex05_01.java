package com.kwon.project;

import java.util.Arrays;

public class Ex05_01 {
	public static void main(String[] args) {

		int[] iArr1 = new int[10];
		// �޸� Ȯ�� �� int �⺻���� 0���� ��Ұ� ä����
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100,95,80,70,60};
		int[] iArr3 = { 100, 95, 80, 70, 60 };
		// ����ÿ� �迭�� ��(���ͷ�)�� �ʱ�ȭ
		// �迭���� ǥ���ϴ� ���� {}�ȿ� ,(�޸�)�� ���е� ���� �־���
		// ���ͷ� ������ �ʱ�ȭ �� �ô� ����� �ٷ� ���־���Ѵ�.
		// ���� ���� ���� �ʱ�ȭ �����ϸ� ���� �߻�
		char[] chArr = { 'a', 'b', 'c', 'd' };

		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
		}

		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1;
		}

		for (int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[1] + ",");
		}

		System.out.println();

		System.out.println(Arrays.toString(iArr1));
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);

	}// main

}
