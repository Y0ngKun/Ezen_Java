package com.Kwon.ch15Project;

import java.io.*;
import java.util.ArrayList;

public class Ex15_20 {

	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser"; //����ȭ ���� �ۼ��� ����
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("John","1234",30);
			UserInfo u2 = new UserInfo("Willi","1234",20);
			
			ArrayList<UserInfo> list = new ArrayList<UserInfo>();
			//ArrayList�� Serializable �������̽��� ������ Ŭ����
			
			list.add(u1);
			list.add(u2);
			//��ü�� ����ȭ �Ѵ�.
			//ObjectOutputStream�� writeObject(��ü)�� ��´�����Ͽ� ���
			
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			oos.close();
			System.out.println("����ȭ�� �� �������ϴ�");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
