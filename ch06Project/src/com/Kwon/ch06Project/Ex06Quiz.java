package com.Kwon.ch06Project;


	 class Ex06Quiz {
	      
	      String string; //1번
	      static int number; //2번
	      //1번.인스턴스 변수로 문자열 변수 string
	      //2번.클래스형 변수 int형 변수 number
	      
	      static {System.out.println("{static}");}//11번
	      //11번. static블록 만들고 블록안의 실행문은 static출력
	      //11번 해설.static 블록은 클래스가 로딩될 때 값이 없는 변수들을 기본값으로 만들어주고 인스턴트 블록들 보다 먼저 출력된다
	      
	      
	      {System.out.println("{instance}");}//12번
	      //12번. 인스턴스 블록 만들고 블록안의 실행문은 instance출력
	      //12번 해설. 객체를 생성 할 때 마다 먼저 실행후 생성자로 초기화
	      
	      public static void main(String[] args) {
	        
	    	 Ex06Quiz.myMethod();//4번
	         
	    	 //myMethod();//4번 선생님답
	         //클래스형 메소드 호출시에는 클래스이름.메소드()인데 현재 동일 클래스여서 메소드 이름만으로 호출 가능하다.
	        
	         Ex06Quiz.myMethod("kook");//6번
      
	         //myMethod("kook");
	         //6번 선생님 답. 파라메타가 String name 하나라서 문자열 "null"로 출력;
	         //마찬가지로 같은 클래스 내라서 클래스. 생략가능
	         
	         Ex06Quiz hgd = new Ex06Quiz();
	         hgd.instanceMethod("홍길동");//8번
	         //인스턴스메소드는 같은 클래스 내에서라도 꼭 클래스.변수 = new 클래스();로 먼저 객체생성후
	         //변수.메소드(파라메타값)으로 호출
	      
	            
	         
	         Ex06Quiz abcde = new Ex06Quiz();
	         abcde.string = "abcde"; //9번
	         System.out.println(abcde.string);
	         
//	         hgd.string = "abcde";
//	 		System.out.println(hgd.string);
	         //9번 선생님 답
	         //!!!hgd이라는 인스턴스 객체를 다시 한번 사용해서 
	         //다른 인스턴스 변수를 사용하는것이 가능하다!!!!

	         
	         
	         number = 30;
	         System.out.println(number); //10번
	         //number는 스태틱메서드(스태틱변수) 이기때문에 따로 객체 생성안하고
	         //바로 변수명으로 접근
	         
	         //4번. 3번에서 만든 메서드 호출
	         //6번. 5번의 메서드를 호출하는데 인자를 kook으로 해서 호출
	         //8번. 인스턴스메서드 instanceMethod를 호출하는데 인자로 "홍길동"을 사용
	         //9번. 인스턴트변수 string을 abcde로 초기화하고 출력
	         //10번. 클래스변수 number를 30으로 초기화하고 출력
	      
	      }//main method;
	      
	     static void myMethod(){
	         System.out.println("I just got executed!"); 
	      }//3번;
	     
	     static void myMethod(String name){ 
	        System.out.printf("%s%n",name);
	         }//5번;
	     
//	     static void myMethod(String name)
//	 	{
//	 		System.out.println(name); 
//	 	} 
	     //5번 선생님 답
	     //오버로딩은 () = 파라메타 값만 다르게 쓰면 된다


	     String instanceMethod(String khs) {
	    	 //myMethod(); 인스턴스 메서드 안에서 스태틱메서드는 이름만으로 호출가능!!!!!
	         //number = 54; 마찬가지로 static int 변수도 이름으로 바로 접근 가능!!
	    	
	    	 //string = "kwon";		인스턴스 메소드 안에서 인스턴트 변수 호출가능
	    	 //this.string = "kwon"; 가능하면 같은 객체를 뜻하는 this를 붙여서 인스턴스변수 호출해라
	    	
	    	 System.out.println(khs);
	         return khs;} 
	      // 7번
	     
//	     String instanceMethod(String name) {
//	    	 System.out.println(name);
//	    	 return khs;
//	     } //7번 선생님 답..return에 꼭 파라메타값이 안오고 데이터형만 같으면
	       //다른 문자열 값이 와도 된다..
	     
	     
	      
	      //3번. class형 메소드 myMethod는 리턴 타입은 없고 파라메터도 없으며 실행문은 System.out.printf("I just got executed!");
	      //5번. 3번의 myMethod를 오버로딩한 메서드로 만드는데 파라메터를 String name으로 하고 실행문은 name을 출력
	     
	     //7번. 인스턴스 메소드 이름 instanceMethod이고 리턴타입은 문자열이며 
	      //     파라메타는 문자열 하나로 되어 있고 파라메터로 받은 값을 출력하고 리턴값은 khs를 리턴하라
	      
	      
	   }//Quiz06 class;


