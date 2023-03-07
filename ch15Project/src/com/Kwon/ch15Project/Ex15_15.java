package com.Kwon.ch15Project;

import java.io.File;
import java.io.IOException;

public class Ex15_15 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:/testIo/Ex15_14.java");
		//�⺻������ : public File(String pathname);
		
		String fileName = f.getName();
		// public String getName() {
        // int index = path.lastIndexOf(separatorChar);
        // if (index < prefixLength) return path.substring(prefixLength);
        // return path.substring(index + 1);
		//��� ������ ���� �̸� ��ȯ
		
		int pos = fileName.lastIndexOf(".");
		//Ȯ���� ���� .�� ���� ��ȣ
		System.out.println("��θ� ������ ���� �̸� - " + f.getName());
		System.out.println("Ȯ���ڸ� ������ ���� �̸� - " + fileName.substring(0,pos));
		System.out.println("��θ� ������ ���� �̸� - " + f.getPath());
		System.out.println("������ ������ - " + f.getAbsolutePath());
		System.out.println("������ ���԰�� - " + f.getCanonicalPath());
		System.out.println("������ ���� �ִ� ���丮 - " + f.getParent());
		
		System.out.println("==============================");
		
		//���丮(����)
		System.out.println("File.pathSeparator : " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar : " + File.pathSeparatorChar);
		System.out.println("File.separator : " + File.separator);
		System.out.println("File.separatorChar : " + File.separatorChar);
		
	}
}
