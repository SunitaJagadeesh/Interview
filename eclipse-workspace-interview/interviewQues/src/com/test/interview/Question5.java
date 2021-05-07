package com.test.interview;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Sort ***");
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		Dictionary outputDict = new Hashtable();

		tm.put(4, "abc");
		tm.put(10, "ab2");
		tm.put(5, "abc3");
		tm.put(6, "abc5");
		// Get a set of the entries
		Set set = tm.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
			outputDict.put(me.getKey(), me.getValue());
		}

	}

}
