package test07;

import java.util.Scanner;
// 테스트 07 폴더 안에 자바폴더안에 유틸이라는 폴더안에 스캐너라는 클래스가 있는 것을 뜸함.
// Ctrl + Shift + O 를 누르면 자동으로 경로를 찾아준다.
public class Condition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("시작값을 정해주세요 : ");
		String startNum = scan.nextLine();
		System.out.print("종료값을 정해주세요 : ");
		String endNum = scan.nextLine();
		
		// System.out.printf("start : %s, end : %s", startNum, endNum); /printf는 잘 사용되지 않는다.
		// System.out.println("start : + startNum + , + endNum +);
		
		int sNum = Integer.parseInt(startNum);
		int eNum = Integer.parseInt(endNum);
		
		if(sNum>eNum) {
			int tmp = sNum; //임시저장소 tmp와 snum 동일
			sNum = eNum; //snum과 enum 동일
			eNum = tmp; // enum과 임시저장소 tmp 동일하게 만들어줌 , 그럼 snum이 클 때 enum과 바뀜
		}
		for(int i=sNum;i<=eNum;i++) {
			System.out.println(i);
		}
		scan.close();
	}
}
