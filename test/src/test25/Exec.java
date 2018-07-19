package test25;

import java.util.HashMap;
import java.util.Scanner;
import test25.impl.UserDAOImpl;

public class Exec {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		UserDAO udao = new UserDAOImpl();
		HashMap<String, String> userInfo = new HashMap<String, String>();
		userInfo.put("uiName",scan.nextLine());
		userInfo.put("uiAge",scan.nextLine());
		userInfo.put("uiEtc",scan.nextLine());

		if (udao.insertUserInfo(userInfo) == 1) {
			System.out.println("등록");
		} else {
			System.out.println("실패");
		}

	}
}
