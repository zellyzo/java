package test07;

import java.util.Scanner;
// �׽�Ʈ 07 ���� �ȿ� �ڹ������ȿ� ��ƿ�̶�� �����ȿ� ��ĳ�ʶ�� Ŭ������ �ִ� ���� ����.
// Ctrl + Shift + O �� ������ �ڵ����� ��θ� ã���ش�.
public class Condition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���۰��� �����ּ��� : ");
		String startNum = scan.nextLine();
		System.out.print("���ᰪ�� �����ּ��� : ");
		String endNum = scan.nextLine();
		
		// System.out.printf("start : %s, end : %s", startNum, endNum); /printf�� �� ������ �ʴ´�.
		// System.out.println("start : + startNum + , + endNum +);
		
		int sNum = Integer.parseInt(startNum);
		int eNum = Integer.parseInt(endNum);
		
		if(sNum>eNum) {
			int tmp = sNum; //�ӽ������ tmp�� snum ����
			sNum = eNum; //snum�� enum ����
			eNum = tmp; // enum�� �ӽ������ tmp �����ϰ� ������� , �׷� snum�� Ŭ �� enum�� �ٲ�
		}
		for(int i=sNum;i<=eNum;i++) {
			System.out.println(i);
		}
		scan.close();
	}
}
