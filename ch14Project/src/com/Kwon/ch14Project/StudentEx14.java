package com.Kwon.ch14Project;

public class StudentEx14 implements Comparable<StudentEx14> {
	private String name;
	private int ban;
	private int totalScore; 
	
	//Comparable 추상 메서드 구현
	@Override
	public int compareTo(StudentEx14 s) {
		return s.totalScore - this.totalScore; //내림차순 기본 정렬
	}
	//Object에 있는 toString()을 재정의
	@Override
	public String toString() {
		//Object의 toString()은 객체의 주소를 반환한다
		return String.format("[%s,%d,%d]", name,ban,totalScore);
	}
	
	public StudentEx14(){super();}

	public StudentEx14(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
}
	
