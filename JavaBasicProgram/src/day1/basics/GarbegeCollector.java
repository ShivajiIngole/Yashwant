package day1.basics;

public class GarbegeCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbegeCollector g1 = new GarbegeCollector();
		System.out.println (g1);
		System.out.println (g1.hashCode());
		g1=null;
		System.gc();
	}
		@Override
		protected void finalize() {
			System.out.println ("hii i am finalize method");
		}
		
	}


