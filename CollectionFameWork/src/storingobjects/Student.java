package storingobjects;

public class Student implements Comparable<Students>{
	int age;
	String name;
	Student(int age, String name) {

		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
@Override
	public  int compareTo(Students s) {
		return this.name.compareTo(s.name);
	}
}
//for Storing comparison , we should call compareTo() of String class
//this -> current object to be inserted 
//s -> Already Existing object