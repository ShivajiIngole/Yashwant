package day1.basics;

import java.util.Arrays;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2="I am   from   UP";
		System.out.println("Actual String: "+s2);
		String s3 = s2.replaceAll("\\s", " ");
		System.out.println (s3);

		int a =20;
		Integer b=25;
		String s1 = Integer.toString(a);
		//String s5 = Integer.valueOf(b);
		System.out.println (s1+20);
		
		String s4 = "1000";
		
	int c= Integer.parseInt(s4);
	
	System.out.println (c+355);
	String a1=b.toString();
	System.out.println(a1);
	
	int d =25;
	double e = d;
	double s= 24.4646;
	int g= (int)s;
	System.out.println (g);
	
	
	
	
	
	int sh = 244;
	
	Double k = new Double(sh);
	System.out.println (k);
	
	Float f = new Float(34534.664);
	int l = f.intValue();
	
}
}
