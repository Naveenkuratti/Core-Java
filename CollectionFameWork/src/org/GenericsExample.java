package org;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericsExample {
	public static void main(String[] args) {
    
		
		
		
		ArrayList<String>al = new ArrayList<String>();
		al.add("python");
		al.add("java script");
		al.add("java");
		for(String s :al){
			System.out.println(s);
		}
			System.out.println("------------");
			
			LinkedList<Integer> ll = new LinkedList<Integer>();
			ll.add(10);
			ll.add(12);
			ll.add(15);
			for(Integer i: ll) {
				System.out.println(i);
			}
			
			System.out.println("---------------");
			
			
			
			ArrayList l = new ArrayList();
			l.add(10);// 1.add(new Interger(10));
			l.add(1.5);// 1.add(new Double(1.5));
			
			
			//upcasting or generalization
			//object obj = new Integer (10);&object obj = new Double(1.5);
			for(Object obj :l) {
				System.out.println(obj);
			}
			
		}
	}
	
	
	
	
	
	

