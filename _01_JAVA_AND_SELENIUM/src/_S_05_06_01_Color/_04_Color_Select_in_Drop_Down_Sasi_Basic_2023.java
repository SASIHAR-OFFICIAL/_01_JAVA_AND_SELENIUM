package _S_05_06_01_Color;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class _04_Color_Select_in_Drop_Down_Sasi_Basic_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver F_Driver = new FirefoxDriver();
F_Driver.manage().window().maximize();



F_Driver.get("https://www.prokerala.com/general/calendar/tamilcalendar.php?year=2023&mon=september&sb=1#calendar");

WebElement Box1 = F_Driver.findElement(By.xpath("//*[@id=\"calendar-changedate\"]"));
Point Box1_Position =Box1.getLocation();
int X_Position = Box1_Position.getX();
int Y_Position = Box1_Position.getY();
System.out.println("X_Position = "+X_Position +'\n'+"Y_Position = "+Y_Position);
System.out.println("---------------------------------");

Dimension Box1_Size = Box1.getSize();
int  Heg = Box1_Size.getHeight();
int Wid = Box1_Size.getWidth();
System.out.println("Height = "+Heg +'\n'+"Width = "+Wid);


Thread.sleep(10000);
F_Driver.findElement(By.xpath("//*[@id=\"input-site-search\"]")).sendKeys("SATHISH");

WebElement Hor_year =F_Driver.findElement(By.id("fin_year"));
Select Year_Select = new Select(Hor_year);
Year_Select.selectByIndex(6);

WebElement fin_month =F_Driver.findElement(By.id("fin_month"));
Select Month_of = new Select(fin_month);
Month_of.selectByValue("5");

WebElement fin_day = F_Driver.findElement(By.id("fin_day"));
Select Day_of = new Select(fin_day);
Day_of.selectByVisibleText("10");
	}

}
