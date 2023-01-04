package com.Kwon.ch07Project;

public class StudentDTO {
	private String name;
	private String no;
	private String grade;
	private String address;
	private String phone;
	
	public StudentDTO(){}
	public String StudentDTO(String name, String no, String grade, String address, String phone){
		this.name = name;
		this.no = no;
		this.grade = grade;
		this.phone = phone;
		return name;
	}
	

            
}
