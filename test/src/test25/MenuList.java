package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuList {
	public static ArrayList<HashMap<String, String>> menuList = new ArrayList<HashMap<String, String>>();
	static Scanner scan = new Scanner(System.in);
	
	public static void inputData() {
		HashMap<String, String> hm = new HashMap<String, String>();
		System.out.println("������?");
		hm.put("mMenu", scan.nextLine());
		System.out.println("�󸶳�?");
		hm.put("mSer", scan.nextLine());
		System.out.println("������?");
		hm.put("mPrice", scan.nextLine());
		
		menuList.add(hm);
		if (menuList != null) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}

	public static void selectMenu() {
		for (int i = 0; i < menuList.size(); i++) {
			HashMap<String, String> ml = menuList.get(i);
			ml.keySet();
			System.out.println((i + 1) + "��° �޴� " + ml);
		}
	}

	public static void main(String[] args) {
		inputData();
		inputData();
		inputData();
		selectMenu();
		scan.close();
	}
}
