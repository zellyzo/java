package test12;

public class MethodTest {

	public void print() {
		System.out.println("함수");
	}

	public void print(int a) {
		System.out.println(a + "함수");
	}

	public static void main(String[] args) {
		MethodTest me = new MethodTest();
		me.print();
		me.print(10);
	}

}
