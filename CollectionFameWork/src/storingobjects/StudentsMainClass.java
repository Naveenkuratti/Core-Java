package storingobjects;

import java.util.ArrayList;

public class StudentsMainClass {
	public static void main(String[] args) {

		Students s1 = new Students(22,"Tom");
		Students s2 = new Students(44,"Cat");




		ArrayList<Students> l = new ArrayList<Students>();
		l.add(s1);
		l.add(s2);


		for(Students s:l) {
			System.out.println(s);
		}

		System.out.println("------");

		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}


	}

}
