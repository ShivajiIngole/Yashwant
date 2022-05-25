package day1.basics;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = " Remove White Space ";

String str = s1.replaceAll("\\s", "");
System.out.println (str);
//String Str1 = s1.trim();
//System.out.println ("only remove space of start and end"+Str1);
	}

}
