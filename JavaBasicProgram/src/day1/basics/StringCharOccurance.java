package day1.basics;

public class StringCharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Happy enginerring Day";
char ch= 'y';
int count =0;
for (int i =0;i<str.length();i++) {
	if (str.charAt(i)=='y') {
		count++;
	}
	
}
	System.out.println ("the character "+ch +" appears= "+count+"times");
	}

}
