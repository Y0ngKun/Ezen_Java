package com.Kwon.ch09Project;

public class Ex09Quiz {
	public static void main(String[] args) {
	Integer myInt = 5;
//	int myInt = Integer.valueOf(5); // �� Ǯ��
	Double myDouble = 5.99;
//	double myDouble = Double.valueOf(5.99); // �� Ǯ��
	Character myChar = 'A';
//	char myChar = Character.valueOf('A'); // �� Ǯ�� 

	
	System.out.printf("my Int : %d, myDouble : %.2f, myChar : %c%n",myInt,myDouble,myChar);
	
//	wrapper class�� toString()�� ������ ����ϵ��� �̹� Override��
//	System.out.println(myInt);
//	System.out.println(myDouble);
//	System.out.println(myChar);
//	
	
	String strInt = String.valueOf(myInt);
	String strDouble = String.valueOf(myDouble);
	String strChar = String.valueOf(myChar);
	
	System.out.printf("strInt : %s, strDouble : %s, strChar: %s%n",strInt,strDouble,strChar);
	

	String greeting = String.valueOf("Hello World"); //�� Ǯ��
//	String greeting = "Hello World"; // �ٸ� ��� �� , ���� ��� new ������ ���� �ǰ�ȴ�.
	
	System.out.println("greeting�� ���� ���� : " + greeting.length());
	//���ڿ��� ���� ������ length()�޼��� ���. Ư�����ڿ� ������� ��� ���Եȴ�.
	
	System.out.println(greeting.toUpperCase());
	System.out.println(greeting);
	
	System.out.println("John " + "Doe"); // + �����ڷ� ���ڿ� ����
	System.out.println("John ".concat("Doe")); //.concat()�޼���� ���ڿ� �߰��� ���� ���� 
	
	int indexof = greeting.indexOf('e');
	System.out.println("Hello World�߿� e�� ���ι�ȣ��  = "+indexof);
	
	int x = 5;
	int y = 7;
	System.out.println(Math.max(x, y)); //Math.max(a, b) �Ķ��Ÿ�� �ִ밪 ���ؼ� ����
	System.out.println(Math.min(x, y)); //Math.min(a, b) �Ķ��Ÿ�� �ּҰ� ���ؼ� ����
	
	double z = 16.0;
	System.out.println(Math.sqrt(z)); //Math.sqrt()�� ��Ʈ��(������) ���ϴ� �޼ҵ�
	
	StringBuffer sb = new StringBuffer("abcdef");
	System.out.println(sb.append(12345)); //StringBuffer�� toString�� Override �Ǿ ������ �Ǿ��ִ�.
	
	}//main method;
}//main class;

/*1. int�� ��ü�� ���� myInt�� �����ϰ� �ʱⰪ�� 5�� ����
 *2. double ��ü�� ���� myDouble�� �����ϰ� �ʱⰪ 5.99 ����
 *3. char ��ü�� myChar�� �����ϰ� �ʱⰪ A����
 *4. 1,2,3�� ���
 *5. 1,2,3 ������ ���ڿ� ���� strInt,strDouble,strChar�� ��ȯ
 *6. 5�� �������� ���� ���
 *7. ���� Hello World�� ���ڿ� ���� greeting�� ����
 *8. 7���� greeting������ ���ڼ��� ���
 *9. 7���� ���ڿ��� ��� �빮�ڷ� ��ȯ�Ͽ� ���
 *10. John�� Doe�� �����Ͽ� ���
 *11. 7���� greeting�������� e������ ���ι�ȣ�� ����
 *12. x�� 5�̰� y�� 7�ε� ���� ū���� ����
 *13. z�� 16�ε� ��Ʈ�� ����
 *14. ���ڿ� abcdef�� ���� StringBuffer ��ü sb�� ����
 *15. sb�� ���ڿ� 12345 ���̱�
 * 
 */
