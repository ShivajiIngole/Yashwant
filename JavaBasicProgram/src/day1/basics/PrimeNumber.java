package day1.basics;

public class PrimeNumber {

	public static void main(String[] args) {
	int prime=0;
		for (int i=1;i<1000;i++) {
			int counter =0;
			for(int num=i;num>=1;num--) {
			if (i%num==0) {
				counter=++counter;
			}
			}
			if (counter==2) {
				System.out.print(" "+i);
				prime++;
			}
		}
		System.out.println (prime++);
		
	}

}
