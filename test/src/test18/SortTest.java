package test18;

public class SortTest {

	public static void printinfo(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}

		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 8, 7, 6, 4 };
		sort(arr);
		printinfo(arr);

	}
}
