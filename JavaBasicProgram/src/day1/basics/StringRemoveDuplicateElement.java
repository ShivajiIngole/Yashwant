package day1.basics;

import java.util.ArrayList;
import java.util.HashSet;

public class StringRemoveDuplicateElement {

	public static void main(String[] args) {
		
		ArrayList <String> array =new ArrayList<String>();
		array.add("Shivaji");
		array.add("Karbhari");
		array.add("Ingole");
		array.add("Yogesh");
		array.add("Ingole");
		System.out.println ("list of element with duplicate = "+array.toString());
		
	HashSet <String> set =new HashSet<String>(array);
	System.out.println ("list of element without duplicate = "+set.toString());
	
	}

}
