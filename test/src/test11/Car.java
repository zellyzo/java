package test11;

public class Car {
	private int speed;
	private String name;
	private String company;
	
/*	public void carInfo(int speed, String name, String company) {
		this.speed=speed;
		this.name=name;
		this.company=company;
	}*/
	
	public void carS(int speed) {
		this.speed=speed;
	}
	public void carN(String name) {
		this.name=name;
	}
	public void carC(String company) {
		this.company=company;
	}
	
	public void printInfo() {
		System.out.println(company +"�� " + name +"�� �ְ� ���ǵ��"+speed +"�Դϴ�.");
	}
	


}
