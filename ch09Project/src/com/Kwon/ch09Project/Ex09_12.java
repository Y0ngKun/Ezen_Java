package com.Kwon.ch09Project;

public class Ex09_12 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("01");
		//�������� ���ڿ��� �Ķ���ͷ� ���� ������(���ڿ� + 16�� ���� ���� char �迭 ����� ó��)
		//new StringBuffer(); �̶��� �ʱ�ȭ ���ڿ� ���� ũ�Ⱑ 16(char �迭 ����)�� char�迭�� ����� ó��
		//new StringBuffer(int length)�� �ʱ�ȭ ���ڿ��� ���� char �迭 ũ�⸸ ����
		System.out.println(sb);
		StringBuffer sb2 = sb.append(23);
		System.out.println(sb);
		sb.append('4').append(56);
		//append�� �Ķ���ͷ� ��� ���������� ��� �� �� �ִ� �����ε��� �޼����̰� �ڱ� �ڽ��� �����Ѵ�
		//sb2�� sb�� �ּҰ� ���� ��ü
		//sb�� ���� ����Ǹ� sb2�� �Ȱ��� �� ����ȴ� , �ּҰ� �Ȱ��� ������;
		//append�� chaining���(�޼��带 ��� ���� ���)
		System.out.println(sb);
		StringBuffer sb3 = sb.append(56);
		sb.append(9.0);
		System.out.println(sb);
		
		System.out.println("sb = " + sb);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb3 = " + sb3);
		
		System.out.println("sb = " + sb.deleteCharAt(0));
		//���ι�ȣ n���� �ִ� ���� �ϳ��� �����ϰ� ����
		System.out.println("sb = " + sb.delete(3,6));
		//���ι�ȣ (n��,n��)�� �ִ� ���ڵ��� �����ϰ� ����
		System.out.println("sb = " + sb.insert(0,"9"));
		//���ι�ȣ 0���� 9�� �����Ѵ�
		System.out.println("sb = " + sb.replace(1, sb.length(), "END"));
		//���ι�ȣ 1������ ũ��-1(������ ���ι�ȣ)���� END�� ��ü
		System.out.println("sb.capacity = " + sb.capacity());
		//������ ũ��
		System.out.println("sb.length = " + sb.length());
		//������ ����
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		//boolean���� ���ڿ� true,false�� boolean���� ��ȯ
		boolean b1 = Boolean.getBoolean("true");
		//true���� false���´� / ???????????
		System.out.println(b1);
		
		
		System.out.println(sb.reverse());
		//���ڿ��� ������ �Ųٷ� ���

		
	}

}
