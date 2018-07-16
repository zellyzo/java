package test18;

public class Data {
	int a = 3;
	
//	public Data() {} 기본적으로 생략되어 있지만 따로 사용해야 할 때, 직접 입력해주셔야 합니다.
	public Data() {
	}

	public static void main(String[] args) {
		Data d = new Data();
		d.a = 10;
		
		if(d.a==10) {
			d.a=3;
			d = new Data();
			
		}
		System.out.println(d.a);
	}

}
