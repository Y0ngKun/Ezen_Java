package com.Kwon.ch08Project;

public class Ex08Quiz {
	public static void main(String[] args) {
		int[] myNumber = {1,2,3,4,5};
		System.out.println(myNumber[10]);

		try {
			System.out.println(myNumber[10]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���� : "+e.getMessage());
		} finally {
			System.out.println("try-catch�� ����");
		}

	}// main method;
	static void checkAge(int age){
		if (age < 18) {
			try {
				ArithmeticException ae = new ArithmeticException("���ܹ߻� ae");
				throw ae;
			}
			catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println("ae����" + e.getMessage());
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("ae����" + e.getMessage());
			}
			finally {
				System.out.println("try-catch ����");
			}
			checkAge(22);
		}
		else {System.out.println("18�� �̻��̹Ƿ� ���");}
		}

}// main class;

/*
 * 1. int�迭 myNumber�� ��Ұ� 1,2,3,4,5 ���ͷ��� ������ �����Ѵ�. 2. myNumber�� ���ι�ȣ 10�� ��Ҹ�
 * ����ض� 3. ���ܰ� �߻��ϸ� ����ó���� �ϴµ� printstackTrace();�� ���ܳ���(���ܳ����ȯ �޼��� ���)������϶� 4. ����
 * �߻��ó� �̹߻��ÿ� �������� ����� ������ try-catch�� ���� 5. main�޼���ȿ��� �̸����� �ٷ� ȣ���ϴ� checkAge��
 * ����Ÿ���� void, �Ķ��Ÿ�� int age�� �ϸ� ���� ������ age�� 18�̸��̸� ArithmeticException���ܸ�
 * (���ܳ���) "���� �߻�"���� �Ͽ� �����Ͽ� ���ܸ� �߻���Ű�� ���� ó���� ����, ���� ó�� ������ 3�� ó�� ���� 6. age��
 * 18�̻��̸� 18�� �̻��̹Ƿ� ��� ���
 */