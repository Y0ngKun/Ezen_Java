package com.Kwon.ch15Project;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex15_06 {
	
	public static void main(String[] args) {
		try {
			//������ ������ ���ܰ� �߻��ϹǷ� ���� ó���� ����� �Ѵ�.
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			//BufferedOutputStream(OutputStream�� ��� ��ü, ����Ʈ ũ��)
			//������Ʈ���� ������ ��� ��Ʈ�� ��ü�� �̿��Ͽ� ��ü�� ����
			//���� ���� ũ�Ⱑ ������ �⺻�� 8192����Ʈ�� ����
			for(int i = '0' ; i <= '9'; i++) {
				//���� ��Ʈ���� �̿�� read,write �޼���� ������Ʈ���� �޼��� ���
				//�����δ� ��� ��Ʈ���� read,write�� ó����
				bos.write(i);
			}
			//fos.close(); ���ۿ� �Ϻδ� ���� ��
			bos.close();
			//������Ʈ�� ��ü�� close()�ϸ� �ڵ����� ��� ��Ʈ���� fos.close()�� �����Ͽ�
			//flush()�� �ڵ� ����Ǿ� ���۸� ��� �ش�.
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("������Ʈ ���� �ؿ� 123.txt�� ������� ������Ʈ�� refresh�ؼ� ��");
		
	}
}
