package com.Kwon.ch11Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex11Quiz {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();//1��;
		//ArrayList ���׸� Ŭ�����̴� ArrayList <E> �̷������� ���Ǵ� E�� �Ǿ��ִ�.
		//���׸��� Ÿ�� �Ķ��Ÿ�̴�.
		//���������� ����ȭ �ؼ� ����ϴ� ���̴�.
		//������ <>�ȿ� �Է� ���� 1.8�������ʹ� ���� ����������, ������ִ� ���� ����. 

		cars.add("Volvo");
		cars.add("Bmw");
		cars.add("Ford");
		cars.add("Kia");//2��;
		//���׸��� ����� ArrayList cars���� ���� �Ķ��Ÿ�� String�� ��밡���ϴ�.
		
		System.out.println("3�� cars ��ü�� ����Ʈ : " + cars); //3��;

		System.out.println("4�� ù��° ����� ��Ҹ� ��ȯ�ϴ� �޼��带 �̿��Ͽ� ��� : " + cars.get(0)); //4��;
		//ArrayList�� �����͸� ��ȯ���ִ� �޼���� .get(int index);
		
		cars.set(0, "Opel");
		System.out.println("5�� ù��° ��Ҹ� Opel�� �����ϰ� ��� : " + cars.get(0)); //5��;
		//.set(int index , "������ ��") -> cars���� <String>�̴� ������ ���� String�� ��� ����.
		
		cars.remove(0);
		System.out.println("6�� ù��° ��Ҹ� �����ϰ� ��� : " + cars);//6��;
		//.remove(int index) ArrayList�� ��� ���� �޼ҵ�
		
		
		cars.clear();;
		System.out.println("7�� ��� ��Ҹ� �����ϰ� ��� : " + cars);//7��;
		//.removeAll(), .clear() �� �������� ���� �˰� ����(!!)
		//clear() �޼���� removeAll() �޼���� ArrayList ��ü�� ��� ��Ҹ� ������ �� �ֽ��ϴ�.
		
		//removeAll() �޼���� �÷��� Ÿ���� �μ��� �����ϴ�.
		//�� �������� �� �� �ֵ��� �� �޼��� ��� ArrayList ��ü�� ��� ��Ҹ� �����մϴ�. �׷��� clear() �޼���� removeAll()�� �ٸ��� �����մϴ�. ���� �� �޼����� �������� ������ �ʿ䰡 �ֽ��ϴ�.
		//clear() �޼����� ������ ����Ʈ���� ��� ��Ҹ� �����ϴ� ���Դϴ�. ���� clear() �޼��带 ȣ���ϸ� ��� ��Ұ� ���ŵ˴ϴ�.
		//removeAll() �޼���� clear() �޼���� �޸� Collection Ÿ���� �μ��� �����մϴ�. removeAll() �޼����� ������ removeAll() �޼��带 ȣ���� �÷��� ��ü�� ���ڷ� ���޵� �÷��� ��ü�� ��ġ�ϴ� ��Ҹ� �����ϴ� ���Դϴ�.
		
		//clear() �޼���� removeAll() �޼��庸�� �����ϴ�.
		
		cars.add("Volvo");
		cars.add("Bmw");
		cars.add("Ford");
		cars.add("Kia");
		System.out.println("8�� cars�� �ٽ� Volvo, Bmw, Ford, Kia �߰� : " + cars);//8��;

		for (int i = 0; i < cars.size(); i++) {
			System.out.println("9�� �⺻ for������ cars�� �� ��Ҹ� ���, " + i +"�� ° ��� : " + cars.get(i));
		}
		//9��;
		
		//Enhanced for���� �迭�� Collection�� ����
		//�������� �ҹ��ڷ�(!!)
		for(String arr : cars) {
			System.out.println("10�� Enhanced for������ cars�� �� ��Ҹ� ���, " + arr.charAt(0) +"�� ° ��� : " + arr);
		} //10��;

		HashMap<String, String> capital = new HashMap<String, String>();//11��;
		//Map <K, V> capital = new HashMap<>();�� ����
		//Map�� Key���� �ߺ� ����� �ȵȴ�.
		//������ Value�� �ߺ��� ��� �ǳ�, ������ �����ǰ�
		//������ ������ ��ü�Ѵ�.
		
		capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Tokyo");
		//ArrayList�� .add()
		//Map�� .put()
		
		System.out.println("12�� : " + capital); //12��;
		//Map�� toString()�� �������س���
		//Map�� toString()�� {K=V,K=V....}�� ���� �س���
		
		System.out.println("13�� England�� value�� �� ��� : " + capital.get("England")); //13��;
		//Map���� .get()�� �ִµ� 
		//���ι�ȣ�� �ƴϰ�, .get(Key)���� ������  
		//key�� �ش��ϴ� value�� ��µȴ�(!!)
		
		capital.remove("England");
		System.out.println("14�� key�� England�� ��� �����ϰ� print : " + capital);//14��;
		//remove()�� ���ڿ��� ��ȯ���ִµ� ������ ���� ��ȯ���ش�.

		capital.clear();
		System.out.println("15�� ��� ��� �����ϰ� print : " + capital);//15��;

		capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Tokyo");
		System.out.println("16�� capital��ü�� �ٽ� 12���� �߰� : " + capital);//16��;

		for (int i = 0; i < capital.size(); i++) {
			String s =(String)capital.keySet().toArray()[i];
			System.out.println("17�� capital�� " + i +"�� ° key�� value�� : " + capital.get(s));
		}//17��;
		
	      
		for (String key : capital.keySet()) {
			//Map.set()�� Key�� ������ �� Set
			System.out.println("17�� "+ ": " + capital.get(key));
		}//17�� enhanced for
		//enhanced for������ 
		//key�� ������ Set��ü�� �� key�� �ݺ��Ͽ� ��


		Iterator<String> it = cars/*�÷��������ӿ�ũ*/.iterator(); //18��;

		for (int i = 0; i < cars.size(); i++) {
			System.out.println("19�� it�� �̿��Ͽ� cars�� ����� ���� ��� : " + it.next() +" , ���� �� Ȯ�� : " + it.hasNext());
		}//19��;
		
		//Iterator�� ��ü�� .next()�� ����ϸ�
		//��ҿ��� �����ȴ� �ؼ� for�� while�� .next()�ؼ� ����ϸ�
		//������ ���� ��ҵ��� ��¸��Ѵ�.

		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
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
