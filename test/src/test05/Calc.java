package test05;

import java.util.Scanner;

public class Calc {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("ù��° ���ڸ� �Է����ּ��� :");
//		String num1Str= scan.nextLine();
//		System.out.print("�ι�° ���ڸ� �Է����ּ��� :");
//		String num2Str = scan.nextLine();
//		System.out.print("ù����+�ι�°���� :");
//		System.out.println(num1Str+num2Str);
//		scan.close();
        //���ڷ� �ν��ؼ� ���ڷ� ����س��� ���̽���.������ Integer.parseInt�� ����Ͽ� ���ڷ� ��ȯ�� ������� ����.
		
		System.out.print("ù��° ���ڸ� �Է����ּ��� :");
		String num1Str= scan.nextLine();
		int num1 = Integer.parseInt(num1Str);
		
		System.out.print("�ι�° ���ڸ� �Է����ּ��� :");
		String num2Str = scan.nextLine();
		int num2 = Integer.parseInt(num2Str);
		
		System.out.print("ù����+�ι�°���� :");
		System.out.println(num1+num2);
		scan.close();
		
//		String numStr ="123";
		//���ڷ� �ν���.
//		int num = Integer.parseInt(numStr);
		//���ڷ� �о���δ�.(���ڷ� �̷��������� ex)"���̻�"�̰� �ȵ�)
//		System.out.println(num+1);
	}

}
