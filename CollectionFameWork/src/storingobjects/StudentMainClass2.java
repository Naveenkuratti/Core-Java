package storingobjects;
import java.util.ArrayList;



import java.util.Collections;
import java.util.List;
public class StudentMainClass2 {
	


		public static void main(String[] args) {
			Students s1 = new Students(22, "Tom");
			Students s2 = new Students(23,"jeery");
			Students s3 = new Students(20, "obj");
			
			ArrayList<Students> al = new ArrayList<Students>();
			al.add(s1);
			al.add(s2);
			al.add(s3);
			
			// Internally sort()also uses compare To() for String 
			//since ArrayList is having student objects,
			//sort() goes in search of compareTo() in Student class
			
	       Collections.sort(al);
			for(Students s :al) {
				System.out.println(s);
			}

		}

	}



