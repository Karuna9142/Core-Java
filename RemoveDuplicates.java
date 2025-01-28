package com.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		List<Integer> mobileNos = new ArrayList<Integer>();
		mobileNos.add(1111);
		mobileNos.add(2222);
		mobileNos.add(3333);
		mobileNos.add(4444);
		mobileNos.add(5555);
		mobileNos.add(6666);
		mobileNos.add(3333);
		mobileNos.add(7777); */
		
		List<Integer> mobileNos = List.of(1111,2222,3333,1111,4444,5555,6666,2222);
		
		System.out.println(mobileNos); //[1111,2222....]
		
		Set<Integer> uniqueMobileNos = new LinkedHashSet<Integer>();
		uniqueMobileNos.addAll(mobileNos);
		System.out.println(uniqueMobileNos);
	}

}
