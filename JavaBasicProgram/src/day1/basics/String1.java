package day1.basics;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "Shivaji the boss Ingole";
String s2 = new String ("My name is Shivaji");
String rev= "";
int length = s1.length();
for (int i=s1.length()-1;i>=0;i--) {
	rev=rev+s1.charAt(i);
}
System.out.println (rev);
String rev1 ="";
for (int j=s2.length()-1;j>=0;j--){
	rev1= rev1+s2.charAt(j);
}
System.out.println (rev1);
	}

}
