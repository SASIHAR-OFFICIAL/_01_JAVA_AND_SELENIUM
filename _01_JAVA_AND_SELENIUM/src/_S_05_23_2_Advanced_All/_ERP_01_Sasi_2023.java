package _S_05_23_2_Advanced_All;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class _ERP_01_Sasi_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.navigate().to("http://172.16.100.36/impres/StaffLogin/Default.aspx");
WebElement userName = driver.findElement(By.id("txtLoginCode"));
userName.sendKeys("C0579");

WebElement Pass = driver.findElement(By.id("txtpassword"));
Pass.sendKeys("C0579");

WebElement LoginButton = driver.findElement(By.id("ext-gen26"));
LoginButton.click();

Thread.sleep(3000);
Actions a=new Actions(driver);
WebElement Dashboard = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/ul/li[8]"));
a.moveToElement(Dashboard).build().perform();

WebElement Dashboard2 = driver.findElement(By.xpath("//*[@id=\"DashBoardAttendanceSummary.aspx\"]"));
Dashboard2.click();
//a.moveToElement(Dashboard2).build().perform();

	}

}
