package com.test;

abstract public class ParentForAll {
	 protected  String name = "";
	 protected String[] arrayString;
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name ;
	}
	public void display()
	{
		System.out.println(name);
	}
}
