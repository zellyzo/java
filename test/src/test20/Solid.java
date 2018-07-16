package test20;

public class Solid extends Cart {

	public Solid(String name, int speed, int damaege) {
		super(name, speed, damaege);
	}
	public String attack(int damaege) {
		return this.damaege+ damaege + "만큼 공격합니다.";
	}

}
