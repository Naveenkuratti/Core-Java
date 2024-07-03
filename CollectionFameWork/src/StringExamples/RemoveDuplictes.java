package StringExamples;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplictes {
	public static void main(String[] args) {
		String str = "2,4,5,6,4";
		System.out.println(nguhdfv(str));
		
	}
	public static String nguhdfv(String str) {
		Set<Character>	set = new HashSet<Character>();
		StringBuffer sf = new StringBuffer();
		for(int i=0; i<str.length(); i++) {
			Character c = str.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sf.append(c);
				
			}
			
		}
		
		
		return sf.toString();
		
		
	}

}
