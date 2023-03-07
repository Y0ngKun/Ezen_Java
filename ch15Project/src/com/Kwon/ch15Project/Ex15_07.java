package com.Kwon.ch15Project;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

public class Ex15_07 {
	public static void main(String[] args) {
		
		//stream�̹Ƿ� byte �迭 ���
		byte[] arr1 = {0,1,2};
		byte[] arr2 = {3,4,5};
		byte[] arr3 = {6,7,8};
		byte[] outSrc = null;
		
		Vector v = new Vector();
		//Vector�� List�迭 �÷���
		
		v.add(new ByteArrayInputStream(arr1));
		//ByteArrayInputStream�� �޸��� ����Ʈ�迭�� ����ϴ� Stream
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));
		
		SequenceInputStream input = new SequenceInputStream(v.elements());
		//SequenceInputStream�� ������Ʈ������ �������� ��Ʈ���� �����Ͽ� �ϳ�ó�� ó��
		//Vector�� element()�޼���� Enumeration ��ü�� ��ȯ�ϰ� Enumeration��ü�� ���Ҵ�
		//ByteArrayInputStream ��ü�� ������
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		
		try {
			
			while((data = input.read()) != -1)
			{
				output.write(data); //�޸𸮿� ����
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		outSrc = output.toByteArray();
		//�迭�� ���ڿ� �������� ��ȯ�ϴ� �޼���� Arrays�� static�޼����� toString()�� ���
		
		System.out.println("Input Source1 " + Arrays.toString(arr1));
		System.out.println("Input Source2 " + Arrays.toString(arr2));
		System.out.println("Input Source3 " + Arrays.toString(arr3));
		System.out.println("Output Source1 " + Arrays.toString(outSrc));
		
		//2���� ��� ��ũ����ü (File)�� �Ķ���ͷ� �ϴ� SequenceInputStream��ü�� ����� ���
		
		try {
			FileInputStream file1 = new FileInputStream("file001.txt");
			FileInputStream file2 = new FileInputStream("123.txt");
			
			SequenceInputStream input1 = new SequenceInputStream(file1, file2);
			//�ΰ��� FileInputStream ��ü�� �̿��Ͽ� SequenceInputStream�� ����
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
