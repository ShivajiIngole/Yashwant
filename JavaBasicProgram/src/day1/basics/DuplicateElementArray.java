package day1.basics;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []array = new int [] {2,4,5,7,3,2,5,7};
Arrays.sort(array);
for (int i=0;i<array.length;i++) {
	for (int j=i+1;j<array.length;j++) {
		if(array[i]==array[j]) {
			System.out.println("Duplicate value ="+array[i]+" ");
		}
	}
}


	}

}
