package _S_05_12_Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_11_Sasi_2023 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		FirefoxDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.get("https://jqueryui.com/autocomplete/");

		WebElement Frame0 = firefoxDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/iframe"));
		firefoxDriver.switchTo().frame(Frame0);

		WebElement SearchBox = firefoxDriver.findElement(By.xpath("//*[@id=\"tags\"]"));
		SearchBox.sendKeys("S");
		Thread.sleep(10000);
		List<WebElement> SearchBox_List = firefoxDriver.findElements(By.xpath("//*[@id=\"tags\"]/li"));
		System.out.println(SearchBox_List.size());	
		
		for (WebElement All_in_List : SearchBox_List) {
			if (All_in_List.getText().equals("Scala")) {
				All_in_List.sendKeys(Keys.ENTER);
				
			}
			
		}

	}

}
