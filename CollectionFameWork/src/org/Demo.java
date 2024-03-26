package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(10);
		System.out.println(al);//[20, 30, 10]
		Collections.sort(al);
		System.out.println(al);//[10, 20, 30]
		Collections.reverse(al);
		System.out.println(al);//[30, 20, 10]


		System.out.println("-----------");


		LinkedList l = new LinkedList();
		l.add(12);
		l.add(true);
		l.add(null);
		l.add(23.45);

		for(Object obj:l ) {
			System.out.println(obj);

		}

		System.out.println("----------");
		Collections.reverse(l);


		for(Object obj:l ) {
			System.out.println(obj);

		}

	}
}
