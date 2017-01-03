package com.org.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet <String> al = new LinkedHashSet <String> ();
         al.add("Ravi");
         al.add("Ravi");
         al.add("Meena");
         
         Iterator <String> itr = al.iterator();
         while(itr.hasNext())
         {
        	 String obj = itr.next();
        	 System.out.print("\t" +obj);
         }
	}

}
