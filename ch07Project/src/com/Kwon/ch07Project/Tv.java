package com.Kwon.ch07Project;

public class Tv {
	
	boolean power; //�������� (on/off)
	int channel; //ä��
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
