package day1.basics;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array1 = {20,34,11,33,23};
int[] array2 = {42,113,342,45,32};

int[]newarray = new int[array1.length+array2.length];

System.arraycopy(array1, 0, newarray, 0, array1.length);
System.arraycopy(array2,0,newarray,array1.length , array2.length);


System.out.println ("array1 "+Arrays.toString(array1));
System.out.println ("array2 "+Arrays.toString(array2));
System.out.println ("newarray "+Arrays.toString(newarray));
Arrays.sort(newarray);
System.out.println ("sorting of newarray "+Arrays.toString(newarray));




int [] array3 = Arrays.copyOf(array1, 5);
System.out.println ("array3 = "+Arrays.toString(array3));

for (int i:array3) {
	System.out.println ("using for loop"+i);
}
System.out.println (Arrays.equals(array1, array3));




	}

}
