package test20;

public class TraningCart extends Cart {

	public TraningCart(String name, int speed, int damaege) {
		super(name, speed, damaege);
	}

	public void start() {
		System.out.println(name + "�� " + speed + "����  ������ ����߽��ϴ�.");
	}
	
}

