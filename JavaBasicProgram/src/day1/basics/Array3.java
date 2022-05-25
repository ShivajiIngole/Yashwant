package day1.basics;

public class Array3 {

	public static void main(String[] args) {
		// copy of one array into another array
		int []array = new int[] {23,45,12,53,11,64};
		int []array2= new int [array.length];
		
		for (int i=0;i>array.length;i++) {
			array2[i]=array[i];
			
		}
System.out.println ("Print element in new array");
for (int j=0;j<array2.length;j++) {
	System.out.println (array[j]);
}
	}

}
