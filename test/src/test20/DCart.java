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
		System.out.println(name + "가 " + speed + "으로  출발했습니다.");
	}

	@Override
	public void hp() {
		// TODO Auto-generated method stub

	}

	@Override
	public String attack(int damaege) {
		return damaege + "로 공격합니다.";
	}

	@Override
	public void stop() {
		System.out.println(name + "가 멈췄습니다.");
	}

}
