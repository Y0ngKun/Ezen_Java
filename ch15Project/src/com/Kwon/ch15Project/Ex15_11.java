package com.Kwon.ch15Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;

//Buffer�� �̿��ϴ� ���� ��Ʈ�� BufferedReder, BufferWriter
public class Ex15_11 {
	public static void main(String[] args) {
		
		//���� Reader, Writer�� ��� ��Ʈ���� ����Ͽ� ó��
		
		try {
			FileReader fr = new FileReader("Ex15_10.java");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			for (int i = 1; ((line = br.readLine()) != null); i++) {
				//readLine()�޼���� BufferedReader�� �޼���� 1�پ� �о��
				//System.out.println(==================);
				//line�� ;�� ������ ���
				if (line.indexOf(";") != -1) {
					System.out.println(i + ":" + line);
				}
			}
			
			fr.close();
			br.close();
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		

		
	}
}
