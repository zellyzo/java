package test04;

public class JavaTest {
	
	public static void main(String[] args) {
//		int num=3;
//		for(int i=0;i<=10;i++) {
//		  double d=Math.random();
//		  int n =(int)(d*45)+1;
//		  System.out.println(n);
//		}
		// ���빮��: �������� �ߺ����� �ʵ��� �غ���.
//		for(int i=0;i<=10;i++) {
//		  double d=Math.random();
//		  int n =(int)(d*45)+1;
		//if(n!=n){
		//}
//		  System.out.println(n);
//		} �� ����� �ռ� ���� ���� �񱳰� �ƴ� ���Ⱚ���� �������� �ռ� ���� ���� �����Ҽ��� �����Ƿ� ���� �ȵǴ� �ڵ��̴�.
		
		
		int[]arrNum=new int[6];
		// ���� ������ ������ �����ϰ� for������ ���� ��ȣ�� 0���� 5���� ������
		for(int i=0;i<=5;i++) {
			//for(int i=0;i<=arrNum.length-1;i++)�� �����ϳ� ���� �ڵ������ �ƴ�. �ڵ��� ���� ������� �Ͽ��� �����ϰԲ��ϸ� �ȵȴ�.
		  double d=Math.random();
		  arrNum[i] =(int)(d*45)+1;
		  for(int j=0;j<i;j++) {
			if(arrNum[j]==arrNum[i]) {
				i--;
			}
		  }
		}
		for(int i=0;i<=5;i++) {
		  System.out.print((i+1)+"��° ��ȣ :");
		  System.out.println(arrNum[i]);
		}
	}

}
