package test09;

public class Obj {
	int num = 1;
	boolean bl = true;
	int getNum() {
		return 1;
	}
	String gerNum( ) {
		return "abc";
	}
	void test() {
		int num=2;
		System.out.println(this.num);
		System.out.println(num);
		System.out.println("난 Obj의 테스트  함수!");
	}
	
	void test2() {
		System.out.println(num);
		System.out.println(bl);
		test();
	}
///////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Obj o = new Obj();
		int num = 0;
		num = 4;
		o.num = 1;
		o.test();
		
		System.out.println(num);
		System.out.println(o.num);
	}


}
