package day1.basics;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "Brag";
String s2 ="Grab";
boolean status =true;
if (s1.length()!=s2.length()) {
	status = false;
}
else {
String s3 = s1.toLowerCase();
String s4 = s2.toLowerCase();

	char[]Array1 = s3.toCharArray();

		char[]Array2 =s4.toCharArray();
		
		Arrays.sort(Array1);
		Arrays.sort(Array2);
		status=Arrays.equals(Array1,Array2);
		
	}
 if (status) {
	System.out.println (s1 +" and "+s2+" are anagram");
}
else {
	System.out.println (s1 +"and"+s2+"are not anagram");	
}
	}	
	
	}

