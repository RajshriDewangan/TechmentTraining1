package com.techment.day8.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;


public class MapDemo {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put(1, "ABC");
		hm.put(3, "XYZ");
		hm.put(2, "hii");
		hm.put(4, "hello");

		System.out.println(hm);
		
		/*
		 * for(Entry<Integer, String> e : hm.entrySet())
		{
			System.out.println(e);
		}
		*/
		
		LinkedHashMap lm = new LinkedHashMap();
		lm.put(1, "XYZ");
		lm.put(2, "abc");
		lm.put(3, "xyz");
		lm.put(4, "psd");
		
		System.out.println(lm);
		
		TreeMap tm = new TreeMap();
		tm.put(9, 1009);
		tm.put(1, 1001);
		tm.put(5, 1005);
		tm.put(4, 1004);
		tm.put(0, 1000);

		System.out.println(tm);
	}

}
