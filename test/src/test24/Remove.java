package test24;

import java.util.ArrayList;

public class Remove {
	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<String>();
		strList.add("strList1");
		strList.add("strList2");
		strList.add("strList3");
		int idx = -1;
		
		for (int i = 0; i < strList.size(); i++) {
			String str = strList.get(i);
			System.out.println("삭제 전 : " + strList);
			if (str.equals("strList" + idx++)) {
				strList.remove(i);
				i++;
			}
			System.out.println("삭제 후 : " + strList);
		}
	}
}
