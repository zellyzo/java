package test20;

public class DCart implements Driv {
	protected String name;
	protected int speed;
	protected int hp;
	protected int damaege;

	public DCart(String name, int speed, int hp, int damaege) {
		this.damaege = damaege;
		this.hp = hp;
		this.speed = speed;
		this.name = name;

	}

	@Override
	public void start() {
		System.out.println(name + "�� " + speed + "����  ����߽��ϴ�.");
	}

	@Override
	public void hp() {
		// TODO Auto-generated method stub

	}

	@Override
	public String attack(int damaege) {
		return damaege + "�� �����մϴ�.";
	}

	@Override
	public void stop() {
		System.out.println(name + "�� ������ϴ�.");
	}

}
