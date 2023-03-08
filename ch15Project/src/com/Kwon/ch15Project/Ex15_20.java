package com.Kwon.ch15Project;

import java.io.*;
import java.util.ArrayList;

public class Ex15_20 {

	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser"; //직렬화 값을 작성할 파일
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("John","1234",30);
			UserInfo u2 = new UserInfo("Willi","1234",20);
			
			ArrayList<UserInfo> list = new ArrayList<UserInfo>();
			//ArrayList도 Serializable 인터페이스를 구현한 클래스
			
			list.add(u1);
			list.add(u2);
			//객체를 직렬화 한다.
			//ObjectOutputStream의 writeObject(객체)로 출력대상파일에 출력
			
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			oos.close();
			System.out.println("직렬화가 잘 끝났습니다");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
