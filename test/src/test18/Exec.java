package test18;

import java.util.Scanner;

public class Exec {

	public static void po(Person[] ps) {
		for (int i = 0; i < ps.length; i++) {
			for (int j = i + 1; j < ps.length; j++) {
				if (ps[i].point < ps[j].point) {
					Person tmp = ps[i];
					ps[i] = ps[j];
					ps[j] = tmp;
				}
			}
		}
	}

	public static void sc(Person[] ps) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < ps.length; i++) {
			ps[i] = new Person();
			ps[i].name = (i + 1) + "�� ���";
			System.out.println(i + 1 + "��° ����� ������ �Է�");
			ps[i].point = Integer.parseInt(scan.nextLine());
		}
	}

	public static void ra(Person[] ps) {
		for (int i = 0; i < ps.length; i++) {
			ps[i].rank = i + 1;
		}
	}

	public static void main(String[] args) {
		Person[] ps = new Person[5];
		sc(ps);
		po(ps);
		ra(ps);

		for (int i = 0; i < ps.length; i++) {
			System.out.println(ps[i].rank + "�� : " + ps[i].name + " (" + ps[i].point + "��) ");

		}

	}
}
