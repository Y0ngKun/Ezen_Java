package com.Kwon.ch07Project;

public class Ex07_07 {

	public static void main(String[] args) {
		//������
		Car car = new Car();
		FireEngine fe = new FireEngine();
		FireEngine fe2 = new FireEngine();
		
		fe2.water();
		fe2.stop();
		
		car.stop();
//		car.water(); �ڼ��� �޼ҵ� ���Ұ�
		
		//�������� ���� �θ�Ŭ������ ��ü���� �ڼ�Ŭ���� ��ü�� �����ؼ� ��� �� �� ����.
		//��, ���(�޼���,������) �θ�͸� ��� ����
		car = fe;
//		car.water(); ������ �θ� ��ü�� �ڼ� ��ü�� ������������ �ڼ� Ŭ������ .water �޼ҵ�� ��� �Ұ��ϴ�.
		
		fe2 = (FireEngine)car;
		//����ü�� �ڽİ�ü�� ����ȯ�Ͽ� �����ϸ� �ڼհ�ü�� ������� ����� ����
		Car car1 = new Car();
		FireEngine fe3;
		//�������� ���� ��ü�� �ڼ����� ����ȯ�ϸ� �ڼ��� �޼��� ��밡��
//		fe3 = (FireEngine)car1;
//		fe3.water();
//		car1.water(); //�ȵ� �� �ȵ��� ���ؾȰ�
//		
//		FireEngine fe4;
//		fe4 = (FireEngine)(new Object());
//		fe4.water();
		
		
		
		//instanceof�� �ڵ�����ȯ�� �Ǵ� �������Ͻô� true�̳�
		//�θ� �ڽ��� ���������� ���Խÿ��� ���� ����ȯ�̹Ƿ� false�� ����
		//instanceof ���� �ǿ����ڴ� ���ǵ� ������ �����̰� ���� �ǿ����ڴ� ������ ������ Ŭ����
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}

		if(fe instanceof Car) {
			System.out.println("fe�� Car������ ����ȯ �����մϴ�");
		}
		if(fe instanceof Object) {
			System.out.println("fe�� Object������ ����ȯ �����մϴ�");
		}
		if(car1 instanceof FireEngine) {
			System.out.println("car1�� FireEngine������ ����ȯ �����մϴ�");
		}else {
			System.out.println("car1�� FireEngine���� ����ȯ�� �ȵ˴ϴ�");
		}
		if(car1 instanceof Car) {
			System.out.println("car1�� Car�� ��ü�Դϴ�");
		}
		
		
		Object obj = new FireEngine();
		FireEngine fo = (FireEngine)obj;
		fo.water();

		
	}//main method;;

}

class Car {//���� �����ڰ� default
	String color;//���� �����ڰ� default
	int door;
	
	void drive() {//���������ڰ� default
		System.out.println("drive, Brrrr");
	}
	void stop() {
	System.out.println("drive, Brrrr");
	}
}//class car;;

class FireEngine extends Car{
	//class Car�� �ִ� ��������� ����޼��带 ���--�� �����ڿ� �ʱ�ȭ ����� ��� �ȵ�,private ����� ��� �ȵ�
	void water() {
		System.out.println("water!!");
	}
}

