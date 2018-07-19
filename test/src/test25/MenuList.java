package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuList {
	public static ArrayList<HashMap<String, String>> menuList = new ArrayList<HashMap<String, String>>();
	static Scanner scan = new Scanner(System.in);
	
	public static void inputData() {
		HashMap<String, String> hm = new HashMap<String, String>();
		System.out.println("뭐먹지?");
		hm.put("mMenu", scan.nextLine());
		System.out.println("얼마나?");
		hm.put("mSer", scan.nextLine());
		System.out.println("예산은?");
		hm.put("mPrice", scan.nextLine());
		
		menuList.add(hm);
		if (menuList != null) {
			System.out.println("성공");
		} else {
			System.out.println("에러");
		}
	}

	public static void selectMenu() {
		for (int i = 0; i < menuList.size(); i++) {
			HashMap<String, String> ml = menuList.get(i);
			ml.keySet();
			System.out.println((i + 1) + "번째 메뉴 " + ml);
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
