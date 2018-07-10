package test12;

public class FuncTest {
	
/*	public void printLopp(int start, int end) {
		for(int i=start;i<=end;i++) {
			System.out.println(i);
		}
	}*/
	
	public void printLoppp(int start, int end) {
		for(int i=start;i>=end;i--) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		FuncTest ft = new FuncTest();
/*		ft.printLopp(5, 10);
		ft.printLopp(6, 14);
		ft.printLopp(9, 77);*/
		ft.printLoppp(8, 25);
		ft.printLoppp(10, 5);
		
	}

}
