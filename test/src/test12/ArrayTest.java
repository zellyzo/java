package test12;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����1����5���� �� 1���� �Է����ּ���");
		String numStr = scan.nextLine();
		int num = Integer.parseInt(numStr);
		if(num==1) {
			System.out.println("����� �����°� �����ϴ� Ÿ���̱���");
		}else if(num==2) {
			System.out.println("��2");
		}else if(num==3) {
			System.out.println("3");
		}else if(num==4) {
			System.out.println("����� ��4��4��");
		}else if(num==5) {
			System.out.println("�����°� �����ϴ� Ÿ���̱���");
		}else {
				System.out.println("���ڸ��Է�����");
		}
		System.out.println("�Է��� ���� :" + numStr);
	}
}
