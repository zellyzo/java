package zelly;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	Scanner scan = new Scanner(System.in);
	ArrayList<String> name = new ArrayList<String>();
	int num = -1;

	public void callOrder(String order) {
		scan = new Scanner(System.in);
		if ("1".equals(order)) {
			if (name.size() == 0) {
				System.out.println("���� ��ϵ� ������ �����ϴ�.");
			}
			for (int i = 0; i < name.size(); i++) {
				System.out.println(name.get(i));
			}
			System.out.println("");
		} else if ("2".equals(order)) {
			System.out.println("������ ������ �̸��� �Է��ϼ���.");
			name.add(scan.nextLine());
			num++;
			System.out.println("\"" + name.get(num) + "\"" + " �������� �����Ǿ����ϴ�.");
			System.out.println("");
		} else if ("3".equals(order)) {
			if (name.size() == 0) {
				System.out.println("���� ��ϵ� ������ �����ϴ�.");
				System.out.println("");
			} else {
				for (int i = 0; i < name.size(); i++) {
					System.out.println(name.get(i));
				}
				System.out.println("������ ������ �̸��� �Է��ϼ���.");
				String reName = scan.nextLine();
				int n = name.indexOf(reName);
				if (n == -1) {
					System.out.println("�ش� ���� ������ �����ϴ�. �ٽ� Ȯ�����ּ���.");
				} else {
					System.out.println(name.get(n) + " ������ ���ο� �̸��� �Է��ϼ���.");
					String na = name.get(n);
					name.set(n, scan.nextLine());
					System.out.println(na + " ������ " + name.get(n) + "�� ���� �Ǿ����ϴ�.");
				}
			}
		} else if ("4".equals(order)) {
			if (name.size() == 0) {
				System.out.println("���� ��ϵ� ������ �����ϴ�.");
			} else {
				for (String nam : name) {
					System.out.println(nam);
				}
				System.out.println("������ ������ �̸��� �Է��ϼ���");
				String deName = scan.nextLine();
				int dn = name.indexOf(deName);
				if (dn == -1) {
					System.out.println("�ش� ������ ������ �����ϴ�. �ٽ� Ȯ�����ּ���.");
				} else {
					System.out.println(name.get(dn) + " ������ ������ �����Ǿ����ϴ�.");
					name.remove(dn);
					num--;
				}
			}
		} else if ("q".equals(order)) {
			System.out.println("�����ϰ� �ͱ���");
			// System.exit(0);
		} else {
			System.out.println("�������� �ʴ� ��ɾ� �Դϴ�.");
		}
	}
}
