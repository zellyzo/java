package test05;

public class StaticTest {
	int a = 3;
	
	public static void main(String[] args) {
		StaticTest st =new StaticTest();
		st.a=4;
		st=new StaticTest();
		System.out.println(st.a);
	}

}

