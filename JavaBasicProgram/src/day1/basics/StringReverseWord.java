package day1.basics;

public class StringReverseWord {

	public static void main(String[] args) {
		
		String s1= "Java Concept Of The Day";
		
		String []array =s1.split(" ");
		
		for (Object obj:array) {
			System.out.print(" "+obj);
		}
		System.out.println ();
		
		for (int i=array.length-1;i>=0;i--) {
			System.out.println (array[i]);
		}
	}

}
