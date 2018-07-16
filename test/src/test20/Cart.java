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
		System.out.println(name+"가 " + speed + "으로  출발했습니다.");
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
