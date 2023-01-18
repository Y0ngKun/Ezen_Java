package com.Kwon.ch11Project;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		//Class HashMap<K,V>  
		//K = key�� ��������, V = value�� �������� ���׸�
		//�� �� �̸��̹Ƿ� ���� String����
		
		map.put("myId", "1234");
		//public V put(K key, V value)
		//put�޼���� ���׸��� �̿��� key�� value�Ķ���͸� ���
		//��ȯ�� V��ü�� ��ȯ
		
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		//OK, �̹� �����ϴ� Ű �߰����, ���� ���� ������
		//key�� �ߺ��� �ȵǹǷ� ������ key�� �����ϸ� ������ key�� value�� ������Ʈ��
		//key�� �ٸ��� value�� �ߺ� O.K!!!
		System.out.println(map);
		//{myId=1234, asdf=1234}
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("id�� password�� �Է����ּ���.");
			System.out.print("id :");
			String id = s.nextLine().trim();
			//trim()�� �յ� ��������,key�� ��� ����
			
			System.out.print("password : ");
			String password = s.nextLine().trim();
			//trim()�� �յ� ��������,key�� ��� ����
			System.out.println();
			
			if (!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			
			if (!(map.get(id).equals(password))) {
				//get(key)�� key�� �ش��ϴ� value�� ��ȯ
				
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
			}else {System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�");
			break;
			}
			
		}//while
		

	}//main method;
}//main class;
