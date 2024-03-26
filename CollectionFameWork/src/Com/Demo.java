package Com;

import java.util.ArrayList;

import javax.print.attribute.Size2DSyntax;

public class Demo {
	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		l.add(10);
		l.add(1.2);
		l.add(null);
		l.add(10);
		l.add("java");
		System.out.println(l);//[10, 1.2, null, 10, java]
		
		
		System.out.println(l.size());//5
		
		
		System.out.println(l.contains("java"));//true
		System.out.println(l.contains("Java"));//false
		System.out.println("-----------------");
		
		
		System.out.println(l);
		l.remove(1);
		System.out.println(l);//[10, null, 10, java]
		System.out.println("-------------");
		
		
		
		System.out.println(l.isEmpty());//flase
		l.clear();
		System.out.println(l.isEmpty());//ture
		

	}

}
