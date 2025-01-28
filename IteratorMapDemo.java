package com.collections;

import java.util.HashMap;
import java.util.Set;

public class IteratorMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("monitor", 5000);
        hm.put("keyboard", 500);
        hm.put("mouse", 2000);
        hm.put("monitor", 1000);
        hm.put("ups", 2500);
        
        Set<String> keys = hm.keySet();
        for(String k : keys)
        	System.out.println(k+":"+hm.get(k));
	}

}
