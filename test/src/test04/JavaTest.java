package test04;

public class JavaTest {
	
	public static void main(String[] args) {
//		int num=3;
//		for(int i=0;i<=10;i++) {
//		  double d=Math.random();
//		  int n =(int)(d*45)+1;
//		  System.out.println(n);
//		}
		// 응용문제: 랜덤값이 중복되지 않도록 해볼것.
//		for(int i=0;i<=10;i++) {
//		  double d=Math.random();
//		  int n =(int)(d*45)+1;
		//if(n!=n){
		//}
//		  System.out.println(n);
//		} 이 방법은 앞서 나온 값과 비교가 아닌 산출값과의 비교임으로 앞서 나온 값과 대조할수가 없으므로 말이 안되는 코딩이다.
		
		
		int[]arrNum=new int[6];
		// 방의 갯수를 위에서 지정하고 for문에서 방의 번호를 0부터 5까지 지정함
		for(int i=0;i<=5;i++) {
			//for(int i=0;i<=arrNum.length-1;i++)도 가능하나 좋은 코딩방법은 아님. 코딩은 보는 사람으로 하여금 생각하게끔하면 안된다.
		  double d=Math.random();
		  arrNum[i] =(int)(d*45)+1;
		  for(int j=0;j<i;j++) {
			if(arrNum[j]==arrNum[i]) {
				i--;
			}
		  }
		}
		for(int i=0;i<=5;i++) {
		  System.out.print((i+1)+"번째 번호 :");
		  System.out.println(arrNum[i]);
		}
	}

}
