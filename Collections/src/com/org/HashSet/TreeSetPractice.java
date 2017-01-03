package com.org.HashSet;

import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> al = new TreeSet <String>();
		al.add("Vijay");
		al.add("Sanjay");
		al.add("Deepu");
		al.add("Ajay");
		
		for(String s:al)
		{
			System.out.print("\t" +s);
		}
	}

}
