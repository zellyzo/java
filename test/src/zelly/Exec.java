package zelly;

import java.util.Scanner;

public class Exec {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String order = "";
		Controller c = new Controller();
		while (!"q".equals(order)) {
			System.out.println("====���� ���α׷�====");
			System.out.println("1. ��������Ʈ, 2. ��������, 3.��������, 4. ��������, q.����");
			System.out.println("�˸��� ��ɾ �Է����ּ���");
			order = scan.nextLine();
			c.callOrder(order);
		}
		System.out.println("====���� ���α׷� ����====");
		scan.close();
	}
}
