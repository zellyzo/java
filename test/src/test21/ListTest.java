package test21;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<String>();
		System.out.println(strList.size());
		
		strList.add("�ڰ���");
		strList.add("������");
		strList.add("��⼷");
		System.out.println(strList.size());
		
		strList.remove("��⼷");
		System.out.println(strList.size());

		int idx = strList.indexOf("��⼷");
		System.out.println(idx);

	}
}