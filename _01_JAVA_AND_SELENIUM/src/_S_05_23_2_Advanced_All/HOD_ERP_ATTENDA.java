package _S_05_23_2_Advanced_All;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class HOD_ERP_ATTENDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://172.16.100.36/impres/StaffLogin/Default.aspx");
		WebElement userName = driver.findElement(By.id("txtLoginCode"));
		userName.sendKeys("C2122");

		WebElement Pass = driver.findElement(By.id("txtpassword"));
		Pass.sendKeys("ravikumar123");
		WebElement LoginButton = driver.findElement(By.id("ext-gen26"));
		LoginButton.click();
	}

}
