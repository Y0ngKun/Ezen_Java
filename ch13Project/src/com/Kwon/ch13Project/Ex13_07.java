package com.Kwon.ch13Project;

public class Ex13_07 implements Runnable{

	static boolean autoSave = false;
	
	@Override
	//보조 쓰레드용 run으로 메인쓰레드 종료되면 자동 종료
	public void run() {
		while (true) {
			try {
				Thread.sleep(3 * 1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			if (autoSave) {
				autoSave();
			}
		}
	}//run();
	public void autoSave() {
		System.out.println("파일이 자동 저장 되었습니다");
	}
	public static void main(String[] args) {
		//main method는 JVM에서 메인 쓰레드로 
		Runnable r =new Ex13_07();
		Thread t = new Thread(r);
		Thread rt = new Thread(new Ex13_07());//한줄로 쓰는 법

		t.setDaemon(true);//쓰레드 t를, 보조 쓰레드인 daemon쓰레드로 사용
		t.start();
		//여기서 보조쓰레드의 일반쓰레드는 main쓰레드

		//아래부분은 main 쓰레드가 실행
		for (int i = 1; i <= 13 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i);
			if(i==5) {
				autoSave = true;
			}
		}//for;

	}//main method;
}//main class;
