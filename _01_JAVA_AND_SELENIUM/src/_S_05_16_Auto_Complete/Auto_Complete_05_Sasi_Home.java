package _S_05_16_Auto_Complete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_Complete_05_Sasi_Home {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/AutoComplete.html");

		WebElement Search_Box_Location = driver.findElement(By.id("searchbox"));
		Search_Box_Location.sendKeys("IND");
		Thread.sleep(3000);

		List<WebElement> Search_Box_Elements = driver.findElements(By.xpath("//*[@id=\"searchbox\"]"));
		for (WebElement All_Elements_Stored : Search_Box_Elements)
		{
			if (All_Elements_Stored.getText().equals("India")) {
				Thread.sleep(3000);
				System.out.println(All_Elements_Stored);
				All_Elements_Stored.click();
				break;
			}
		}
	}
}
