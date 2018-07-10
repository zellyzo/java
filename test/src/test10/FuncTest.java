package test10;

public class FuncTest {

	public void add(int a, int b) {
		System.out.println("인트더하기 :" + (a + b));
	}
	public void add(long a, long b) {
		System.out.println("롱더하기 :" + (a + b));
	}

	public static void main(String[] args ) {
		FuncTest fun = new FuncTest();
		fun = new FuncTest();
		int a = 5;
		int b = 7;
		
		fun.add(a, b);
		
		long c = 8888888;
		long d = 8888888;
		fun.add(c, b);
		
	}
	
}
