package test01;

public class LoopIf {

	public static void main(String[] args) {
		String numStr = "1";
		int num = Integer.parseInt(numStr);
		System.out.println(num);

		num++;
		System.out.println(num);
 
		num = num + 10;
		System.out.println(num);

		num += 10;
		System.out.println(num);

		if (num == 22) {
			System.out.println("22�� �³�~");
		} else if (num > 22) {
			System.out.println("22���� ũ��");
		} else {
			System.out.println("22�� �ƴϳ�~");
		}
		// ���⼭���ʹ� �ݺ��� �ؾ���~
		/*
		 * ������� �������
		 */
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
		}
		for(int i = 1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		for(int i = 1;i<=10;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}

}
