package test20;

public class D1 extends DCart {

	public D1(String name, int speed, int hp, int damaege) {
		super(name, speed, hp, damaege);

	}

	@Override
	public void start() {
		System.out.println(name + "의 최고 속력" + speed + "로 출발했으며 HP는 " + hp + "입니다.");
	}

}
