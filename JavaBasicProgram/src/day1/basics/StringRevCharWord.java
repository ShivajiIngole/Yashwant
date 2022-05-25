package day1.basics;

public class StringRevCharWord {

	public static void main(String[] args) {
		String s1= "my name is shivaji";
		String []array =s1.split(" ");
		String ReverseWord = "";
		for (String rev:array) {
			StringBuilder sb = new StringBuilder(rev);
			sb.reverse();
			ReverseWord+=sb.toString()+" ";
			
		}
		System.out.println (ReverseWord);
		
		
	}

}
