package test22;
import java.util.Scanner;
public class StringToNumber {
	static Scanner scan = new Scanner(System.in);
	static int num = 0;
	public static boolean parseInt() {
		try {
			num = Integer.parseInt(scan.nextLine());
			return false;
		} catch (NumberFormatException nfe) {
			System.out.println("�� �� �Է��ϼ̽��ϴ�");
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("����");
		System.out.println("���ڸ� �Է����ּ���.");
		boolean isOk = true;
		while (isOk) {
			isOk = parseInt();
		}
		System.out.println("�Է��� ���ڴ� " + num);
		System.out.println("����");
	}
}