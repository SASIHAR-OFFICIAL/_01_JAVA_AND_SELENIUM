package _S_05_26_DataDriven_TestNG1;


import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class _02_HRM_Data_Inside {
			
	@DataProvider(name = "LoginData")
	String[][] DataProvider() {
				String[][] data =  {{"Admin1","admin123"},{"Admin","admin12"},{"Admin0","admin123"},{"Admin","admin123"}};
		return data;
		
	}
	
  @Test(dataProvider = "LoginData")
    public void HRM_User_Correct(String user, String pass) {
	  WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(user);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(pass);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.quit();
  }
}
