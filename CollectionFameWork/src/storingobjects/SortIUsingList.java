package storingobjects;

import java.util.ArrayList;
import java.util.Collections;

public class SortIUsingList {
	public static void main(String[] args) {
	         Car2 c1 = new Car2(229002);
	         Car2 c2 = new Car2(7865);
	         Car2 c3 = new Car2(78866);
	         ArrayList< Car2> l = new ArrayList<Car2>();
	         
	         
	         
	         l.add(c1);
	         l.add(c2);
	         l.add(c3);
	         Collections.sort(l);
	         
	         for(Car2 c :l) {
	        	 System.out.println(c);
	         }
	}

}
