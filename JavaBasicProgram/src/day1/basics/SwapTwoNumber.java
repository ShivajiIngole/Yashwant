package day1.basics;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	int X=sc.nextInt();
	int Y= sc.nextInt();
	
	
	System.out.println ("before printing "+X+" "+Y);
	X=X+Y;
	Y=X-Y;
	X=X-Y;
	System.out.println ("After Swaping "+X+" "+Y);

	}

}
