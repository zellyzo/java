package test21;

import java.util.ArrayList;

public class ListTest3 {
	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<Student>();
		for (int i = 0; i <= 5; i++) {
			String name = "�׽�Ʈ" + i;
			int grade = (int) (Math.random() * 3) + 1;
			sList.add(new Student(name, grade));
		}
		
		for (Student st : sList) {
			System.out.println(st.name + "," + st.grade);
		}
	}
}