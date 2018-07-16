package test20;

public class TraningCart extends Cart {

	public TraningCart(String name, int speed, int damaege) {
		super(name, speed, damaege);
	}

	public void start() {
		System.out.println(name + "가 " + speed + "으로  꼴지로 출발했습니다.");
	}
	
}

