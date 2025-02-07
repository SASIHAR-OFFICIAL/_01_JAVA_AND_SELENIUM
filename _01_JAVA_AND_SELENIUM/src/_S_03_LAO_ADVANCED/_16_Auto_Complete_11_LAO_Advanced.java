package _S_03_LAO_ADVANCED;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _16_Auto_Complete_11_LAO_Advanced {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();
		F.get("https://demoqa.com/auto-complete");
		
		F.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div/div/div/div/div[1]")).sendKeys("a");
//
//List<WebElement> Search_Box_Input = F.findElements(By.xpath("//*[@id=\'search\']/li"));
//
//*[@id="ui-id-1"]
//Thread.sleep(10000);
//int Search_Box_size = Search_Box_Input.size();
//System.out.println("Search_Box_size = "+Search_Box_size);
	}
}
