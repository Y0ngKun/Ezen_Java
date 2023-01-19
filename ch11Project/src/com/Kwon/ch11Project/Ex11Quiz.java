package com.Kwon.ch11Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex11Quiz {
	private static final int HashMap = 0;

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();//1��;
		
		cars.iterator();
		cars.add("Volvo");
		cars.add("Bmw");
		cars.add("Kia");//2��;
		
		System.out.println(cars); //3��;
		
		System.out.println(cars.get(0)); //4��;
		
		cars.set(0, "Opel");
		System.out.println(cars.get(0)); //5��;

		cars.remove(0);
		System.out.println(cars);//6��;
		
		cars.removeAll(cars);
		System.out.println(cars);//7��;
		
		cars.add("Volvo");
		cars.add("Bmw");
		cars.add("Kia");
		System.out.println(cars);//8��;
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.print(cars.get(i)+" ");
		}System.out.println();
		//9��;
		
		for(String arr : cars) {
			cars.get(0);
			System.out.println(cars);
		} //10��;
		
		HashMap<String, String> capital = new HashMap();//11��;
		capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Tokyo");
		System.out.println(capital); //12��;
		
		System.out.println(capital.get("Korea")); //13��;
		
		capital.remove("England");
		System.out.println(capital);//14��;
		
		capital.clear();
		System.out.println(capital);//15��;
		
		capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Tokyo");
		System.out.println(capital);//16��;
		
		capital.keySet();
		System.out.println("keyset: "+capital.keySet());
		capital.values();
		System.out.println("value:"+capital.values());
		
//		for (int i = 0; i < capital.size(); i++) {
//			capital.containsKey(capital);
//			System.out.println(capital.containsKey(capital));
//			capital.
//			System.out.println(capital.get(i));
//			
//		}//17��;
		
		Iterator<String> it = cars.iterator();//18��;
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("it : "+ it.next());
		}//19��;
	}//main method;
}//main class;

/*1. ArrayList��ü cars�� ����µ� ���׸����� StringŬ������ ���
 *2. cars��ü�� Volvo, Bmw, Ford, Kia�� �߰� 
 *3. cars ��ü�� ����Ʈ
 *4. ù��° ������ ��Ҹ� ��ȯ�ϴ� �޼��带 �̿��Ͽ� ���
 *5. ù��° ��Ҹ� Opel�� �����ϰ� ���
 *6. ù��° ��Ҹ� �����ϰ� ���
 *7. ��� ��Ҹ� �����ϰ� ���
 *8. cars�� �ٽ� Volvo, Bmw, Ford, Kia �߰�
 *9. �⺻ for������ cars�� �� ��Ҹ� ���
 *10. enhanced for������ cars�� �� ��Ҹ� ���
 *
 *11. HashMap��ü capital�� ����µ� ���׸��� ��� key�� String, value�� String�� ���׸�
 *   <String, String> ���
 * 
 *12. England�� London, Korea�� Seoul, Germany�� Berlin, Japan�� Tokyo�� Capital�� �߰�
 *   �ϰ� print(���� �̸��� key�� ���)
 * 
 *13. England�� value�� �� ���
 *14. key�� England�� ��� �����ϰ� print
 *15. ��� ��� �����ϰ� print
 *16. capital��ü�� �ٽ� 12���� �߰�
 *17. �⺻ for������ key set�� ��� �� Ű���� �̿��Ͽ� value�� ����Ʈ
 *18. cars ��ü�� Iterator ��ü it�� ����
 *19. it�� �̿��Ͽ� cars�� ����� ���� ���
 * 
 * 
 * 
 * 
 * 
 */
