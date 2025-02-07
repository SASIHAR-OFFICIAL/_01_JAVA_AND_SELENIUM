package _S_05_07_01_Drop_Down_Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Select_06_Sasi_Basic_Home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("Webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver fDriver = new FirefoxDriver();
fDriver.manage().window().maximize();
fDriver.get("https://www.tamildailycalendar.com/tamil_daily_calendar.php");
Thread.sleep(1000);

WebElement MonthBox = fDriver.findElement(By.id("month"));
Select MonthBoxSelect = new Select(MonthBox);
MonthBoxSelect.selectByIndex(5);
Thread.sleep(1500);

MonthBoxSelect.selectByValue("01");
Thread.sleep(1500);

MonthBoxSelect.selectByVisibleText("12 (December)");
Thread.sleep(1500);

List<WebElement> MonthBoxTotal = MonthBoxSelect.getOptions();
int Total =MonthBoxTotal.size();
System.out.println("Total = "+Total);
Thread.sleep(1500);

fDriver.close();

	}

}
