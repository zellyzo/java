package test03;

public class Arrayfor {
	
	public static void main(String[] args) {
		String[] arr= new String[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]="Å×½ºÆ®~"+(i+1);
			System.out.println(arr[i].length());
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

