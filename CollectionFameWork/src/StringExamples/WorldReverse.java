package StringExamples;

public class WorldReverse {
	public static void main(String[] args) {
	String str = "dvnefd wdnjwhgdhw wljduwgd";
	


	String splitArray[]=str.split(" ");
	for(int i=splitArray.length-1;i>=0; i--) {
		System.out.println(splitArray[i]);
		
	}
	
	}
}
