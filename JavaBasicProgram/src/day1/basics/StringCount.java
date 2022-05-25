package day1.basics;

public class StringCount {

	public static void main(String[] args) {
		
		String s1= "My Name 1 Is 3 Shivaji";
		int upper =0;
		int lower=0;
		int digit =0;
		int special =0;
		int other =0;
		
		for (int i=0;i<s1.length();i++) {
			char ch= s1.charAt(i);
			if (Character.isUpperCase(ch)) {
				upper++;
			}
			else if (Character.isLowerCase(ch)) {
				lower++;
			}
			else if (Character.isDigit(ch)) {
				digit++;
			}
			else  {
				other++;
			}

		}
		System.out.println ("upper="+upper);
		System.out.println ("lower="+lower);
		System.out.println ("digit="+digit);
		System.out.println ("other="+other);
}

}	
	