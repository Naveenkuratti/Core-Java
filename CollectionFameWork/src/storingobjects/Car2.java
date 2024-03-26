package storingobjects;

public class Car2 implements Comparable<Car2> {
	int cost;

	Car2(int cost) {
		
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Car2 [cost=" + cost + "]";
	}
	
	@Override
	public  int compareTo(Car2 c) {
		return this.cost - c.cost;
	}
}

