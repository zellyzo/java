package test16;

import java.util.Scanner;

public class ListTest {

	public String[] arrStr;
	private int idx = 0;

	ListTest(int length) {
		arrStr = new String[length];
	}

	public boolean add(String str) {
		this.arrStr[idx] = str;
		idx++;
		return true;
	}

	public int indexOf(String str) {
		for (int i = 0; i < this.arrStr.length; i++) {
			if (this.arrStr[i].equals(str)) {
				return i;
			}
		}
		return -1;
	}

	public boolean remove(int idx) {
		this.arrStr[idx] = null;
		return true;
	}

	public int size() {
		return this.arrStr.length;
	}

	public static void main(String[] args) {
		ListTest lt = new ListTest(5);
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < lt.size(); i++) {
			System.out.println("����Ʈ�� ������ ���ڸ� �Է�");
			String str = scan.nextLine();
			lt.add(str);
		}
		System.out.println("������ ���� �� ã�� ���ڸ� �Է�");
		String str = scan.nextLine();
		int idx = lt.indexOf(str);
		if (idx == 1) {
			System.out.println(str + "�� �����ϴ�.");
		} else {
			System.out.println(str + "��" + idx + "�� �ֽ��ϴ�.");

		}
	}
}
