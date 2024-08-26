package _S_05_16_Auto_Complete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_Complete_08_30_Mar_2024 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubsys
		System.setProperty("Webdriver.Gecko.Drive", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		
		WebElement Query_Box = d.findElement(By.id("myInput"));
		Query_Box.sendKeys("P");
		
		List<WebElement> Query_Box_List = d.findElements(By.xpath("//*[@id=\"myInput\"]"));
		for (WebElement We_want : Query_Box_List) {
			if (We_want.getText().equals("pizza")) {
				Thread.sleep(3000);
				We_want.click();				
			}
			}
			
		}
	}


