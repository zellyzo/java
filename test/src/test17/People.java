package test17;

public class People extends Human {

	People(String name, int age, int num) {
		super(name, age, num);
	}

	public void printHuman() {
		System.out.print("¤¾¤¾");
		super.printHuman();
	}

	public static void main(String[] args) {
		People pp = new People("dd", 28, 1);
		pp.printHuman();
	}

}
