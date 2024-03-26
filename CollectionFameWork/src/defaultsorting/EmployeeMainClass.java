package defaultsorting;

import java.util.TreeSet;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(22, "Abhi");
		Employee e2 = new Employee(24, "Naveen");
		Employee e3 = new Employee(44, "tom");
		
		
		TreeSet<Employee> t = new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		for(Employee e :t);
		System.out.println(t);
		
		
	}

}

