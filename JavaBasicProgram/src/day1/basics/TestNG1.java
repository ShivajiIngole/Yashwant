package day1.basics;

import org.testng.annotations.Test;

public class TestNG1 {
  @Test
  public void smokeTC1() throws InterruptedException {
	  
	  System.out.println ("hi, I am smokeTC1 ");
	  Thread.sleep(2000);
  }
	  
 @Test
 public void regressionTC1() {
		  System.out.println ("hii, i am regressionTC1 ");
	  }
  }

