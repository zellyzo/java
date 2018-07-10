package test12;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자1부터5까지 중 1개를 입력해주세여");
		String numStr = scan.nextLine();
		int num = Integer.parseInt(numStr);
		if(num==1) {
			System.out.println("당신은 나서는걸 좋아하는 타입이군요");
		}else if(num==2) {
			System.out.println("당2");
		}else if(num==3) {
			System.out.println("3");
		}else if(num==4) {
			System.out.println("당신은 나4서4요");
		}else if(num==5) {
			System.out.println("나서는걸 좋아하는 타입이군요");
		}else {
				System.out.println("숫자만입력하지");
		}
		System.out.println("입력한 숫자 :" + numStr);
	}
}
