package day1.basics;

public class ArmStrom {

	public static void main(String[] args) {
		
		int num=153,rem,rev=0;
		int temp=num;
		for (num=153;num>0;num=num/10) {
			rem= num%10;
			rev=rev+rem*rem*rem;
			
		}
if(rev==temp) {
	System.out.println ("given number is armstrom");
}else {
	System.out.println ("given number is not armstrom");
}
	}

}
