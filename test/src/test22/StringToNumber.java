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
			System.out.println("잘 못 입력하셨습니다");
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("시작");
		System.out.println("숫자를 입력해주세요.");
		boolean isOk = true;
		while (isOk) {
			isOk = parseInt();
		}
		System.out.println("입력한 숫자는 " + num);
		System.out.println("종료");
	}
}