package com.kwon.ch04project;

import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>>");
		
		int input = scanner.nextInt();
		//nextInt�� ()�Է°��� ���ڷ� ��ȯ
		//�Է��ϰ� ���� ĥ������ ����ϴٰ� ����ġ�� input�� �Է°� ����
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
		}
		else {
			//else�� if�� true���� �ƴ� ��� �ٸ� �����̹Ƿ� ���ǽ��� �� �ʿ䰡 ����
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�");
		}
		
		
		

	}

}
