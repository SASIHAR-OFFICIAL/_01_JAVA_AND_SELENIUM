package _S_05_07_01_Drop_Down_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Select_13_Sasi_22_Dec_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement Country = d.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div/p/select"));
	Select Country_List = new Select(Country);
	Country_List.selectByIndex(15);
	Thread.sleep(3000);
	Country_List.selectByValue("BIH");
	Thread.sleep(3000);
	Country_List.selectByVisibleText("India");
		
		
	}

}
