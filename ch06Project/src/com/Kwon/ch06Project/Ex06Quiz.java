package com.Kwon.ch06Project;


	 class Ex06Quiz {
	      
	      String string; //1��
	      static int number; //2��
	      //1��.�ν��Ͻ� ������ ���ڿ� ���� string
	      //2��.Ŭ������ ���� int�� ���� number
	      
	      static {System.out.println("{static}");}//11��
	      //11��. static��� ����� ��Ͼ��� ���๮�� static���
	      //11�� �ؼ�.static ����� Ŭ������ �ε��� �� ���� ���� �������� �⺻������ ������ְ� �ν���Ʈ ��ϵ� ���� ���� ��µȴ�
	      
	      
	      {System.out.println("{instance}");}//12��
	      //12��. �ν��Ͻ� ��� ����� ��Ͼ��� ���๮�� instance���
	      //12�� �ؼ�. ��ü�� ���� �� �� ���� ���� ������ �����ڷ� �ʱ�ȭ
	      
	      public static void main(String[] args) {
	        
	    	 Ex06Quiz.myMethod();//4��
	         
	    	 //myMethod();//4�� �����Դ�
	         //Ŭ������ �޼ҵ� ȣ��ÿ��� Ŭ�����̸�.�޼ҵ�()�ε� ���� ���� Ŭ�������� �޼ҵ� �̸������� ȣ�� �����ϴ�.
	        
	         Ex06Quiz.myMethod("kook");//6��
      
	         //myMethod("kook");
	         //6�� ������ ��. �Ķ��Ÿ�� String name �ϳ��� ���ڿ� "null"�� ���;
	         //���������� ���� Ŭ���� ���� Ŭ����. ��������
	         
	         Ex06Quiz hgd = new Ex06Quiz();
	         hgd.instanceMethod("ȫ�浿");//8��
	         //�ν��Ͻ��޼ҵ�� ���� Ŭ���� �������� �� Ŭ����.���� = new Ŭ����();�� ���� ��ü������
	         //����.�޼ҵ�(�Ķ��Ÿ��)���� ȣ��
	      
	            
	         
	         Ex06Quiz abcde = new Ex06Quiz();
	         abcde.string = "abcde"; //9��
	         System.out.println(abcde.string);
	         
//	         hgd.string = "abcde";
//	 		System.out.println(hgd.string);
	         //9�� ������ ��
	         //!!!hgd�̶�� �ν��Ͻ� ��ü�� �ٽ� �ѹ� ����ؼ� 
	         //�ٸ� �ν��Ͻ� ������ ����ϴ°��� �����ϴ�!!!!

	         
	         
	         number = 30;
	         System.out.println(number); //10��
	         //number�� ����ƽ�޼���(����ƽ����) �̱⶧���� ���� ��ü �������ϰ�
	         //�ٷ� ���������� ����
	         
	         //4��. 3������ ���� �޼��� ȣ��
	         //6��. 5���� �޼��带 ȣ���ϴµ� ���ڸ� kook���� �ؼ� ȣ��
	         //8��. �ν��Ͻ��޼��� instanceMethod�� ȣ���ϴµ� ���ڷ� "ȫ�浿"�� ���
	         //9��. �ν���Ʈ���� string�� abcde�� �ʱ�ȭ�ϰ� ���
	         //10��. Ŭ�������� number�� 30���� �ʱ�ȭ�ϰ� ���
	      
	      }//main method;
	      
	     static void myMethod(){
	         System.out.println("I just got executed!"); 
	      }//3��;
	     
	     static void myMethod(String name){ 
	        System.out.printf("%s%n",name);
	         }//5��;
	     
//	     static void myMethod(String name)
//	 	{
//	 		System.out.println(name); 
//	 	} 
	     //5�� ������ ��
	     //�����ε��� () = �Ķ��Ÿ ���� �ٸ��� ���� �ȴ�


	     String instanceMethod(String khs) {
	    	 //myMethod(); �ν��Ͻ� �޼��� �ȿ��� ����ƽ�޼���� �̸������� ȣ�Ⱑ��!!!!!
	         //number = 54; ���������� static int ������ �̸����� �ٷ� ���� ����!!
	    	
	    	 //string = "kwon";		�ν��Ͻ� �޼ҵ� �ȿ��� �ν���Ʈ ���� ȣ�Ⱑ��
	    	 //this.string = "kwon"; �����ϸ� ���� ��ü�� ���ϴ� this�� �ٿ��� �ν��Ͻ����� ȣ���ض�
	    	
	    	 System.out.println(khs);
	         return khs;} 
	      // 7��
	     
//	     String instanceMethod(String name) {
//	    	 System.out.println(name);
//	    	 return khs;
//	     } //7�� ������ ��..return�� �� �Ķ��Ÿ���� �ȿ��� ���������� ������
	       //�ٸ� ���ڿ� ���� �͵� �ȴ�..
	     
	     
	      
	      //3��. class�� �޼ҵ� myMethod�� ���� Ÿ���� ���� �Ķ���͵� ������ ���๮�� System.out.printf("I just got executed!");
	      //5��. 3���� myMethod�� �����ε��� �޼���� ����µ� �Ķ���͸� String name���� �ϰ� ���๮�� name�� ���
	     
	     //7��. �ν��Ͻ� �޼ҵ� �̸� instanceMethod�̰� ����Ÿ���� ���ڿ��̸� 
	      //     �Ķ��Ÿ�� ���ڿ� �ϳ��� �Ǿ� �ְ� �Ķ���ͷ� ���� ���� ����ϰ� ���ϰ��� khs�� �����϶�
	      
	      
	   }//Quiz06 class;


