package test04;

public class ClassTest {
	int num = 3;
	
	int getNum() {
		int num=10;
		return num;
		//return num�� ����. this.�� �����Ǿ� �ִ� ����.
		//int num=10���� �ٲ����� �ٲ�� �� ���� �ҷ�����ʹٸ� this. �� ���̸� ��.
	}
	
	public static void main(String[] args) {
			ClassTest ct = new ClassTest();
			System.out.println(ct.num);
			int num= ct.getNum();
			System.out.println(num);
	}
	
}
