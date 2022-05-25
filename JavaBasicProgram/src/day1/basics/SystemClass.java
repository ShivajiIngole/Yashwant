package day1.basics;

import java.util.Scanner;

public class SystemClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scn=new Scanner (System.in);
int var=scn.nextInt();
int var1 = scn.nextInt();
System.out.println (var);
char ch;
 ch= scn.next().charAt(0);
System.out.println(scn.hasNext());
System.out.println (addNumber(ch,var,var1));

	}
	static int addNumber(char ch,int var,int var1) {
		if (ch=='+') {
			return var+var1;
		}
		else {
			return 0;
		}
	}

}
