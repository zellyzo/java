package test05;

import java.util.Scanner;

public class Calc {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("첫번째 숫자를 입력해주세요 :");
//		String num1Str= scan.nextLine();
//		System.out.print("두번째 숫자를 입력해주세요 :");
//		String num2Str = scan.nextLine();
//		System.out.print("첫숫자+두번째숫자 :");
//		System.out.println(num1Str+num2Str);
//		scan.close();
        //문자로 인식해서 문자로 출력해내는 케이스임.이유는 Integer.parseInt를 사용하여 숫자로 변환을 안해줬기 때문.
		
		System.out.print("첫번째 숫자를 입력해주세요 :");
		String num1Str= scan.nextLine();
		int num1 = Integer.parseInt(num1Str);
		
		System.out.print("두번째 숫자를 입력해주세요 :");
		String num2Str = scan.nextLine();
		int num2 = Integer.parseInt(num2Str);
		
		System.out.print("첫숫자+두번째숫자 :");
		System.out.println(num1+num2);
		scan.close();
		
//		String numStr ="123";
		//문자로 인식함.
//		int num = Integer.parseInt(numStr);
		//숫자로 읽어들인다.(숫자로 이뤄졌을때임 ex)"일이삼"이건 안됨)
//		System.out.println(num+1);
	}

}
