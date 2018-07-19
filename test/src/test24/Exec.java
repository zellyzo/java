package test24;

import java.util.Scanner;

import test23.Controller;

public class Exec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String order = "";
		Controller c = new Controller();
		while (!"q".equals(order)) {
			System.out.println("───────────────── 유저 프로그램  ─────────────────");
			System.out.println("1.유저리스트, 2.유저생성, 3.유저수정, 4.유저삭제, q.종료");
			System.out.println("실행할 명령어를 입력해주세요.");
			order = scan.nextLine();
			c.callOrder(order);
		}
		System.out.println("─────────────── 유저 프로그램 종료   ───────────────");
		scan.close();
	}
}