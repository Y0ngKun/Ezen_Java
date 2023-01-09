package com.Kwon.ch08Project;

import java.io.File;

public class Ex08_10 {

	public static void main(String[] args) {
		
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName()+"������ ���������� �����Ǿ����ϴ�.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+" �ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
		}

	}//main method;

	static File createFile(String fileName) throws Exception{
		//�ڽ� �޼��带 ȣ���� main�޼���� ����ó�� ����
		if(fileName==null || fileName.equals("")) 
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�");
		//���ܹ߻��� �� �޼���ȿ��� try~catch�� ó�� ���ϰ� ȣ���� �޼���� ó�� ����
		//����ó���� ���Ƿ� ȣ��޼���� ��
		File f = new File(fileName);
		f.createNewFile();//File��ü�� ���� ���� �����
		
		System.out.println("������ ������Ʈ �ؿ� ������� - ������Ʈ���� Refresh�ؾ� ����");
		return f;
	}
	
	
}//main class;
