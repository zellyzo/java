package test05;

public class MyObject {
	int a = 3;
	
	void printA() {
		System.out.println(a);
	}
	
	void setA(int a) {
		this.a=a;
	}
	
	public static void main(String[] args) {
		MyObject mo = new MyObject();
		System.out.println(mo.a);
		mo.setA(20);
		System.out.println(mo.a);
		mo.a =10;
		mo.printA();
	}

}
