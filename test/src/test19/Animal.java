package test19;

public class Animal implements Action {

	@Override
	public void eat() {
		System.out.println("������ ���� �Դ�");
	}

	@Override
	public void sleep() {
		System.out.println("������ ���� �ܴ�");
	}

	@Override
	public void move() {
		System.out.println("������ �����δ�");
	}
	
	public void hunt() {
		System.out.println("������ ����� �Ѵ�");
	}
}