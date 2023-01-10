package com.Kwon.ch08Project;

public class Ex08_13 {

	public static void main(String[] args) {
		try {
			install();		
		} catch (InstallException e) {
			//���ο��� SpaceException2�� ��ϵ� InstallException���ܸ� ó���Ѵ� 
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main method;

	
	static void install() throws InstallException {
		//InstallException���� �߻��� �ڽ��� ȣ���� main �޼���� ���� ó�� ����
		try {statInstall();} 
		catch (SpaceException2 e) {
			InstallException ie = new InstallException("��ġ�� ���� �߻�");
			ie.initCause(e);
			//SpaceException2��ü e�� ������ �Ǿ InstallException���� ie�� �߻���Ŵ
			//�ٸ� ���ܿ� ���� �߻��� ie�� ���� e�� ��Ͻ�Ŵ 
			throw ie;
		}
	}

	static void statInstall() throws SpaceException2 {
		//�� �޼ҵ带 ȣ���� install()�޼ҵ�� SpaceException2���� ó���� ����
		throw new SpaceException2("��ġ�� ������ �����մϴ�.");
	} 
}//main class;


class SpaceException2 extends Exception{
	SpaceException2(String msg){
		super(msg); //���� Ŭ������ Exception�� �������� ���ܳ����� ����ϴ� �����ڸ� ���
	}
}

class InstallException extends Exception{
	InstallException(String msg){super(msg);}
}