package test24;

import java.util.ArrayList;

public class Delete {
	public static void main(String[] args) {
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("strList1");
		strList.add("strList3");
		strList.add("strList2");
		
		int idx = -1;
		for(int i=0;i<strList.size();i++) {
			String str = strList.get(i);
			if(str.equals("strList1")) {
				idx = i;
			}
		}
		System.out.println("삭제 전 : " + strList);
		if(idx!=1) {
			strList.remove("strList1");
		}
		System.out.println("삭제 후 : " + strList);
	}

}
