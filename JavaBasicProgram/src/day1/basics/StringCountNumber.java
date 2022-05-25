package day1.basics;

public class StringCountNumber {

	public static void main(String[] args) {
        String s1 ="hey1234876hey";
        int NoCount =0;
        int CharCount=0;
for (int i=0;i<s1.length();i++) {
	char ch = s1.charAt(i);
	if (Character.isDigit(ch)) {
		NoCount++;
	}
	else if (Character.isLowerCase(ch)) {
		CharCount++;
	}
	
}
System.out.println (NoCount);
System.out.println (CharCount);


	}

}
