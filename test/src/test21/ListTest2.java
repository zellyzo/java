package test21;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 1; i < 7; i++) {
			int rNum = (int) (Math.random() * 45) + 1;
			al.add(rNum);
		}
		
		
		for (int num : al) {
			System.out.println(num);
		}
	}
}
