package _S_01_IT_ST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IT_ST_13_Assertion_2_Bringed {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		d.get("https://www.softwaretestingmaterial.com");
		String sValue = "Assert Equals Test";
		/// BELOW ERROR
		//Assert.assertEquals("Assert Equals Test", sValue);
		
		System.out.println("Test Passed");
		d.get("https://www.google.com");
		/// BELOW ERROR
		//Assert.assertTrue("Title does not match", expectedTitle.equals(d.getTitle()));
		
		//d.close();

		
		}
}
