package test22;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("아이디","zelly.y");
		hm.put("이름","조현경");
		hm.put("메일","12287309");
		
		String ib = hm.get("아이디");
		
		System.out.println(ib);
		
		Iterator<String> it = hm.keySet().iterator();
		for(int i=0;i<hm.size();i++) {
			String key = it.next();
			System.out.println(key);
		}
	}
}
