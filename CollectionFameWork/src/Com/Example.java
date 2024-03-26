package Com;

import java.util.ArrayList;
import java.util.LinkedList;

public class Example {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);


		LinkedList ll = new LinkedList();
		ll.addAll(a1);
		ll.add(30);


		System.out.println(ll);
		System.out.println("--------");//[10, 20, 30]


		System.out.println(ll.containsAll(a1));//true
		System.out.println("--------");
		System.out.println(ll);//[10, 20, 30]
		ll.removeAll(a1);
		System.out.println(ll);//[30]
		System.out.println("*******************");


		ArrayList x = new ArrayList();	
		x.add(10);
		x.add(20);



		LinkedList y = new LinkedList();
		y.add(x);
		y.add(30);



		System.out.println("LL Elements:"+y);//[[10, 20], 30]
		System.out.println("LL Size:"+y.size());//2

		/**
		 * 1.if we use -> y.addAll(x);
		 * - we are adding the objects of entire collection into 
		 * another collection 1 by 1 (sequentially).
		 * - therefore elements will be [10,20,30]& size is 3.
		 * 
		 * 2.If we use ->y.add(x)
		 * - we are adding 1 entire collection as a single objects
		 * -therefore elements will be [[10,20],30] & size is 2.
		 * 	
		 */




	}

}
