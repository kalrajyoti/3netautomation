package com.org.Queue;

import java.util.PriorityQueue;

public class PriorityQueuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("ABC"); 
		queue.add("DEF");  
		queue.add("GHI");  
		queue.add("JKL");  
		
		System.out.println("head:"+queue.element()); 
		System.out.println("head:"+queue.element()); 
	}

}
