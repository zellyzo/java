package test14;

public class Dog extends Animal {
	public String type;
	public Dog() {
		System.out.println("난 도그생성자");
	}

	public void pritInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(type);
		
	}
}
