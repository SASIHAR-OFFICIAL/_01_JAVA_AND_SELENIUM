package _S_05_25_1_TestNG_LAO;

import org.testng.annotations.Test;

public class _03_TestNG_Skip {
	
	@Test(priority = 0,enabled = false)
	public void First_Test_Case() {
		System.out.println("First_Test_Case");
	}
	@Test(priority = 1)
	public void Second_Test_Case() {
		System.out.println("Second_Test_Case");
	}
	@Test(priority = 2)
	public void Third_Test_Case() {
		System.out.println("Third_Test_Case");
	}
	@Test(priority = 3)
	public void Fourth_Test_Case() {
		System.out.println("Fourth_Test_Case");
	}
	@Test(priority = 4)
	public void Fifth_Test_Case() {
		System.out.println("Fifth_Test_Case");
	}
}