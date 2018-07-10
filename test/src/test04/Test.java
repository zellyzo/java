package test04;

public class Test {
	
	public static void main(String[] args) {
//		int a=3;
//		String str=a + "";
//		
//		boolean bl = true;
//		
		String str ="12345";
	
		int strLength = str.length();
		//int strLength = str.length(); == str.length();
		int idx = str.indexOf("1");
		
		System.out.println(strLength);
		System.out.println(idx);
		
		String str2= str.replace("12","ÀÏÀÌ");
		System.out.println(str2);
		System.out.println(str);
	}

}
