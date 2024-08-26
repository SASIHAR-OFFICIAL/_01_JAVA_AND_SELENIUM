package _S_02_LAO_BASIC;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _06_Alert_02_LAO_Basic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver F_Driver = new FirefoxDriver();
F_Driver.manage().window().maximize();
F_Driver.get("https://www.leafground.com/alert.xhtml");

WebElement show1 = F_Driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span[2]"));
show1.click();
Alert alert1 = F_Driver.switchTo().alert();
Thread.sleep(1500);
alert1.accept();

WebElement show2 =F_Driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/button/span[2]"));
show2.click();
Alert alert2 = F_Driver.switchTo().alert();
Thread.sleep(1500);
alert2.dismiss();

/*WebElement show3_No_button = F_Driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/button/span[2]"));
show3_No_button.click();
Alert alert3 =F_Driver.switchTo().alert();
Thread.sleep(1500);*/


WebElement show4 =F_Driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
show4.click();
Alert alert4 =F_Driver.switchTo().alert();
alert4.sendKeys("ALERT 4");
Thread.sleep(1500);
alert4.dismiss();

	}
}
