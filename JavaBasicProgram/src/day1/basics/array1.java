package day1.basics;

class array1 
{
	public static void main (String[]args) {
		
int []a = new int[3];
a[0]=(10);
a[1]=(24);
a[2]=(13);

System.out.println (a[0]);
System.out.println (a.length);
for (int i=0;i<a.length;i++) {
	System.out.println (a[i]);
}
for (Object obj:a) {
	System.out.println (obj);
}

String []b=new String [] {"Shivaji","Nishant","Mrunal"};

System.out.println (b[1]);




	}
}