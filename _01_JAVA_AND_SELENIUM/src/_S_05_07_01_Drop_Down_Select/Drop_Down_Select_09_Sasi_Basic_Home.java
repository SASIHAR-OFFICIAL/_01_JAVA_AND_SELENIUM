package _S_05_07_01_Drop_Down_Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Select_09_Sasi_Basic_Home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver F = new FirefoxDriver();
F.get("https://onepagehoroscope.com/birthchart.php");

//Date-------------------------------------------------------------
WebElement Date = F.findElement(By.xpath("//*[@id=\"fin_day\"]"));
Select Date_select = new Select(Date);
Thread.sleep(1500);
Date_select.selectByIndex(5);
Thread.sleep(1500);
Date_select.selectByValue("15");
Thread.sleep(1500);
Date_select.selectByVisibleText("30");
List<WebElement> Date_Total = Date_select.getOptions();
int Date_Total_Size = Date_Total.size();
System.out.println("Date_Total_Size = "+Date_Total_Size);
F.close();
	}

}
