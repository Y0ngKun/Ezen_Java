package com.Kwon.ch14Project;

public class StudentEx14 implements Comparable<StudentEx14> {
	private String name;
	private int ban;
	private int totalScore; 
	
	//Comparable �߻� �޼��� ����
	@Override
	public int compareTo(StudentEx14 s) {
		return s.totalScore - this.totalScore; //�������� �⺻ ����
	}
	//Object�� �ִ� toString()�� ������
	@Override
	public String toString() {
		//Object�� toString()�� ��ü�� �ּҸ� ��ȯ�Ѵ�
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
	
