package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashSet - unordered
				HashMap hs = new HashMap();
				hs.put("monitor",5000);
				hs.put("keyboard",3000);
				hs.put("mouse", 200);
				hs.put("ups",4000);
				hs.put("speakers",3000);
				System.out.println(hs);
				
				//LinkedHashSet - ordered
				LinkedHashMap lhm = new LinkedHashMap();
				lhm.put("monitor",5000);
				lhm.put("keyboard",3000);
				lhm.put("mouse", 200);
				lhm.put("ups",4000);
				lhm.put("speakers",3000);
				System.out.println(lhm);
				
				
				//TreeSet - sorted
				TreeMap ts = new TreeMap();
				ts.put("monitor",3000);
				ts.put("keyboard",3000);
				ts.put("mouse",500);
				ts.put("ups",4000);
				ts.put("speaker",2000);
				
				System.out.println(ts);

	}

}
