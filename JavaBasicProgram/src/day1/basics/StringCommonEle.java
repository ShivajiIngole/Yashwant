package day1.basics;


import java.util.Arrays;
import java.util.HashSet;

public class StringCommonEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] a= {"Shivaji","Yogesh","ranjana"};
String []b= {"rahul","sushil","Shivaji"};
System.out.println("array1 = "+ Arrays.toString(a));
System.out.println("array2 = "+ Arrays.toString(b));

HashSet<String> set= new HashSet<String>();

for (int i=0;i<a.length;i++) {
	for (int j=0;j<b.length;j++) {
		if (a[i].equals(b[j])) {
	set.add(a[i]);
			
		}
	}

}
System.out.println (set);




	}

}
