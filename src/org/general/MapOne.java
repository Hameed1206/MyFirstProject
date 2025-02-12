package org.general;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapOne {

	public static void main(String[] args) {
	
		
		Map <String, Integer> mp = new LinkedHashMap();
		mp.put("CSK", 5);
		mp.put("MI", 5);
		mp.put("SRH", 3);
		mp.put("RCB", 2);
		mp.put("KKR", 3);
		mp.put("RCB", 3);
		
		System.out.println(mp);
		
		System.out.println(mp.get("SRH"));
		
		System.out.println(mp.containsKey("RCB"));
		System.out.println(mp.containsValue(4));
		
		mp.replace("SRH", 4);
		System.out.println(mp);
		
		mp.remove("KKR");
		System.out.println(mp);
		
		System.out.println(mp.keySet());
		System.out.println(mp.values());

		
		System.out.println(mp.size());
		
		//entryset
		
		for ( Entry<String, Integer> h : mp.entrySet()) {
			// System.out.println(h);
//			System.out.println(h.getKey());
//			System.out.println(h.getValue());
			System.out.println(h.getKey()+" -> "+h.getValue());
			
		}
		
	}

}
