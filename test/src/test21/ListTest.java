package test21;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<String>();
		System.out.println(strList.size());
		
		strList.add("¹Ú°æÈÆ");
		strList.add("Àü½ÂÇö");
		strList.add("±è±â¼·");
		System.out.println(strList.size());
		
		strList.remove("±è±â¼·");
		System.out.println(strList.size());

		int idx = strList.indexOf("±è±â¼·");
		System.out.println(idx);

	}
}