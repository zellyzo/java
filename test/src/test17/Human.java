package test17;

public class Human {
	protected String name;
	protected int age;
	public int num;
	
	Human(String name, int age,int num) {
		this.name = name;
		this.age = age;
		this.num = num;
	}
	public void printHuman() {
		System.out.println("�̸�" + name);
		System.out.println("����" + age);
		System.out.println("��ȣ" + num);
	}
}
