package test20;

public class D1 extends DCart {

	public D1(String name, int speed, int hp, int damaege) {
		super(name, speed, hp, damaege);

	}

	@Override
	public void start() {
		System.out.println(name + "�� �ְ� �ӷ�" + speed + "�� ��������� HP�� " + hp + "�Դϴ�.");
	}

}
