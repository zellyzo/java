package test02;

public class StringTest {
	
	public static void main(String[] args) {
		String name ="¹Ú°æÈÆ";
		
		System.out.println(name.length());
		
		String name2 = "¹Ú°æÈÆ";
		System.out.println(name2.length());
		
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name==name2);
		
		int a= 4;
		int b= 5;
		int tmp= a;
		a=b;
		b = tmp;
		
	}

}
