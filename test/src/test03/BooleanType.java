package test03;

public class BooleanType {
	
	public static void main(String[] args) {
		boolean bl1 = 3==3;
		System.out.println("3==3 : " +bl1);
		boolean bl2 = 20>11;
		System.out.println("20>11 : " +bl2);
		boolean bl3 = 15<5;
		System.out.println("15<5 : " +bl3);
		boolean bl4 = 2!=2;
		System.out.println("2!=2 : " +bl4);
		boolean bl5 = !bl1;
		System.out.println("!bl1 : " +bl5);
		
		bl1= 3==3;
		if(bl1) {
			System.out.println("bl1�� ���̱���");
		}else {
			System.out.println("bl1�� �����̱���");
		}
		//¦�� ���
		for(int i=2;i<=10;i+=2) {
			System.out.println(i);
		}
		//Ȧ�� ���
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
		//1���� 5���� ,�� �����ؼ� ���(�������� ���ڸ����� 5���� ,�� ����)
		for(int i=1;i<=5;i++) {
			System.out.print(i+",");
		}
		//1���� 5���� ,�� �����ؼ� ����ϰ� ���ڸ����� 5�ڿ� ,�� ��
		for(int i=1;i<=5;i++) {
			System.out.print(i);
			if(i!=5) {
				System.out.print(",");
			}else {
				System.out.println();
			}
		}
		//3�� ����� ��µ� �� "¦"�� ������ �� �� (�������� 0�� ���ö��� "¦"�� ����)
		for(int i=0;i<=9;i++) {
			if(i%3==0) {
				System.out.println("¦");
			}else {
				System.out.println(i);
			}
		}
		//3�� ����� ��µɶ� "¦"�� ������ �ϰ� 0�϶��� "¦"�� �ȳ����� ��
		for(int i=0;i<=9;i++) {
			if(i%3==0 && i!=0) {
				System.out.println("¦");
			}else {
				System.out.println(i);
			}
		}
		
		boolean bb=1==1 && 1!=1;
		
		bb= 1==1 || 1!=1;
	}

}
