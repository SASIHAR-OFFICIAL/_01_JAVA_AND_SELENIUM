package _S_05_25_TestNG;

import org.testng.annotations.Test;

public class _04_TestNG_Depends_On_Methods_0001 {
	@Test(priority = 0)
	void sslc(){
		System.out.println("SSLC Pass");
		
	}
	@Test(priority = 1,enabled = false,dependsOnMethods = "sslc")
	void Plus_2(){
		System.out.println("Plus 2 Pass");
	}
	
	@Test (priority = 2,dependsOnMethods = "Plus_2")
	void Engineering(){
		System.out.println("Engineering Pass");
	}
}
