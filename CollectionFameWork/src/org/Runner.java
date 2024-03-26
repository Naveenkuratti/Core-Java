package org;

import java.util.Iterator;
import java.util.LinkedList;

public class Runner {
	public static void main(String[] args) {
		LinkedList<Double> l = new LinkedList<Double>();
		l.add(1.3);
		l.add(2.5);
		l.add(3.4);
		Iterator<Double> i = l.iterator();
		while (i.hasNext()) {
		System.out.println(i.next());
			
		}
	
	
	
	}

}
