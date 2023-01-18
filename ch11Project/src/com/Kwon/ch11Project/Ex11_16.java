package com.Kwon.ch11Project;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		//Class HashMap<K,V>  
		//K = key의 데이터형, V = value의 데이터형 제네릭
		//둘 다 이름이므로 거의 String형임
		
		map.put("myId", "1234");
		//public V put(K key, V value)
		//put메서드는 제네릭을 이용한 key와 value파라메터를 사용
		//반환은 V객체를 반환
		
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		//OK, 이미 존재하는 키 추가기능, 기존 값은 없어짐
		//key는 중복이 안되므로 동일한 key가 존재하면 기존의 key의 value를 업데이트함
		//key가 다르면 value는 중복 O.K!!!
		System.out.println(map);
		//{myId=1234, asdf=1234}
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id :");
			String id = s.nextLine().trim();
			//trim()은 앞뒤 공백제거,key로 사용 예정
			
			System.out.print("password : ");
			String password = s.nextLine().trim();
			//trim()은 앞뒤 공백제거,key로 사용 예정
			System.out.println();
			
			if (!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			
			if (!(map.get(id).equals(password))) {
				//get(key)는 key에 해당하는 value를 반환
				
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			}else {System.out.println("id와 비밀번호가 일치합니다");
			break;
			}
			
		}//while
		

	}//main method;
}//main class;
