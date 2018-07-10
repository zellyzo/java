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
			System.out.println("bl1은 참이군요");
		}else {
			System.out.println("bl1은 거짓이군요");
		}
		//짝수 출력
		for(int i=2;i<=10;i+=2) {
			System.out.println(i);
		}
		//홀수 출력
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
		//1부터 5까지 ,를 포함해서 출력(문제점은 끝자리수인 5에도 ,가 나옴)
		for(int i=1;i<=5;i++) {
			System.out.print(i+",");
		}
		//1부터 5까지 ,를 포함해서 출력하고 끝자리수인 5뒤에 ,를 뺌
		for(int i=1;i<=5;i++) {
			System.out.print(i);
			if(i!=5) {
				System.out.print(",");
			}else {
				System.out.println();
			}
		}
		//3의 배수가 출력될 때 "짝"이 나오게 할 것 (문제점은 0이 나올때도 "짝"이 나옴)
		for(int i=0;i<=9;i++) {
			if(i%3==0) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
		}
		//3의 배수가 출력될때 "짝"이 나오게 하고 0일때는 "짝"이 안나오게 함
		for(int i=0;i<=9;i++) {
			if(i%3==0 && i!=0) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
		}
		
		boolean bb=1==1 && 1!=1;
		
		bb= 1==1 || 1!=1;
	}

}
