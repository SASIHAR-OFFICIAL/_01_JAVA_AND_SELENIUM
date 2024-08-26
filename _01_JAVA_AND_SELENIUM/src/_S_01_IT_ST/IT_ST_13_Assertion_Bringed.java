package _S_01_IT_ST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IT_ST_13_Assertion_Bringed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.softwaretestingmaterial.com");
		 Thread.sleep(20000);
		 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 //Actual title is "Software Testing Material - A site for Software Testers" 
		 //We took title as "Software Testing Material" to make the test fail
		 String Title = "Software Testing Material";
		 String GetTitle = driver.getTitle();
		 System.out.println("Assertion starts here...");
		 Assert.assertEquals(Title, GetTitle);
		 System.out.println("A blog for Software Testers");
		               // driver.quit(); 

	}

}
