package test04;

public class ClassTest {
	int num = 3;
	
	int getNum() {
		int num=10;
		return num;
		//return num과 같음. this.이 생략되어 있는 것임.
		//int num=10으로 바꼈지만 바뀌기 전 값을 불러오고싶다면 this. 을 붙이면 됨.
	}
	
	public static void main(String[] args) {
			ClassTest ct = new ClassTest();
			System.out.println(ct.num);
			int num= ct.getNum();
			System.out.println(num);
	}
	
}
