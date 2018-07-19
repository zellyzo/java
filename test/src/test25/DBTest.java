package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DBTest {
	public static ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String, String>>();

	public static int insertUser(HashMap<String, String> user) {
		int result = 0;
		int uNum = userList.size() + 1;
		try {
			user.put("uNum", uNum + "");
			userList.add(user);
			result = 1;
		} catch (Exception e) {
			System.out.println("^^");
		}
		return result;
	}

	public static void selectUser() {
		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> user = userList.get(i);
			System.out.println((i + 1) + "��° ����" + user);
		}
	}

	public static void inputUser() {
		HashMap<String, String> hm = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��Է�");
		String name = scan.nextLine();
		System.out.println("�����Է�");
		String age = scan.nextLine();
		hm.put("uName", name);
		hm.put("uAge", age);
		int cnt = insertUser(hm);
		if (cnt == 1) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}

	public static HashMap<String, String> getUser(String uName) {
		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> user = userList.get(i);
			if (user.get("uName").equals(uName)) {
				return user;
			}
		}
		return null;
	}

	public static int userIndexOf(String uName) {
		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> user = userList.get(i);
			if (user.get("uName").equals(uName)) {
				return i;
			}
		}
		return -1;
	}

	public static void removeUser(HashMap<String, String> user) {
		userList.remove(user);
	}

	public static void removeUser(int idx) {
		userList.remove(idx);
	}


	public static void main(String[] args) {
		inputUser();
		inputUser();
		inputUser();
		System.out.println("���� ��  ����Ʈ");
		selectUser();
		int idx = userIndexOf("�̸�");
		if (idx != -1) {
			removeUser(idx);
		}
		System.out.println("���� ��  ����Ʈ");		
		selectUser();
	}
}