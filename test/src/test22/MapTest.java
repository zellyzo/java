package test22;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("���̵�","zelly.y");
		hm.put("�̸�","������");
		hm.put("����","12287309");
		
		String ib = hm.get("���̵�");
		
		System.out.println(ib);
		
		Iterator<String> it = hm.keySet().iterator();
		for(int i=0;i<hm.size();i++) {
			String key = it.next();
			System.out.println(key);
		}
	}
}
