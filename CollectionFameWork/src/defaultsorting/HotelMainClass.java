package defaultsorting;


import java.util.TreeSet;

public class HotelMainClass {
	public static void main(String[] args) {
		Hotel h1 = new Hotel("Taj",4.8);
		Hotel h2 = new Hotel("irt", 4.2);
		Hotel h3 = new Hotel("wind", 4.5);
		
				
		
		
		TreeSet<Hotel> t = new TreeSet<Hotel>();
		t.add(h1);
		t.add(h2);
		t.add(h3);
		
		for(Hotel h : t) {
			System.out.println(h);
			
		}
		
		
	}

}
