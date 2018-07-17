package test22;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs.size());
		hs.add("d");
		hs.add("ssssssd");
		hs.add("3");
		System.out.println(hs.size());
	}
}
