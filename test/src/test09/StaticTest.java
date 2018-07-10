package test09;

public class StaticTest {
	static int numSt = 10;
	int num = 20;
	
	public static void main(String[] args) {	
		Test t = new Test();
		t.chNum();
		System.out.println(StaticTest.numSt);
		
		Person p = new Person();
		p.setName("捞抚");
		p.setAge(20);
		p.setAddress("林家林家林家林家林家林家林家林家林家林家");
		System.out.println(p);
		
	}
	

}
