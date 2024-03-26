package Com;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(12);
		l.add(27);
		l.add(33);
		System.out.println(l);//[12, 27, 33]
		l.add(1,55);
		System.out.println(l);//[12, 55, 27, 33]
		l.set(2, 77);
		System.out.println(l);//[12, 55, 77, 33]
		
	}

}
