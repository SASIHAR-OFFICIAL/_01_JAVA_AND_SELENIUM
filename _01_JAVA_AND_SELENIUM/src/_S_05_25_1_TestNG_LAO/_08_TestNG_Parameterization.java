package _S_05_25_1_TestNG_LAO;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _08_TestNG_Parameterization {
	
	// RUN Parameterization IN XML
	@Test
	@Parameters("Parameterization Name")
	void Print_Name(String name) {
		System.out.println("Print_Name= "+name);
	}
}
