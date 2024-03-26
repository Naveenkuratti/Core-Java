package storingobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class SortCarUsingList {
	public static void main(String[] args) {
		List<Car2> l = new  ArrayList<Car2>();//upcasting
		l.add(new Car2(333));
		l.add(new  Car2(899));
		l.add(new Car2( 39387));
		Collections.sort(l);
		for(Car2 c :l) {
			System.out.println(c);
		}
		
		
	
}
}