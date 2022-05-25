package day1.basics;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
String []a= {"Shivaji","Nishant","Mrunal"};
System.out.println(a.toString());
int []c= {10,29,11,356,123};
System.out.println(a[0]);
String []b=Arrays.copyOf(a,5);
System.out.println(b.length);
int []d=Arrays.copyOfRange(c, 1, 4);
System.out.println(d.length);
for(int i=0;i<d.length;i++) {
	System.out.println(d[i]);
	
}
	}

}
