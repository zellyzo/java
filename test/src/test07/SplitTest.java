package test07;

import java.util.Scanner;

public class SplitTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생들의 점수를 ,로 구분하여 입력해주세요");
		String pointStr = scan.nextLine();
		scan.close();
		
		String[] arrStr = pointStr.split(",");
		int[] arrNum = new int[arrStr.length];
		
		for(int i=0;i<arrStr.length;i++) {
			arrNum[i] = Integer.parseInt(arrStr[i]);
			
		}
		
	}
		
}

