package test20;

public class Cart implements Drive {
	protected String name;
	protected int speed;
	protected int damaege;
	public Cart(String name, int speed, int damaege) {
		this.damaege = damaege;
		this.speed = speed;
		this.name = name;
		
	}
	
	@Override
	public void start() {
		System.out.println(name+"�� " + speed + "����  ����߽��ϴ�.");
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
