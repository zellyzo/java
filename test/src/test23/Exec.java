package test23;

import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������������������������������� ���� ���α׷�  ����������������������������������");
		System.out.println("1.��������Ʈ, 2.��������, 3.��������, 4.��������, q.����");
		System.out.println("������ ��ɾ �Է����ּ���.");
		String order = "";
		Controller c = new Controller();
		while (!"q".equals(order)) {
			order = scan.nextLine();
			c.callOrder(order);
		}
		System.out.println("������������������������������ ���� ���α׷� ����   ������������������������������");
	}
}
