package test19;

public class Person implements Action {

	@Override
	public void eat() {
		System.out.println("���� �Դ�");
	}

	@Override
	public void sleep() {
		System.out.println("���� �ܴ�");
	}

	@Override
	public void move() {
		System.out.println("�����δ�");
	}
	
	public void wark() {
		System.out.println("����� �ɾ� �ٴѴ�");
	}

}
