package day1.basics;

public class VowelCountInString {

	public static void main(String[] args) {
		String s1 = "shivaji the boss ingole";
		
		System.out.println (s1.toLowerCase());
		
		int vcount=0;
		
		
		for (int i=0;i<s1.length();i++) {
			if (s1.charAt(i)=='a'||s1.charAt(i)=='i'||s1.charAt(i)=='e'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				vcount++;
			}
			
		}
		System.out.println ("vowel count"+vcount);
		
	}

	

}
