package test12;

public class MethodTest {

	public void print() {
		System.out.println("�Լ�");
	}

	public void print(int a) {
		System.out.println(a + "�Լ�");
	}

	public static void main(String[] args) {
		MethodTest me = new MethodTest();
		me.print();
		me.print(10);
	}

}
