package com.Kwon.ch07Project;

public class Ex07Quiz1 {

   public static void main(String[] args) {
      
      StudentDTO sdto = new StudentDTO("Kwon", 1, "1", "ezen", 234324324L); //6��;
      
      sdto.getName();
      sdto.getNo();
      sdto.getGrade();
      sdto.getAddress();
      sdto.getPhone(); //7��;
      
      sdto.setName("yong");
      sdto.setNo(2);
      sdto.setGrade("2");
      sdto.setAddress("academy");
      sdto.setPhone(888882287828L);//8��;
      //long�ε� �� out of range??
      
      System.out.println(sdto.getName());
      System.out.println(sdto.getNo());
      System.out.println(sdto.getGrade());
      System.out.println(sdto.getAddress());
      System.out.println(sdto.getPhone());//9��;
      
      

   }//main method;

}//main class;