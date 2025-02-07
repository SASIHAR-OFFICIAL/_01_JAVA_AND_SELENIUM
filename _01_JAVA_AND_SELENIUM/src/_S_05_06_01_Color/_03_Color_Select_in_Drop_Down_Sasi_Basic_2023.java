package _S_05_06_01_Color;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class _03_Color_Select_in_Drop_Down_Sasi_Basic_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F_Driver = new FirefoxDriver();
		F_Driver.manage().window().maximize();
		F_Driver.get("https://horoscope.hosuronline.com/horoscope.php");

		WebElement Right_box = F_Driver.findElement(By.xpath("/html/body/section[1]"));
		String Right_box_Color = Right_box.getCssValue("background-color");
		System.out.println("------------------------------------------------------");

		System.out.println("Right_box_Color = "+Right_box_Color);
		System.out.println("------------------------------------------------------");

		WebElement Name_Box = F_Driver.findElement(By.id("name"));
		Name_Box.sendKeys("sathish");
		Thread.sleep(10000);

	
		//DoB ------------------------------------------------------
		WebElement day = F_Driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select Day_Select = new Select(day);
		Day_Select.selectByIndex(5);
		Thread.sleep(2000);
		Day_Select.selectByValue("16");
		Thread.sleep(2000);
		Day_Select.selectByVisibleText("31");

		WebElement Month_Box = F_Driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select Month_Select = new Select(Month_Box);
		Month_Select.selectByIndex(1);
		Thread.sleep(2000);
		Month_Select.selectByValue("10");
		Thread.sleep(2000);
		Month_Select.selectByVisibleText("November");

		WebElement Year = F_Driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select Year_Select = new Select(Year);
		Year_Select.selectByIndex(5);
		Thread.sleep(2000);
		Year_Select.selectByValue("1922");
		Thread.sleep(2000);
		Year_Select.selectByVisibleText("1966");
		
		//Birth Time ------------------------------------------------------

		WebElement Hour = F_Driver.findElement(By.xpath("//*[@id=\"hour\"]"));
		Select Hour_Select = new Select(Hour);
		Hour_Select.selectByIndex(1);
		Thread.sleep(2000);
		Hour_Select.selectByValue("7");
		Thread.sleep(2000);
		Hour_Select.selectByVisibleText("11");
		
		WebElement Min = F_Driver.findElement(By.xpath("//*[@id=\"minute\"]"));
		Select Min_Select = new Select(Min);
		Min_Select.selectByIndex(1);
		Thread.sleep(2000);
		Min_Select.selectByValue("7");
		Thread.sleep(2000);
		Min_Select.selectByVisibleText("11");
		
		WebElement AMPM = F_Driver.findElement(By.xpath("//*[@id=\"AMPM\"]"));
		Select AMPM_Select = new Select(AMPM);
		AMPM_Select.selectByIndex(0);
		Thread.sleep(2000);
		AMPM_Select.selectByValue("1");
		Thread.sleep(2000);
		AMPM_Select.selectByVisibleText("AM");
		
		//CITY-----------------------------------------------------
		
		WebElement City = F_Driver.findElement(By.xpath("//*[@id=\"birthcity\"]"));
		City.sendKeys("Madurai"+Keys.ENTER);
		
		WebElement Search =	F_Driver.findElement(By.id("search"));
		String Search_Text = Search.getAttribute("value");
		System.out.println("------------------------------------------------------");

		System.out.println("Search_Text = "+Search_Text);
		System.out.println("------------------------------------------------------");

		Thread.sleep(10000);

		
	
		
	}

}
