package day1.basics;

public class PalindromeString {

	public static void main(String[] args) {
		String Str= "Radar";
		String RevStr = "";
		Str =Str.toLowerCase();
		for (int i=Str.length()-1;i>=0;i--){
			RevStr = RevStr + Str.charAt(i);
			
		}
		if (Str.equals(RevStr)) {
			System.out.println ("given String is Palindrome");
		}
		else {
			System.out.println ("Given String is Not Palindrome");
		}

	}

}
