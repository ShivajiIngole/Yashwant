package day1.basics;

import org.testng.annotations.Test;

public class TestNG2 {


	    @Test
		public void TestCase1 () {
			DisplayDetails();
			System.out.println (" I am TestCase1 method of TestNG2");
		}
		@Test
		public void TestCase2() {
			DisplayDetails();
			System.out.println (" I am TestCase2 method of TestNG2");
		}
		
		void DisplayDetails() {
			System.out.println (" I am display method of TestNG2");
		}
				
	}


