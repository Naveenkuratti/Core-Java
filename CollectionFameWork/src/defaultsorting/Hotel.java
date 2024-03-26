package defaultsorting;

public class Hotel implements Comparable<Hotel> {
	String name;
	Double ratings;
	Hotel(String name, double ratings) {
		
		this.name = name;
		this.ratings = ratings;//wrapper class declerartion to invoke compare To()
		
	}
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", ratings=" + ratings + "]";
	}
	@Override
	public int compareTo(Hotel h) {
		return this.ratings.compareTo(h.ratings);
		
	}

	

}
