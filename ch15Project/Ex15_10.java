package com.Kwon.ch15Project;

import java.io.StringReader;
import java.io.StringWriter;

//StringReader, StringWriter�� ���� ����̸� �޸𸮸� �̿�
//CharArrayReader�� CharArrayWriteró�� �����ϸ� ���� ���� Ȱ��
public class Ex15_10 {
	public static void main(String[] args) {
		
		String inputData = "ABCD";
		StringReader input = new StringReader(inputData);
		//StringReader��ü�� ������ ���ڿ� ��ü�� �̿��Ͽ� ����
	
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		try {
			while ((data = input.read()) != -1) {
				output.write(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("input data : " + inputData);
		System.out.println("output data : " + output);
		System.out.println("data : " + data);
		//StringWriter�� StringBuffer�� ���� Ȱ���ϰ�
		//StringWriter ��ü.toString()�� ���ۿ� ����� ������ �޸𸮿� ����Ѵ�
	
	
	}
}
