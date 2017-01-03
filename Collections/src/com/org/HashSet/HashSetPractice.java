package com.org.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

	public static void main(String[] args) {
		
		HashSet <String> al = new HashSet <String>();
		
		al.add("ravi");
		al.add("Mahi");
		al.add("ravi");
		
		Iterator <String> itr = al.iterator();
		while(itr.hasNext())
		{
			String value = itr.next();
			System.out.print("\t"+value);
		}

	}

}
