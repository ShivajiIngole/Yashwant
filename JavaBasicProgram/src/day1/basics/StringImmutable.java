package day1.basics;

public class StringImmutable {
	
	public static void referenceCheck(Object x, Object y) {
		if(x==y) {
			System.out.println ("both are pointing to same reference");
		}
		else {
			System.out.println ("both are pointing not to same reference");
		}
	}
	
	

	public static void main(String[] args) {
	String s1 = "java";
	String s2 = "java";
	
	referenceCheck(s1,s2);
	System.out.println ("after modification");
	s1 +="class";
	referenceCheck(s1,s2);
	System.out.println (s1);
	}

}
