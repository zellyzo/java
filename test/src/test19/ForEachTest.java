package test19;

public class ForEachTest {
	public static void main(String[] args) {
		String[] arrStr = new String[4];
		for (int i = 0; i < arrStr.length; i++) {
			arrStr[i] = "Å×½ºÆ®" + i;
		}
		for (String str : arrStr) {
			System.out.println(str);
		}
		String[] arr = { "¹Î¿ì", "Çö°æ", "½ÂÇö" };
		String[][] multiArr = {{"1","2","3","4"},{"4"},{"7"}};
		
		for(String[] strs:multiArr) {
			for(String str:strs) {
				System.out.println(str);
			}
		}
	}
}
