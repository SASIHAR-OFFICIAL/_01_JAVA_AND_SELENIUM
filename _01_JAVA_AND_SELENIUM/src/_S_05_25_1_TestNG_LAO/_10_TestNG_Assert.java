package _S_05_25_1_TestNG_LAO;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class _10_TestNG_Assert {
	String Name;
	Boolean value = false;
	
	public void Check_Equal() {
		assertEquals(false, value);
		
	}

}
