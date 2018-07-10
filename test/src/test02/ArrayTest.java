package test02;

public class ArrayTest {
	
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 3;
		arr[1] = 5;
		arr[2] = 7;
	
		
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
