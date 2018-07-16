package test19;

public class Person implements Action {

	@Override
	public void eat() {
		System.out.println("밥을 먹다");
	}

	@Override
	public void sleep() {
		System.out.println("잠을 잔다");
	}

	@Override
	public void move() {
		System.out.println("움직인다");
	}
	
	public void wark() {
		System.out.println("사람은 걸어 다닌다");
	}

}
