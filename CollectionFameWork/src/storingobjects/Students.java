package storingobjects;

public class Students {
	int age;
	String name;
	Students(int age, String name) {
	
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Age:"+ age + " Name: " +name;
	}
	
	
}
