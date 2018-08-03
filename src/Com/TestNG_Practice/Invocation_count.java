package Com.TestNG_Practice;

import org.testng.annotations.Test;

public class Invocation_count 
{
   @Test (invocationCount = 10, expectedExceptions = NumberFormatException.class)
   public void countingTen()
   {
	   System.out.println("hi");
	   int i = Integer.parseInt("ten");
   }
}
