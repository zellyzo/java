package test10;

public class ClassTest {
	int num;
	String str;
	
	public void test() {
		System.out.println("�� �����ǰ���?");
	}
	public static void main(String[] args) {
		ClassTest ct = new ClassTest();
		ct.num = 7;
		System.out.println(ct.num);
		ct.test();
		
	}
}
