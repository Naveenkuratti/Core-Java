package org;

import java.util.ArrayList;


import java.util.Iterator;


public final class Solution {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		for(Integer i:al) {
			System.out.println(i);
		}
		System.out.println("----------");
		
		//FOR LOOP
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		Iterator<Integer> i =al.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
	}

	

}
