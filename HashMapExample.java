package com.programming.class5;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(123, "ABC");
		hMap.put(123, null);//second record with same key will override first  record
		hMap.put(121, null);
		hMap.put(null, "PQR");
		hMap.put(null, "XYZ");
		hMap.put(135, "MNO");
		
		
		hMap.remove(135);
		//THIS is how we traverse Map
		for(Entry<Integer, String> m: hMap.entrySet()) {
			System.out.println(m.getKey() + "  : " + m.getValue());
		}

	}

}
