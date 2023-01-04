package com.Kwon.ch07Project;


public class Ex07Quiz1 {

	public static void main(String[] args) {
		
		StudentDTO sdto = new StudentDTO("Kwon", 1, "1", "ezen", 77777777); //6번;
		
		sdto.getName();
		sdto.getNo();
		sdto.getGrade();
		sdto.getAddress();
		sdto.getPhone(); //7번;
		
		sdto.setName("yong");
		sdto.setNo(2);
		sdto.setGrade("2");
		sdto.setAddress("academy");
		sdto.setPhone(88888888);//8번;
		//long인데 왜 out of range??
		
		System.out.println(sdto.getName());
		System.out.println(sdto.getNo());
		System.out.println(sdto.getGrade());
		System.out.println(sdto.getAddress());
		System.out.println(sdto.getPhone());//9번;
		
		

	}//main method;

}//main class;
