package test03;

public class Arrayfor2 {
	public static void main(String[] args) {
		int[] numArr= new int[6];
		
		boolean b=true;
		for(int i=0;i<numArr.length;i++) {
			numArr[i]=i;
			if(b) {
				b=false;
				i--;
			}
			System.out.println(i);
		}
		
//		for(int i=0;i<numArr.length;i++) {
//			System.out.println(numArr[i]);
//		}
	}

}
