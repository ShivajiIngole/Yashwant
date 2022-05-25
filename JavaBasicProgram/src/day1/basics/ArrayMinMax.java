package day1.basics;

public class ArrayMinMax {
	static void max(int[]a) {
		int max=a[0];
		for (int j=1;j<a.length;j++) {
			if (max<a[j]) {
				max = a[j];
			}
		}
		System.out.println ("max values in array= "+max);
	}
	
	
	
	
	
	static void min(int[]a) {
		int min=a[0];
		for (int i=1;i<a.length;i++) {
			if (min>a[i]) {
				min =a[i];
			}
		}
		System.out.println("min value in array ="+min);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a = {234,155,211,456,144,243};
ArrayMinMax.min(a);
ArrayMinMax.max(a);
	}
	}

