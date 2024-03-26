package setexamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo {
	public static void main(String[] args) {



		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(1.2);
		hs.add(10);
		hs.add(null);
		hs.add("java");
		System.out.println("size"+hs.size());
		for(Object obj :hs) {
			System.out.println(obj);
		}
		System.out.println("-----------");



		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		lh.add(20);
		lh.add(30);
		lh.add(20);
		lh.add(10);

		System.out.println("size:"+lh.size());
		Iterator<Integer> i = lh.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
	}
}

}
