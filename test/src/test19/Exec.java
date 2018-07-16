package test19;

public class Exec {
	public static void eat(Action a) {
		a.eat();
	}

	public static void main(String[] args) {
		Action act = new Animal();
		act.eat();
		act.move();
		Animal h = (Animal) act;
		h.hunt();

		act = new Person();
		Person p = (Person) act;
		p.eat();
		p.sleep();
		p.wark();

		eat(new Person()); // 4~6줄 때문에 가능
		eat(new Animal()); // 4~6줄 때문에 가능
	}
}
