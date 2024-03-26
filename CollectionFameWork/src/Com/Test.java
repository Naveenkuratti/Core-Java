package Com;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		//Internally an array gets created based on the 
		//size of default intinal capacity(10)
		ArrayList a = new ArrayList();
		//Internally an array gets created based on the 
	     //size of custom intinal capacity(10)
		ArrayList b = new ArrayList(20);
		
		
		
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);
		//adding 1 collection into another collection
		ArrayList  y = new ArrayList(x);
		y.add(30);
		System.out.println(x);
		System.out.println(y);
		//simple learn
		//qsg
		
		
		
		
		
	}

}
