package storingobjects;

import java.util.LinkedList;

public class CarMainClass {
	public static void main(String[] args) {
		Car c1 = new Car("AUDI", 50000000);
		Car c2 = new Car("BMW",4500000);


		LinkedList<Car> l = new LinkedList<Car>();
		l.add(c1);
		l.add(c2);

		for(Car c:l) {
			System.out.println(c);

		}
	}
}
