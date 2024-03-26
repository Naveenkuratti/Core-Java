package defaultsorting;

import java.util.TreeSet;

public class CarMainClass {
	public static void main(String[] args) {
		Car c1 = new Car(200000000); 
		Car c2 = new Car(30000000);
		Car c3 = new Car(700899);
		TreeSet<Car> t = new TreeSet<Car>();

		t.add(c1);
		t.add(c2);
		t.add(c3);

		for(Car c :t) {
			System.out.println(c);
		}
	}

}
