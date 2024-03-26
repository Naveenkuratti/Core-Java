package defaultsorting;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee e) {
		return this.name.compareTo(e.name);
	
		
		
	}

	
}
/**
* this -> current to be inserted
*e -> already Existing Object
*
*1.Sorting based on id(int);
*Ascending Order ->return this.id -e.id;
*Descending Order ->return e.id-this.id;
*
*2.Sorting based on name(String);
*Ascending Order ->return this.name.compareTo(e.name);
*Descending Order ->return e.nmew compareTo(this.name);

*/