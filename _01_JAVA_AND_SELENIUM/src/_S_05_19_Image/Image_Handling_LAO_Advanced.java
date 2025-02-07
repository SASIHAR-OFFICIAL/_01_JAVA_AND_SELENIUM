package _S_05_19_Image;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image_Handling_LAO_Advanced {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver", "C:\WebDriver\geckodriver\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.leafground.com/pages/Image.html");*/

		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.leafground.com/pages/Image.html");
		
		WebElement brokenImage=d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/img"));
		brokenImage.click();
		Thread.sleep(2000);
		d.navigate().back();

		WebElement secondImage= d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/img"));
		if (secondImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The Image is BROKEN");
		}
		else {
			System.out.println("The Image is NOT BROKEN");

		}

	}

}
