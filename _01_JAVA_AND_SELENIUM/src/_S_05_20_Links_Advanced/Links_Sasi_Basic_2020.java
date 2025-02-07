package _S_05_20_Links_Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Sasi_Basic_2020 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver", "C:\WebDriver\geckodriver\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.leafground.com/pages/Link.html");*/

		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.leafground.com/pages/Link.html");


		WebElement GotoHomePage =d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/a"));
		GotoHomePage.click();
		d.navigate().back();
		Thread.sleep(1000);

		WebElement Findwhere = d.findElement(By.partialLinkText("Find where"));
		String where=Findwhere.getAttribute("href");
		System.out.println("This link is going to "+where);
		Thread.sleep(1000);

		WebElement Verifybroken=d.findElement(By.linkText("Verify am I broken?"));
		Verifybroken.click();
		String title =d.getTitle();
		if (title.contains("404")) {
			System.out.println("Yes the link is broken");

		}
		d.navigate().back();
		Thread.sleep(1000);

		WebElement GotoHomePage2 =d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/a"));
		GotoHomePage2.click();
		d.navigate().back();

		List<WebElement> linkCount= d.findElements(By.tagName("a"));
		int totalCount= linkCount.size();
		System.out.println("Total Count is " +totalCount);

	}

}
