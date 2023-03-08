package com.Kwon.ch15Project;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//������ȭ, ����ȭ�� ���ڿ��� ��ü�� ����
public class Ex15_21 {

	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser";
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			//��ü�� �����ô� ����� ������ ��ġ
			
			UserInfo u1 = (UserInfo)ois.readObject();
			UserInfo u2 = (UserInfo)ois.readObject();
			//readObject()�� ��ȯ�� Object�̹Ƿ� ����ȯ ����
			
			ArrayList list = (ArrayList)ois.readObject();
			
			System.out.println(u1/*.toString()*/);
			//toString()�� �����Ϸ��� �ڵ� �ٿ���
			System.out.println(u2);
			System.out.println(list);
			//List�� toString()�� �������̵� �Ǿ� ����
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
