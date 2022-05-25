package day1.basics;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=121,rem=0,rev=0;
int temp=num;
for (;num>0;num=num/10) {
	rem=num%10;
	rev= rev*10+rem;
	
}
if (temp==rev) {
	System.out.println("given number is palindrome");
}else {
	System.out.println("given number is palindrome");
}
}
}
