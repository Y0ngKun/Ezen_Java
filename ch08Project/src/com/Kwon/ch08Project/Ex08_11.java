package com.Kwon.ch08Project;

public class Ex08_11 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}
		catch(SpaceException se) {
			System.out.println("���� �޽��� : " + se.getMessage());
			//�����ڰ� ���� SpaceException���
			se.printStackTrace();
			System.out.println("������ Ȯ���� �Ŀ� �ٽ� ��ġ �Ͻñ� �ٶ��ϴ�.");
		}
		catch(MemoryException me) {
			System.out.println("���� �޽��� : " + me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���.");
			//�����ڰ� ���� MemoryException���
		}
		finally {
			deleteTempFiles();
		}
	}

	
	static void startInstall() throws SpaceException, MemoryException {
		// �� �޼��� ����ô� ������ SpaceException, MemoryException ����ó��
		if(!enoughSpace())
			throw new SpaceException("��ġ������ �����մϴ�.");
		if(!enoughMemory()) // ����� �޸𸮰� ������
			throw new MemoryException("�޸𸮰� �����մϴ�");
	}

static void copyFiles() {}
static void deleteTempFiles() {}

static boolean enoughSpace() {return false;}
static boolean enoughMemory() {return true;}



class SpaceException extends Exception{
	//����ó�� Ŭ���� Exception�� ����� �����ڰ� ����� ����ó�� Ŭ����
	SpaceException(String msg){
		//���ܰ��ø޼����� ���� ��ü�� �߰����ֱ�� super(Exception�� Ȱ��);
		super(msg);	
	}
}
class MemoryException extends Exception{
	//����ó�� Ŭ���� Exception�� ����� �����ڰ� ����� ����ó�� Ŭ����
	MemoryException(String msg){
		//���ܰ��ø޼����� ���� ��ü�� �߰����ֱ�� super(Exception�� Ȱ��);
		super(msg);
	}
}
	
}//main class;
