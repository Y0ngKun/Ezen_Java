package com.Kwon.ch15Project;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//역직렬화, 직렬화된 문자열을 객체로 변경
public class Ex15_21 {

	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser";
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			//객체를 읽을시는 출력한 순서와 일치
			
			UserInfo u1 = (UserInfo)ois.readObject();
			UserInfo u2 = (UserInfo)ois.readObject();
			//readObject()는 반환이 Object이므로 형변환 해줌
			
			ArrayList list = (ArrayList)ois.readObject();
			
			System.out.println(u1/*.toString()*/);
			//toString()은 컴파일러가 자동 붙여줌
			System.out.println(u2);
			System.out.println(list);
			//List는 toString()이 오버라이딩 되어 있음
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
