package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
     
	// HashSet - unordered
		HashSet hs = new HashSet();
		hs.add("monitor");
		hs.add("keyboard");
		hs.add("mouse");
		hs.add("ups");
		hs.add("speakers");
		System.out.println(hs.add("monitor"));
		System.out.println(hs);
		
		//LinkedHashSet - ordered
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("monitor");
		lhs.add("keyboard");
		lhs.add("mouse");
		lhs.add("ups");
		lhs.add("speaker");
		System.out.println(lhs);
		
		//TreeSet - sorted
		TreeSet ts = new TreeSet();
		ts.add("monitor");
		ts.add("keyboard");
		ts.add("mouse");
		ts.add("ups");
		ts.add("speaker");
		
		System.out.println(ts);
		System.out.println(ts.descendingIterator());
	}

}
